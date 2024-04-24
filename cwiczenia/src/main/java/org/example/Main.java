package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Rectangle
//        Rectangle prostokat1 = new Rectangle(5, 4);
//        Rectangle rectangle1 = new Rectangle(3, 3);
//        double area1 = rectangle1.calculateArea();
//        double perimeter1 = rectangle1.calculatePerimeter();
//        boolean isSquare1 = rectangle1.isSquare();
//
//        System.out.println("Pole powierzchni prostokąta 1: " + area1);
//        System.out.println("Obwód prostokąta 1: " + perimeter1);
//        System.out.println("Czy prostokąt 1 jest kwadratem? " + isSquare1);

        // BankAccount
//        BankAccount janusz = new BankAccount("0000", 10000, "Janusz");
//        BankAccount grazyna = new BankAccount("0001", 500, "Grażyna");
//        BankAccount sasiad = new BankAccount("0002", 95000, "Andrzej");
//
//        janusz.transfer(grazyna, 10500);
//        janusz.displayInfo();
//        grazyna.displayInfo();
//        sasiad.deposit(5000);
//        sasiad.withdraw(20000);
//        sasiad.displayInfo();

        // Employee Company
//        Employee employee1 = new Employee("Jan", "Kowalski", 2017, "Kierownik", 3000);
//        Employee employee2 = new Employee("Anna", "Nowak", 2015, "Brygadzistka", 4000);
//        Employee employee3 = new Employee("Andrzej", "Kowalczyk", 2012, "Inżynier", 5500);
//        Company firma = new Company("Firma");
//        firma.addEmployee(employee1);
//        firma.addEmployee(employee2);
//        firma.addEmployee(employee3);
//        firma.displayEmployeesInfo();
        ArrayList<Integer> liczby = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilośc liczb całkowitych: ");
        int rozmiarListy = scanner.nextInt();
        for(int i = 1; i <= rozmiarListy; i++){
            System.out.print("Podaj " + i + " liczbę: ");
            int liczba = scanner.nextInt();
            liczby.add(liczba);
        }
        Comparator<Integer> komparatorMalejący = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        Collections.sort(liczby, );
        int min = liczby.get(0);
        Collections.sort(liczby,komparatorMalejący);
        int max = liczby.get(0);
        System.out.println("Najmniejsza liczba: " + min);
        System.out.println("Najmniejsza liczba: " + max);
    }
}