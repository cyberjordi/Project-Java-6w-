package com.ironhack.banking.services.interfaces;

import com.ironhack.banking.dtos.SavingsDTO;
import com.ironhack.banking.models.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

public interface AccountServiceInt {
    Savings addSavingsAccount(SavingsDTO savings);

}
