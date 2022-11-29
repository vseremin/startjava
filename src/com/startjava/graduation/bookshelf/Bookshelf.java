package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public static final int SIZE_SHELF = 10;
    private int numberBooks;
    private Book[] books = new Book[SIZE_SHELF];
    private int maxLength;

    public int getNumberBooks() {
        return numberBooks;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void delete(String title) {
        int index = searchBook(title);
        if (index == -1) {
            throw new IllegalArgumentException("Не могу удалить данную книгу, так как в шкафу ее нет");
        }
        int length = books[index].getLenInfo();
        System.arraycopy(books, index + 1, books, index, numberBooks - index - 1);
        numberBooks--;
        if (length == maxLength) {
            calcLengthBookshelf();
        }
    }

    public void clearSelf() {
        Arrays.fill(books, 0, numberBooks, null);
        numberBooks = 0;
    }

    public void addBook(Book book) {
        if (SIZE_SHELF  == numberBooks) {
            throw new IllegalArgumentException("Шкаф переполнен, не могу добавлять новые книги");
        }
        books[numberBooks] = book;
        numberBooks++;
        if (books[numberBooks - 1].getLenInfo() > maxLength) {
            calcLengthBookshelf();
        }
    }

    public Book[] getAllBook() {
        return Arrays.copyOf(books, numberBooks);
    }

    public int getAmountFreeSpace() {
        return SIZE_SHELF - numberBooks;
    }

    public int searchBook(String bookTitle) {
        for (int i = 0; i < numberBooks; i++) {
            if (bookTitle.equals(books[i].getTitle())) {
                return i;
            }
        }
        return -1;
    }

    private void calcLengthBookshelf() {
        maxLength = 0;
        for (int i = 0; i < numberBooks; i++) {
            if (books[i].getLenInfo() > maxLength) {
                maxLength = books[i].getLenInfo();
            }
        }
    }
}

