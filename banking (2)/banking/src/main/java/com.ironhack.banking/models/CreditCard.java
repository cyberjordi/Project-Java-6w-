package com.ironhack.banking.models;

import jakarta.persistence.*;

import java.math.*;

@Entity
public class CreditCard extends Account{
    private BigDecimal interestRate = BigDecimal.valueOf(0.2);
    private BigDecimal creditLimit = BigDecimal.valueOf(100);

    public CreditCard(BigDecimal balance, String primaryOwner, String secondaryOwner, User user) {
        super(balance, primaryOwner, secondaryOwner, user);
    }

    public CreditCard(BigDecimal balance, String primaryOwner, User user) {
        super(balance, primaryOwner, user);
    }

    public CreditCard() {
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }
}
