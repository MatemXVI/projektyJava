package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBooks(Book book){
        books.add(book);
    }

    public void removeBooks(Book book){
        books.remove(book);
    }


    public List<Book> searchBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();

        for (Book ksiazka : books) {
            if (ksiazka.getAuthor().equals(author)) {
                System.out.println("Książki autora " + author);
                System.out.println("Tytuł książki: " + ksiazka.getTitle() + ", Autor: " + ksiazka.getAuthor() + ", Numer: " + ksiazka.getIsbn() + ", Rok produkcji: " + ksiazka.getPublicationYear());
            }
        }

        return foundBooks;
    }

    public void searchBooksByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();

        for (Book ksiazka : books) {
            if (ksiazka.getTitle().equals(title)) {
                System.out.println("Ksiązki pod tytułem " + title);
                System.out.println("Tytuł książki: " + ksiazka.getTitle() + ", Autor: " + ksiazka.getAuthor() + ", Numer: " + ksiazka.getIsbn() + ", Rok produkcji: " + ksiazka.getPublicationYear());
            }
        }
    }

    public void getBooks(){
        for (Book ksiazka : this.books){
            System.out.println("Tytuł książki: " + ksiazka.getTitle() + ", Autor: " + ksiazka.getAuthor() + ", Numer: " + ksiazka.getIsbn() + ", Rok produkcji: " + ksiazka.getPublicationYear());
        }
    }
}

