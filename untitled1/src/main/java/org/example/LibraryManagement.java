package org.example;

public class LibraryManagement {
    public static void main(String[] args) {
       Library biblioteka = new Library();

       Book harryPotter = new Book("Harry Potter", "J.K. Rowling", 1997, "978-83-800-8211-3");
       Book wladcaPierscieni = new Book("Władca pierścieni", "J.R.R. Tolkien", 1954, "978-83-287-0078-9");
       Book wiedzmin = new Book ("Ostatnie życzenie. Wiedźmin.", "Andrzej Sapkowski", 2007, "978-837578-063-5");
       Book folwark = new Book("Folwark zwierzęcy", "George Orwell", 1945, "978-83-775-8028-8");

       biblioteka.addBooks(harryPotter);
       biblioteka.addBooks(wladcaPierscieni);
       biblioteka.addBooks(wiedzmin);
       biblioteka.addBooks(folwark);
       biblioteka.removeBooks(harryPotter);
       biblioteka.searchBooksByAuthor("J.R.R. Tolkien");
       biblioteka.searchBooksByTitle("Folwark zwierzęcy");
       biblioteka.getBooks();
    }
}