package org.example;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    // Metoda do dodawania pracownika do firmy
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Metoda do usuwania pracownika z firmy
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // Metoda do wyświetlenia informacji o wszystkich pracownikach firmy
    public void displayEmployeesInfo() {
        for (Employee employee: employees) {
            employee.displayInfo();
        }

    }
}
