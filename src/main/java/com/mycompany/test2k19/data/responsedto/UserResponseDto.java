/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test2k19.data.responsedto;

import com.mycompany.test2k19.data.enums.Authority;

/**
 *
 * @author Pry
 */
public class UserResponseDto {
        
    private int id;
    
    private String email;
    
    private boolean isValidated;
    
    private String role;

    public UserResponseDto() {
    }

    public UserResponseDto(int id, String email, boolean isValidated, Authority role) {
        this.id = id;
        this.email = email;
        this.isValidated = isValidated;
        this.role = role.toString();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsValidated() {
        return isValidated;
    }

    public void setIsValidated(boolean isValidated) {
        this.isValidated = isValidated;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
