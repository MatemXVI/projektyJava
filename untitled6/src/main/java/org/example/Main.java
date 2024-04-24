package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        boolean dodawanie = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zamówienie");
        Order order = new Order();
        while(dodawanie){
            System.out.print("Podaj nazwę produktu: ");
            String nazwa = scanner.nextLine();
            System.out.print("Podaj cenę(w zł): ");
            float cena = scanner.nextFloat();
            System.out.print("Podaj ilość: ");
            int ilosc = scanner.nextInt();
            Product product = new Product(nazwa, cena, ilosc);
            order.addToCart(product);
            System.out.println("Napisz 'ZAKUP', jeżeli chcesz zrealizować zamówienie");
            scanner.nextLine();
            String zakup = scanner.nextLine();
            zakup = zakup.toLowerCase();
            if(zakup.equals("zakup")){
                dodawanie = false;
            }
        }
        order.getProdukty();
        exit(1);
    }
}