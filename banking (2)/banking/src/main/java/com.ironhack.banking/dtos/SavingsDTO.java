package com.ironhack.banking.dtos;


import lombok.*;

import java.math.BigDecimal;

@Data
public class SavingsDTO {
    //BigDecimal balance, String primaryOwner, String secondaryOwner, String userId, String secretKey
    private BigDecimal balance;
    private String primaryOwner;
    private String secondaryOwner;
    private Long userId;
    private String secretKey;
}
