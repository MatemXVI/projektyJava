package org.example;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            int maxValue = 50;
            Random random = new Random();
            HashSet<Integer> randomNumbers = new HashSet<>();
            for(int i = 1; i <=5; i++){
                int randomNumber;
                do{
                    randomNumber = random.nextInt(1, maxValue+1);
                }while(!randomNumbers.add(randomNumber));
            }
            Scanner scanner = new Scanner(System.in);
            HashSet<Integer> numbers = new HashSet<>();
            System.out.println("Witaj w loterii! Podaj 5 liczb z zakresu od 1 do 50");
            for(int i = 1; i <=5; i++){
                int number;
                System.out.println("Podaj liczbę nr " + i);
                number = scanner.nextInt();
                while(number < 1 || number >= maxValue){
                    System.out.println("Podaj liczbę z zakresu od 1 do 50.");
                    number = scanner.nextInt();
                }
                while(numbers.contains(number)){
                    System.out.println("Tą liczbę już podałeś!");
                    number = scanner.nextInt();
                }
                numbers.add(number);
            }
            int drawn = 0;
            System.out.println("Wylosowane liczby to: ");
            for (int randomNumber: randomNumbers) {
                System.out.print(randomNumber + " ");
            }
            System.out.println();
            System.out.println("Twoje liczby to: ");
            for (int number: numbers) {
                System.out.print(number + " ");
                if(randomNumbers.contains(number)){
                    drawn++;
                }
            }
            System.out.println();
            if(drawn <= 0){
                System.out.println("Nie trafiłeś żadnej liczby. Spróbuj jeszcze raz.");
            } else if (drawn >= 1 && drawn <= 4) {
                System.out.println("Brawo trafiłeś " + drawn + " razy.");
            }
            else if(drawn == 5){
                System.out.println("Trafiłeś " + drawn + "razy! Gratulacje!");
            }
        }

    }
}