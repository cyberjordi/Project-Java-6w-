package com.ironhack.banking.models;

import com.ironhack.banking.enums.*;
import jakarta.persistence.*;


import java.math.*;
import java.util.*;

@Entity
public class Savings extends Account {

    private String secretKey;
    private BigDecimal minimumBalance = BigDecimal.valueOf(1000);
    private Date creationDate = new Date();
    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;
    private BigDecimal interestRate = BigDecimal.valueOf(0.0025);

    public Savings(BigDecimal balance, String primaryOwner, String secondaryOwner, User user, String secretKey) {
        super(balance, primaryOwner, secondaryOwner, user);
        this.secretKey = secretKey;
    }

    public Savings(BigDecimal balance, String primaryOwner, User user, String secretKey) {
        super(balance, primaryOwner, user);
        this.secretKey = secretKey;
    }

    public Savings() {
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
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

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public long getUserId() {
        return id;
    }

}
