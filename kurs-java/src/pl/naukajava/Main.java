package pl.naukajava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Party party = new Party();


        while (shouldContinue) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Wyjście");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGuestByPhoneNumber();
                case 5 -> shouldContinue = false;
                default -> System.out.println("Podaj numer od 0 do 5.");
            }
        }

        //losowanie liczby
/*        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed){
            System.out.println("Podaj liczbę");
            int userNumber = scanner.nextInt();

            if (userNumber < numberToGuess){
                System.out.println("Liczba jest za mała!");
            } else if (userNumber > numberToGuess) {
                System.out.println("Liczba jest za duża!");
            } else{
                System.out.println("Brawo, to jest wlaściwa liczba!");
                wasNumberGuessed = true;
            }
        }*/
        //FizzBuzz
/*        for(int i = 1; i <=100; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }*/
    }
}