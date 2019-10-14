/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test2k19.controllers;

import com.mycompany.test2k19.data.requestdto.RegistrationDto;
import com.mycompany.test2k19.service.impl.UserServiceImpl;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Prynerd
 */
@RestController
public class UserController {
    
    private UserServiceImpl userServiceImpl;
    
    @Autowired
    public UserController(UserServiceImpl userServiceImpl){
        this.userServiceImpl = userServiceImpl;
    }
    
    @PostMapping("/registration")
    public void registration (@Valid @RequestBody RegistrationDto rDto){
        
        userServiceImpl.CreateUser(rDto);
        
    }
    
}
