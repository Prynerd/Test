/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test2k19.data.enums;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Prynerd
 */
public enum Authority implements GrantedAuthority{

    ADMIN, COSTUMER;

    @Override
    public String getAuthority() {
        return "ROLE_" + toString();
    }
    
}
