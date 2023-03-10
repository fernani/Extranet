package com.okmobility.connection.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
    public static void main(String[] args){
        var password = "123";
        System.out.println("password: " + password);
        System.out.println("password encriptado: " + encriptarPassword(password));
        
        
    }
    
    public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println("password: " + password);
        System.out.println("password encriptado: " + encriptarPassword(password));
        return encoder.encode(password);
    }
    
}
