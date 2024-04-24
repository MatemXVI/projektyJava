package org.example;

import java.util.HashMap;

public class EmployeeManagementSystem {
    HashMap<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee){
        employees.put(employee.getId(), employee);
    }

    public void removeEmployee(int id){
        employees.remove(id);
    }

    public void findEmployee(int id){
        Employee employee = employees.get(id);
        employee.getEmployee();
    }
}
