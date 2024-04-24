package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz operację:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");

        System.out.print("Twój wybór: ");
        int choice = scanner.nextInt();

        System.out.print("Wprowadź pierwszą liczbę: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Wprowadź drugą liczbę: ");
        double secondNumber = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Wynik: " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Wynik: " + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.println("Wynik: " + (firstNumber * secondNumber));
                break;
            case 4:
                if (secondNumber == 0) {
                    System.out.println("Błąd: Dzielenie przez zero!");
                } else {
                    System.out.println("Wynik: " + (firstNumber / secondNumber));
                }
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
        }
    }
}