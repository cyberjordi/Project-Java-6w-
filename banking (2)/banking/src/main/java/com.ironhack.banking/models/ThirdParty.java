package com.ironhack.banking.models;
import java.security.*;
import java.security.MessageDigest;

import jakarta.persistence.*;

@Entity
public class ThirdParty extends User{
    private String name;
    private String hashedKey;

    public ThirdParty(String name, String hashedKey) {
        this.name = name;
        this.hashedKey = hashedKey;
    }

    public ThirdParty() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHashedKey() {
        return hashedKey;
    }

    public void setHashedKey(String hashedKey) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(hashedKey.getBytes("UTF-8"));

        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }

        // Establecemos el valor de la propiedad hashedKey
        this.hashedKey = sb.toString();
    }


}
