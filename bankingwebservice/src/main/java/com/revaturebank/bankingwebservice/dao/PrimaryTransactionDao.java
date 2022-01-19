package com.revaturebank.bankingwebservice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.revaturebank.bankingwebservice.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
