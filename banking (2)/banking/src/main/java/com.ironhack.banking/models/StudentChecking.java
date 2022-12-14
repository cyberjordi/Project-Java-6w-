package com.ironhack.banking.models;


import com.ironhack.banking.enums.*;
import jakarta.persistence.*;

import java.math.*;
import java.util.*;

@Entity
public class StudentChecking extends Account {
    private String secretKey;
    private Date creationDate = new Date();
    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    public StudentChecking(BigDecimal balance, String primaryOwner, String secondaryOwner, User user, String secretKey) {
        super(balance, primaryOwner, secondaryOwner, user);
        this.secretKey = secretKey;
    }

    public StudentChecking(BigDecimal balance, String primaryOwner, User user, String secretKey) {
        super(balance, primaryOwner, user);
        this.secretKey = secretKey;
    }

    public StudentChecking() {
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
