package org.example;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String ownerName;

    // Konstruktor

    public BankAccount(String accountNumber, int balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    // Metoda do wpłacenia środków na konto
    public void deposit(double amount) {
        balance += amount;
    }

    // Metoda do wypłacenia środków z konta
    public void withdraw(double amount) {
        if(amount > balance){
            System.out.println("Nie masz wystarczających środków na koncie");
        }else {
            balance -= amount;
        }
    }

    // Metoda do sprawdzenia salda na koncie
    public int getBalance() {
        return balance;
    }

    // Metoda do wyświetlenia informacji o koncie
    public void displayInfo() {
        System.out.println(ownerName + ": ");
        System.out.println("Twój numer konta to: " + accountNumber );
        System.out.println("Masz: " + getBalance() + " zł na koncie. ");
    }

    // Metoda do przelania środków na inne konto
    public void transfer(BankAccount recipientAccount, double amount) {
        withdraw(amount);
        recipientAccount.deposit(amount);
    }

}
