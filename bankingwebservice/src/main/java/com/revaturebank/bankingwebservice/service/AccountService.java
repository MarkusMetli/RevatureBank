package com.revaturebank.bankingwebservice.service;

import java.security.Principal;

import com.revaturebank.bankingwebservice.domain.PrimaryAccount;
import com.revaturebank.bankingwebservice.domain.PrimaryTransaction;
import com.revaturebank.bankingwebservice.domain.SavingsAccount;
import com.revaturebank.bankingwebservice.domain.SavingsTransaction;



public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    

}
