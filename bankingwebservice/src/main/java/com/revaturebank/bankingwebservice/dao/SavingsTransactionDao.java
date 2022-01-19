package com.revaturebank.bankingwebservice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.revaturebank.bankingwebservice.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}