package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        Employee employee1 = new Employee(1, "Jan", "Księgowy");
        Employee employee2 = new Employee(2, "Marek", "Obsługa");
        Employee employee3 = new Employee(3, "Danuta", "Woźna");
        system.addEmployee(employee1);
        system.addEmployee(employee2);
        system.addEmployee(employee3);
        system.removeEmployee(2);
        system.findEmployee(1);
        system.findEmployee(3);
    }
}