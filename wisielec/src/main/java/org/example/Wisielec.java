package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Wisielec {
    String word = "kot"; // jedno z wybranych słów
    char[] userWord; // słowo które utworzy użytkownik z liter
    int lives = 3; // ilość żyć

    public void play(){ // uruchomienie gry
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start gry");

        userWord = new char[word.length()]; // ile liter ma słowo
        Arrays.fill(userWord, '_'); //dodanie kresek do słowa

        while(!gameEnded()){
            System.out.println(userWord);
            System.out.println();
            System.out.println("Podaj kolejną literę: ");
            System.out.println("Pozostało żyć: " + lives);

            char letter = scanner.nextLine().charAt(0); //podana litera

            checkletter(letter); //sprawdź literę
        }

        if(lives == 0){
            System.out.println("Niestety nie udało ci się wygrać :(");
        }else{
            System.out.println("Brawo, udało Ci się odgadnąć wylosowane słowo!");
        }

        scanner.close();
    }

    private void checkletter(char letter) { //sprawdzanie litery
        boolean foundLetter = false; //czy znaleziona litera
        for (int i=0; i<word.length(); i++){ //sprawdzanie litery
            if (word.charAt(i) == letter){ //jeżeli litera istnieje w wyrazie
                userWord[i] = letter; // dodaj litery do wyrazu
                foundLetter = true;
            }
        }

        if(!foundLetter){
            System.out.println("Niestety nie ma takiej litery :(");
            lives--;
        }
    }

    private boolean gameEnded() {
        return lives == 0 || word.equals(String.valueOf(userWord));
    }
}
