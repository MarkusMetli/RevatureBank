package com.revaturebank.bankingwebservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.revaturebank.bankingwebservice.domain.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}