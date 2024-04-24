package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int wylosowana_liczba = random.nextInt(1, 100);
        boolean czyWylosowana = false;
        while(!czyWylosowana) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę z zakresu od 1 do 100");
            int liczba = scanner.nextInt();
            if (liczba < wylosowana_liczba) {
                System.out.println("Liczba jest za mała");
            } else if (liczba > wylosowana_liczba) {
                System.out.println("Liczba jest za duża");
            }else {
                System.out.println("Brawo to jest ta liczba!");
                czyWylosowana = true;
            }
        }
    }
}