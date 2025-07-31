package com.lina.business.business_management.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.lina.business.business_management.entities.Feature;
import com.lina.business.business_management.entities.Role;
import com.lina.business.business_management.entities.User;
import com.lina.business.business_management.entities.repositories.FeatureRepository;
import com.lina.business.business_management.entities.repositories.RoleRepository;
import com.lina.business.business_management.entities.repositories.UserRepository;
import com.lina.business.business_management.utils.ModuleApp;

@Component
public class UserInitialiser implements CommandLineRunner{

    @Autowired
    private PasswordEncoder encoder ;
    private final UserRepository userRepositories;
    private final RoleRepository roleRepository;
    private final FeatureRepository featureRepository;
    public UserInitialiser(UserRepository userRepositories,RoleRepository roleRepository,FeatureRepository featureRepository){
        this.userRepositories = userRepositories;
        this.roleRepository = roleRepository;
        this.featureRepository = featureRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Role role = new Role();
        role.setName("USER");
        role = roleRepository.save(role);


        User user = new User();
        user.setUsername("lina");
        user.setPassword(encoder.encode("cmcm"));
        user.addRoles(role);
        userRepositories.save(user);

        Feature feature = new Feature();
        feature.setModule(ModuleApp.ACCOUNT_MANAGEMENT.getLabel());
        feature.setLink("/account");
        feature.setName("My Account");
        feature.addRoles(role);
        featureRepository.save(feature);

    }
    
}
