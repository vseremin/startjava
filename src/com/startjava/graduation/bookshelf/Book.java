package com.startjava.graduation.bookshelf;

public class Book {

    private String autor;
    private String title;
    private int yearPublication;
    private int lengthBookInformation;

    public Book(String autor, String title, int yearPublication) {
        this.autor = autor;
        this.title = title;
        this.yearPublication = yearPublication;
        lengthBookInformation = autor.length() + title.length() + String.valueOf(yearPublication).length() + 4;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return autor + ", " + title + ", " + yearPublication;
    }

    public int getLengthBookInformation() {
        return lengthBookInformation;
    }
}

