package com.lina.business.business_management.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.lina.business.business_management.entities.Menu;
import com.lina.business.business_management.entities.Role;
import com.lina.business.business_management.entities.User;
import com.lina.business.business_management.entities.repositories.MenuRepository;
import com.lina.business.business_management.entities.repositories.RoleRepository;
import com.lina.business.business_management.entities.repositories.UserRepository;
import com.lina.business.business_management.utils.ModuleApp;

@Component
public class UserInitialiser implements CommandLineRunner{

    @Autowired
    private PasswordEncoder encoder ;
    private final UserRepository userRepositories;
    private final RoleRepository roleRepository;
    private final MenuRepository menuRepository;
    public UserInitialiser(UserRepository userRepositories,RoleRepository roleRepository,MenuRepository menuRepository){
        this.userRepositories = userRepositories;
        this.roleRepository = roleRepository;
        this.menuRepository = menuRepository;
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

        Menu menu = new Menu();
        menu.setModule(ModuleApp.ACCOUNT_MANAGEMENT.getLabel());
        menu.setLink("/account");
        menu.setName("My Account");
        menu.addRoles(role);
        menuRepository.save(menu);

    }
    
}
