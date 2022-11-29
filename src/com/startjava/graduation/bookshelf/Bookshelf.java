package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public static final int SIZE_SHELF = 10;
    private static int numberBook;
    private static Book[] books = new Book[SIZE_SHELF];
    private int maxLength;

    public int getNumberBook() {
        return numberBook;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void delete(String title) {
        int number;
        try {
            number = searchBook(title);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException("Не могу удалить данную книгу, так как в шкафу ее нет");
        }
        int length = books[number].getLenInfo();
        System.arraycopy(books, number + 1, books, number, numberBook - number - 1);
        numberBook--;
        if (length == maxLength) {
            setMaxLength();
        }
    }

    public void clearSelf() {
        Arrays.fill(books, 0, numberBook, null);
        numberBook = 0;
    }

    public void addBook(String autor, String title, String year) {
        if (books.length  == numberBook) {
            throw new IllegalArgumentException("Шкаф переполнен, не могу добавлять новые книги");
        }
        Book book = new Book(autor, title, year);
        books[numberBook] = book;
        numberBook++;
        if (books[numberBook - 1].getLenInfo() > maxLength) {
            setMaxLength();
        }
    }

    public Book[] getAllBook() {
        return Arrays.copyOf(books, numberBook);
    }

    public int getNumberBookOnTheShelf() {
        return numberBook;
    }

    public int getAmountFreeSpace() {
        return books.length - numberBook;
    }

    public int searchBook(String bookTitle) {
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
            maxLength = books[i].getLenInfo() > maxLength ? books[i].getLenInfo() : maxLength;
        }
    }
}

