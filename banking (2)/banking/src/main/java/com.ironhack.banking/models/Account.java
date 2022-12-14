package com.ironhack.banking.models;


import jakarta.persistence.*;

import java.math.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    private BigDecimal balance;
    private String primaryOwner;
    private String secondaryOwner;
    private BigDecimal penaltyFee = BigDecimal.valueOf(40);
    @ManyToOne
    @JoinColumn(name = "account_id")
    private User user;

    public Account(BigDecimal balance, String primaryOwner, String secondaryOwner, User user) {
        this.balance = balance;
        this.primaryOwner = primaryOwner;
        this.secondaryOwner = secondaryOwner;
        this.user = user;
    }

    public Account(BigDecimal balance, String primaryOwner, User user) {
        this.balance = balance;
        this.primaryOwner = primaryOwner;
        this.user = user;
    }
    public Account() {
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getPrimaryOwner() {
        return primaryOwner;
    }

    public void setPrimaryOwner(String primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public String getSecondaryOwner() {
        return secondaryOwner;
    }

    public void setSecondaryOwner(String secondaryOwner) {
        this.secondaryOwner = secondaryOwner;
    }

    public BigDecimal getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(BigDecimal penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
