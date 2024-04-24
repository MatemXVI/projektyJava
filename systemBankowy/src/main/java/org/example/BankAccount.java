package org.example;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean deposit(double deposit) {
        if(deposit > 0){
            balance += deposit;
            return true;
        }else{
            System.out.println("Wartość niepoprawna");
            return false;
        }
    }

    public boolean withdraw(double deposit) {
        if(deposit > 0 && balance >= deposit){
            balance -= deposit;
            return true;
        } else{
            System.out.println("Brak środków na koncie");
            return false;
        }
    }

    public void informationAccount(){
        System.out.println("Nr konta: " + accountNumber);
        System.out.println("Saldo: " + balance);
        System.out.println("Nazwa klienta: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Numer telefonu: " + phoneNumber);
        System.out.println("-----------");
    }




}
