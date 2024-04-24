package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");

        if (scanner.hasNextInt()) {
            int liczba = scanner.nextInt();
            System.out.println("Wczytana liczba: " + liczba);
        } else {
            System.out.println("To nie jest liczba całkowita!");
        }
    }
}