/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test2k19.service.impl;

import com.mycompany.test2k19.data.domain.User;
import com.mycompany.test2k19.data.requestdto.RegistrationDto;
import com.mycompany.test2k19.exceptions.ExistsException;
import com.mycompany.test2k19.exceptions.UserDeletedException;
import com.mycompany.test2k19.repository.UserRepository;
import com.mycompany.test2k19.service.UserService;
import java.security.SecureRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Prynerd
 */
@Service
public class UserServiceImpl implements UserService{
    
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
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
    
    @Override
    @Transactional
    public void CreateUser(RegistrationDto rDto){
        if(userRepository.existsByEmail(rDto.getEmail())){
            throw new ExistsException("emailAlreadyExists");
        }
        User user = new User(
                rDto.getNickName(), 
                rDto.getEmail(), 
                rDto.getFirstName(),
                rDto.getLastName(), 
                passwordEncoder.encode(rDto.getPassword()), 
                validationTokenGeneration());
        
        userRepository.save(user);
    }
    
    @Override
    public String validationTokenGeneration() {

        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        String token = bytes.toString();

        return token;
    }
    
}
