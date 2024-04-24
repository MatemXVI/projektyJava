package org.example;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Bank pko = new Bank();
        BankAccount matemxvi = new BankAccount(1111, 1000, "MatemXVI", "matemxv@gmail.com", "1112224");
        BankAccount jana = new BankAccount(2222, 5426.74, "jana", "jana@gmail.com", "345654321");
        BankAccount andrzej123 = new BankAccount(5555, 0, "andrzej123", "andrzej123@wp.pl", "3333333");
        pko.addAccount(matemxvi.getAccountNumber(), matemxvi);
        pko.addAccount(jana.getAccountNumber(), jana);
        pko.addAccount(andrzej123.getAccountNumber(), andrzej123);
        pko.findAccount(1111);
        pko.allAccounts();
        matemxvi.deposit(1000);
        jana.withdraw(300);
        andrzej123.withdraw(100);
        pko.transactionAccounts(2222, 5555, 426.74);
        pko.allAccounts();

    }
}