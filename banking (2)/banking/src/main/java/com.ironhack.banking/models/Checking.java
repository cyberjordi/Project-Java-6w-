package com.ironhack.banking.models;


import com.ironhack.banking.enums.*;
import jakarta.persistence.*;

import java.math.*;
import java.util.*;

@Entity
public class Checking extends Account{
    private String secretKey;
    private BigDecimal minimumBalance = BigDecimal.valueOf(250);
    private BigDecimal monthlyMaintenanceFee = BigDecimal.valueOf(12);
    private Date creationDate = new Date();
    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    public Checking(BigDecimal balance, String primaryOwner, String secondaryOwner, User user, String secretKey) {
        super(balance, primaryOwner, secondaryOwner, user);
        this.secretKey = secretKey;
    }

    public Checking(BigDecimal balance, String primaryOwner, User user, String secretKey) {
        super(balance, primaryOwner, user);
        this.secretKey = secretKey;
    }

    public Checking() {
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

    public BigDecimal getMonthlyMaintenanceFee() {
        return monthlyMaintenanceFee;
    }

    public void setMonthlyMaintenanceFee(BigDecimal monthlyMaintenanceFee) {
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
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
