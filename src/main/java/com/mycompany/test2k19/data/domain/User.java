/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test2k19.data.domain;

import com.mycompany.test2k19.data.enums.Authority;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Prynerd
 */
@Entity
@Table(name= "tbl_user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(unique = true)
    private String nickName;
    
    @Column(unique = true, nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String password;
    
    @Enumerated(EnumType.STRING)
    private Authority authority;
    
    private String firstName;
    
    private String lastName;
    
    private LocalDateTime registrationTime;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;
    
    private String validateToken;
    
    private boolean isValidated;
    
    private boolean isDeleted;
    
    public User(){
        
    }

    public User(String nickName, String email, String firstName, String lastName) {
        this.nickName = nickName;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        
        this.authority = Authority.COSTUMER;
        this.isDeleted = false;
        this.isValidated = false;
        this.registrationTime = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Authority getAuthority() {
        return authority;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getRegistrationTime() {
        return registrationTime;
    }

    public Address getAddress() {
        return address;
    }

    public String getValidateToken() {
        return validateToken;
    }

    public boolean isIsValidated() {
        return isValidated;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setIsValidated(boolean isValidated) {
        this.isValidated = isValidated;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    
    
}
