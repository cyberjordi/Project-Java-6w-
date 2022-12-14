package com.ironhack.banking.controllers;

import com.ironhack.banking.dtos.SavingsDTO;
import com.ironhack.banking.models.Savings;
import com.ironhack.banking.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    private Savings addSavingsAccount(@RequestBody SavingsDTO savings){
        return accountService.addSavingsAccount(savings);
    }
}
