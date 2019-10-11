/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test2k19.service.impl;

import com.mycompany.test2k19.data.domain.User;
import com.mycompany.test2k19.exceptions.UserDeletedException;
import com.mycompany.test2k19.repository.UserRepository;
import com.mycompany.test2k19.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author Prynerd
 */
public class UserServiceImpl implements UserService{
    
    private UserRepository userRepository;
    
    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(string).orElseThrow(()-> new UsernameNotFoundException("User not found"));
        if(user.isDeleted()){
            throw new UserDeletedException("accountDeleted");
        } else {
            return user;
        }
    }
    
}
