package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        while(true){
            System.out.print("Podaj liczbę całkowitą: ");
            int n = scanner.nextInt();
            if(n < 0){
                System.out.println("Nie podałeś liczby całkowitej");
                continue;
            }
            if(n == 0){
                if(i==0){
                    System.out.println("Nie podałeś żadnej liczby");
                    continue;
                } else if (i == 1) {
                    System.out.println("Aby obliczyć średnią musisz podać jeszcze jedną liczbę");
                    continue;
                }
                break;
                }
            sum += n;
            i++;
        }
        float avg = (float) sum / i;
        System.out.println("Średnia arytmetyczna wynosi: " + avg);
    }
}