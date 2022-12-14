package com.ironhack.banking.repositories;

import com.ironhack.banking.models.Checking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface CheckingRepository extends JpaRepository<Checking, Long> {
}
