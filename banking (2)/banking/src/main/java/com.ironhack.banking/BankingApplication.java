package com.ironhack.banking;

import com.ironhack.banking.enums.Status;
import com.ironhack.banking.models.*;
import com.ironhack.banking.models.embedded.Address;
import com.ironhack.banking.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class BankingApplication implements CommandLineRunner {

	@Autowired
	AccountHolderRepository accountHolderRepository;

	@Autowired
	AdminRepository adminRepository;

	@Autowired
	ThirdPartyRepository thirdPartyRepository;

	@Autowired
	StudentCheckingRepository studentCheckingRepository;

	@Autowired
	CheckingRepository checkingRepository;

	@Autowired
	SavingsRepository savingsRepository;

	@Autowired
	CreditCardRepository creditCardRepository;

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		AccountHolder aH1 = accountHolderRepository.save(new AccountHolder("Jordi", "22-4-1995", new Address("Calle Barcelona", "Sant Feliu", "Spain", "17220"), "jordi@ironhack.com"));
		AccountHolder aH2 = accountHolderRepository.save(new AccountHolder("Antonio", "22-4-1995", new Address("Calle Girona", "Gerona", "Spain", "23105"), "Antonio@ironhack.com"));

		Admin admin1 = adminRepository.save(new Admin("Admin1"));
		Admin admin2 = adminRepository.save(new Admin("Admin2"));

		ThirdParty thirdP1 = thirdPartyRepository.save(new ThirdParty("Juan","Hello234"));
		ThirdParty thirdP2 = thirdPartyRepository.save(new ThirdParty("Jaime","Hell234"));

		Checking checkAccount1 = checkingRepository.save(new Checking(BigDecimal.valueOf(2400), "Jordi", "Anthony", aH1, "hg47ajuf"));
		Checking checkAccount2 = checkingRepository.save(new Checking(BigDecimal.valueOf(1500), "Maria", thirdP2, "hg47ajuf"));
		Checking checkAccount3 = checkingRepository.save(new Checking(BigDecimal.valueOf(955), "Manuel", "Jose", aH2, "hg47ajuf"));

		Savings saving1 = savingsRepository.save(new Savings(BigDecimal.valueOf(1200), "Pepe", admin1, "Zxg389whjef"));

	}
}
