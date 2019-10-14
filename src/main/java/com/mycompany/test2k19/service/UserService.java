/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test2k19.service;

import com.mycompany.test2k19.data.requestdto.RegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Prynerd
 */
public interface UserService extends UserDetailsService{
    
    void CreateUser(RegistrationDto rDto);
    
    public String validationTokenGeneration();
    
}
