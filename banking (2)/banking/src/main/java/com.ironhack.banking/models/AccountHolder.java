package com.ironhack.banking.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ironhack.banking.models.embedded.Address;
import jakarta.persistence.*;

import java.util.*;


@Entity
public class AccountHolder extends User{
    private String name;
    private String dateOfBirth;
    private Address address;
    private String email;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Account> accounts;

    public AccountHolder(String name, String dateOfBirth, Address address, String email, List<Account> accounts) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.email = email;
        this.accounts = accounts;
    }

    public AccountHolder(String name, String dateOfBirth, Address address, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.email = email;
    }

    public AccountHolder(String name, String dateOfBirth, Address address, List<Account> accounts) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.accounts = accounts;
    }

    public AccountHolder(String name, String dateOfBirth, Address address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public AccountHolder() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}
