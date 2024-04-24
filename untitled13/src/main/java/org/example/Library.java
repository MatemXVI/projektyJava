package org.example;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook (Book book){
        books.add(book);
    }
    public void removeBook (String title){
        books.removeIf(book -> book.getTitle().equals(title));
    }

    public void showBooks(){
        for (Book book : books){
            System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYear());
        }
    }

    public void searchBookAuthor(String author){
        boolean bookFounded = false;
        for (Book book: books){
            if(book.getAuthor().equals(author)){
                System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYear());
                bookFounded = true;
            }
        }
        if(!bookFounded){
            System.out.println("Nie znaleziono książek danego autora.");
        }
    }
    public void searchBookYear(int year){
        boolean bookFounded = false;
        for (Book book: books){
            if(book.getYear() == year){
                System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYear());
                bookFounded = true;
            }
        }
        if(!bookFounded){
            System.out.println("Nie znaleziono książek z danego roku.");
        }
    }

    public void searchBookTitle(String title){
        boolean bookFounded = false;
        for (Book book: books){
            if(book.getTitle().equals(title)){
                System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYear());
                bookFounded = true;
            }
        }
        if(!bookFounded){
            System.out.println("Nie znaleziono książek o danym tytule.");
        }
    }
}
