package com.lina.business.business_management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lina.business.business_management.entities.repositories.UserRepositories;

@Service
public class UsersService implements UserDetailsService
{

    @Autowired
    private UserRepositories userRepositories;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepositories.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("Username or password is incorrect"));
        
    }

}
