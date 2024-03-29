package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book novel = new Book("Novel", 310);
        Book jurney = new Book("Jurney", 250);
        Book diary = new Book("diary", 360);
        Book cleanCode = new Book("Clean code", 525);
        Book[] books = new Book[4];
        books[0] = novel;
        books[1] = jurney;
        books[2] = diary;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getNameBook() + " - " + book.getNumberPages());
        }
        System.out.println("SHIFT");
        books[0] = cleanCode;
        books[3] = novel;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getNameBook() + " - " + book.getNumberPages());
        }
        System.out.println("Cycle name book");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book == cleanCode) {
                System.out.println(book.getNameBook() + " - " + book.getNumberPages());
            }
        }
    }
}
