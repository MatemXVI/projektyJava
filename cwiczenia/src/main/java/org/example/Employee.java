package org.example;

public class Employee {
    private String firstName;
    private String lastName;
    private int hiringYear;
    private String position;
    private double monthlySalary;

    public Employee(String firstName, String lastName, int hiringYear, String position, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiringYear = hiringYear;
        this.position = position;
        this.monthlySalary = monthlySalary;
    }

    // Metoda do obliczenia rocznego wynagrodzenia pracownika
    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    // Metoda do obliczenia stażu pracy pracownika
    public int calculateYearsOfService(int currentYear) {
        return currentYear - hiringYear;
    }

    // Metoda do wyświetlenia informacji o pracowniku
    public void displayInfo() {
        System.out.println("Imię i nazwisko: " + firstName + " " + lastName);
        System.out.println("Rok zatrudnienia: " + hiringYear);
        System.out.println("Zatrudnienie: " + position);
        System.out.println("Pensja: " + monthlySalary);
        System.out.println();
    }
}