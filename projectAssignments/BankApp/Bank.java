package BankApp;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance(int accountNo) throws AccountNotFoundException {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNo) {
                System.out.println("\nAccount Number : " + account.getAccountNumber());
                System.out.println("Account Holder : " + account.getAccountHolderName());
                System.out.println("Account Type   : " + account.getAccountType());
                System.out.println("Balance        : Rs." + account.getBalance());
                return;
            }
        }
        throw new AccountNotFoundException("Account Not Found");
    }

    public void transferAmount(int senderAccNo, int receiverAccNo, double amount) 
            throws AccountNotFoundException, InsufficientBalanceException {
        
        BankAccount senderAccount = null;
        BankAccount receiverAccount = null;

        // Find sender and receiver accounts
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == senderAccNo) {
                senderAccount = account;
            }
            if (account.getAccountNumber() == receiverAccNo) {
                receiverAccount = account;
            }
        }

        if (senderAccount == null || receiverAccount == null) {
            throw new AccountNotFoundException("Account Not Found");
        }

        if (senderAccount.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        // Deduct from sender and add to receiver
        senderAccount.setBalance(senderAccount.getBalance() - amount);
        receiverAccount.setBalance(receiverAccount.getBalance() + amount);

        // Create and display transaction details
        Transaction transaction = new Transaction(senderAccNo, receiverAccNo, amount);
        transaction.displayTransaction();
        System.out.println("Transfer Successful");
    }

    public void displayAllAccounts() {
        System.out.println("\n===== ALL ACCOUNTS =====");
        for (BankAccount account : accounts) {
            System.out.println("Account Number : " + account.getAccountNumber());
            System.out.println("Account Holder : " + account.getAccountHolderName());
            System.out.println("Account Type   : " + account.getAccountType());
            System.out.println("Balance        : Rs." + account.getBalance());
            System.out.println("----------------------");
        }
    }
}
