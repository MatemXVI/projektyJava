package org.example;

import java.util.Collection;
import java.util.HashMap;

public class Bank {
    HashMap<Integer, BankAccount> bank = new HashMap<>();

    public void addAccount (int accountNumber, BankAccount account){
        if(!bank.containsKey(accountNumber)){
            bank.put(accountNumber, account);
        }else{
            System.out.println("To konto już istnieje!");
        }
    }
    public void removeAccount (int accountNumber){
        if(bank.containsKey(accountNumber)){
            bank.remove(accountNumber);
        }else{
            System.out.println("Nie ma takiego konta!");
        }
    }

    public void findAccount(int accountNumber){
        if(bank.containsKey(accountNumber)){
            bank.get(accountNumber).informationAccount();
        }else{
            System.out.println("Nie ma takiego konta!");
        }
    }

    public boolean transactionAccounts(int accountNumber1, int accountNumber2, double deposit) {
        BankAccount account1 = bank.get(accountNumber1);
        BankAccount account2 = bank.get(accountNumber2);
        if (account1 == null || account2 == null) {
            System.out.println("Jedno z kont nie istnieje.");
            return false;
        }
        if(!account1.withdraw(deposit)){
            return false;
        }
        if (!account2.deposit(deposit)) {
            return false;
        }
            return true;
        }
    public void allAccounts(){
        Collection<BankAccount> accounts = bank.values();
        for (BankAccount account : accounts){
            account.informationAccount();
        }
    }
}

