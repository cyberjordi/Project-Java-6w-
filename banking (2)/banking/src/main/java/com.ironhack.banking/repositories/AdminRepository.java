package com.ironhack.banking.repositories;

import com.ironhack.banking.models.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
