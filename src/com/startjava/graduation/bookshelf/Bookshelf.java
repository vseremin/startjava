package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bookshelf {

    private static int numberBook;
    private static Book[] books = new Book[10];
    private int maxLength;

    public int getNumberBook() {
        return numberBook;
    }

    public void delete() {
        int number = searchBook();
        System.arraycopy(books, number + 1, books, number, numberBook - number - 1);
        numberBook--;
        setMaxLength();
    }

    public void clearSelf() {
        Arrays.fill(books, 0, numberBook, null);
        numberBook = 0;
    }

    public void addBook() {
        if (books.length  == numberBook) {
            System.out.println("шкаф переполнен");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите автора книги: ");
            String autor = scanner.nextLine();
            System.out.print("Введите название книги: ");
            String title = scanner.nextLine();
            System.out.print("Введите год издания книги: ");
            int year;
            try {
                 year = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException exception) {
                throw new InputMismatchException("Год нужно выводит числом!");
            }
            Book book = new Book(autor, title, year);
            books[numberBook] = book;
            numberBook++;
        }
        setMaxLength();
    }

    public void getAllBook() {
        for (int i = 0; i < numberBook; i++) {
            printBook(i);
        }
        if (books.length  != numberBook) {
            String shelf = "|" + " ".repeat(maxLength) + "|";
            System.out.println(shelf);
        }
    }

    public int getNumberBookOnTheShelf() {
        return numberBook;
    }

    public int getAmountFreeSpace() {
        return books.length - numberBook;
    }

    public int searchBook() {
        System.out.print("Введите название книги: ");
        String bookTitle = new Scanner(System.in).nextLine();
        for (int i = 0; i < numberBook; i++) {
            if (bookTitle.equals(books[i].getTitle())) {
                return i;
            }
        }
        throw new IllegalArgumentException("Данной книги нет");
    }

    private void setMaxLength() {
        maxLength = 0;
        for (int i = 0; i < numberBook; i++) {
            maxLength = books[i].getLengthBookInformation() > maxLength ? books[i].getLengthBookInformation() :
                    maxLength;
        }
    }

    private void printBook(int number) {
        if (number > numberBook || numberBook == 0) {
            System.out.println("Книги с таким индексом нет");
        } else {
            String book = "|" + books[number].toString()
                    + " ".repeat(maxLength - books[number].getLengthBookInformation())
                    + "|\n|" + "-".repeat(maxLength) + "|";
            System.out.println(book);
        }
    }
}

