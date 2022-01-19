package com.revaturebank.bankingwebservice.service;

import java.security.Principal;
import java.util.List;

import com.revaturebank.bankingwebservice.domain.PrimaryAccount;
import com.revaturebank.bankingwebservice.domain.PrimaryTransaction;
import com.revaturebank.bankingwebservice.domain.Recipient;
import com.revaturebank.bankingwebservice.domain.SavingsAccount;
import com.revaturebank.bankingwebservice.domain.SavingsTransaction;



public interface TransactionService {
	List<PrimaryTransaction> findPrimaryTransactionList(String username);

    List<SavingsTransaction> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);
    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);   
    void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);
    void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);
    void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;
    
    List<Recipient> findRecipientList(Principal principal);

    Recipient saveRecipient(Recipient recipient);

    Recipient findRecipientByName(String recipientName);

    void deleteRecipientByName(String recipientName);
    
    void toSomeoneElseTransfer(Recipient recipient, String accountType, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount);
}
