/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test2k19.data.responsedto;

/**
 *
 * @author Pry
 */
public class ApiError {
    
    private int code;
    private String status;
    private String error;
    
    public ApiError() {
        
    }

    public ApiError(int code, String status, String error) {
        this.code = code;
        this.status = status;
        this.error = error;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String errors) {
        this.error = errors;
    }
    
}