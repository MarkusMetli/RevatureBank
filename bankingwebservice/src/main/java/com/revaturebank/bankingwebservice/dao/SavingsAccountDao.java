package com.revaturebank.bankingwebservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.revaturebank.bankingwebservice.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}
