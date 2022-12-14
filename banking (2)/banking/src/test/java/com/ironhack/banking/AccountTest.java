
package com.ironhack.banking;

import com.ironhack.banking.enums.Status;
import com.ironhack.banking.models.*;

import com.ironhack.banking.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.math.BigDecimal;
import java.util.*;

@SpringBootTest
public class AccountTest {

    @Autowired
    StudentCheckingRepository studentCheckingRepository;

    @Autowired
    CheckingRepository checkingRepository;

    @Autowired
    SavingsRepository savingsRepository;

    @Autowired
    CreditCardRepository creditCardRepository;

    List<StudentChecking> studentCheckingAccounts;
    List<Checking> checkingAccounts;
    List<Savings> savingsAccounts;
    List<CreditCard> creditCardAccounts;

/*
    @BeforeEach
    void setUp(){
        studentCheckingAccounts = studentCheckingRepository.saveAll(
                List.of(
                        new StudentChecking(BigDecimal.valueOf(2300), "Jose", "Antonio", BigDecimal.valueOf(40), "h316ha73", Status.ACTIVE),
                        new StudentChecking(BigDecimal.valueOf(1300), "Jordi", "David", BigDecimal.valueOf(40), "jKL1m6a14", Status.ACTIVE),
                        new StudentChecking(BigDecimal.valueOf(1300), "Antonio", BigDecimal.valueOf(40), "AD5gha73", Status.ACTIVE)
                )
        );
        checkingAccounts = checkingRepository.saveAll(
                List.of(
                        new Checking(BigDecimal.valueOf(800), "Edu", "Antonio", BigDecimal.valueOf(40), "h316ha73", BigDecimal.valueOf(100), BigDecimal.valueOf(300), Status.ACTIVE),
                        new Checking(BigDecimal.valueOf(800), "Edu", "Antonio", BigDecimal.valueOf(40), "h316ha73", BigDecimal.valueOf(100), BigDecimal.valueOf(300), Status.ACTIVE),
                        new Checking(BigDecimal.valueOf(800), "Edu", "Antonio", BigDecimal.valueOf(40), "h316ha73", BigDecimal.valueOf(100), BigDecimal.valueOf(300), Status.ACTIVE)
                )
        );
        savingsAccounts = savingsRepository.saveAll(
                List.of(
                        new Savings(BigDecimal.valueOf(200), "Juan", "Anna", BigDecimal.valueOf(40), "L43y8ga78", BigDecimal.valueOf(100), Status.ACTIVE, BigDecimal.valueOf(0.025)),
                        new Savings(BigDecimal.valueOf(200), "Pepe", "Anna", BigDecimal.valueOf(40), "L43y8ga78", BigDecimal.valueOf(100), Status.ACTIVE, BigDecimal.valueOf(0.025)),
                        new Savings(BigDecimal.valueOf(200), "Anna", "Anna", BigDecimal.valueOf(40), "L43y8ga78", BigDecimal.valueOf(100), Status.ACTIVE, BigDecimal.valueOf(0.025))
                )
        );
        creditCardAccounts = creditCardRepository.saveAll(
                List.of(
                        new CreditCard(BigDecimal.valueOf(2500), "Manuel", "Rosa", BigDecimal.valueOf(40), BigDecimal.valueOf(0.025), BigDecimal.valueOf(250)),
                        new CreditCard(BigDecimal.valueOf(2500), "Raul", "Rosa", BigDecimal.valueOf(40), BigDecimal.valueOf(0.025), BigDecimal.valueOf(250)),
                        new CreditCard(BigDecimal.valueOf(2500), "Pedro", "Rosa",)
                )
        );
    }

    @AfterEach
    void tearDown(){
        studentCheckingRepository.deleteAll(studentCheckingAccounts);
        checkingRepository.deleteAll(checkingAccounts);
        savingsRepository.deleteAll(savingsAccounts);
        creditCardRepository.deleteAll(creditCardAccounts);
    }
*/
    @Test
    void shouldCreateStudentCheckingAccounts(){
      //  Assertions.assertEquals(3, studentCheckingRepository.findAll().size());
    }

    @Test
    void shouldCreateCheckingAccounts(){
      //  Assertions.assertEquals(6, checkingRepository.findAll().size());
    }

}
