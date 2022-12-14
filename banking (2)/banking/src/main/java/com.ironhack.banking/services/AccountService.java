package com.ironhack.banking.services;

import com.ironhack.banking.dtos.SavingsDTO;
import com.ironhack.banking.models.*;
import com.ironhack.banking.repositories.*;
import com.ironhack.banking.services.interfaces.AccountServiceInt;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.*;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;

@Service
public class AccountService implements AccountServiceInt {

    @Autowired
    CheckingRepository checkingRepository;

    @Autowired
    StudentCheckingRepository studentCheckingRepository;

    @Autowired
    AccountHolderRepository accountHolderRepository;
    @Autowired
    private SavingsRepository savingsRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public Savings addSavingsAccount(SavingsDTO savings) {

        AccountHolder accountHolder1 = accountHolderRepository.findById(savings.getUserId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "El Usuario no existe"));
        return savingsRepository.save(new Savings(savings.getBalance(), savings.getPrimaryOwner(), savings.getSecondaryOwner(), accountHolder1, savings.getSecretKey()));
    }
}
