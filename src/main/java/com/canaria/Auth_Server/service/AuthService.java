package com.canaria.Auth_Server.service;


import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class AuthService {

    public String encrypt (String password) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());

        return bytesToHex(md.digest());
    }

    private String bytesToHex (byte[] bytes){
        StringBuilder builder = new StringBuilder();

        for(byte b : bytes){
            builder.append(String.format("%02x",b));
        }

        return builder.toString();
    }

}
