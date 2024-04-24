package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book potter = new Book("Harry Potter i Komnata Tajemnic", "J.K. Rowling", 2002);
        Book rings = new Book("Władca Pierścieni", "Tolkien", 1969);
        Book animals = new Book("Folwark Zwierzęcy", "George Orwell", 1964);
        Library biblioteka = new Library();
        biblioteka.addBook(potter);
        biblioteka.addBook(rings);
        biblioteka.addBook(animals);
        biblioteka.removeBook("Folwark Zwierzęcy");
        biblioteka.showBooks();
        System.out.println("Podaj autora");
        String author=scanner.nextLine();
        biblioteka.searchBookAuthor(author);
        scanner.close();
    }
}