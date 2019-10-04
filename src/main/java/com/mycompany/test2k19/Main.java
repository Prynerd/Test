package com.mycompany.test2k19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Prynerd
 */
@SpringBootApplication
@ComponentScan("com.mycompany.test2k19")
public class Main {

    public static void main(String[] args) {
        
        SpringApplication.run(Main.class, args);
        
    }
    
    
}
