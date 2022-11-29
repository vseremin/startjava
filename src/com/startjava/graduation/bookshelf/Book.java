package com.startjava.graduation.bookshelf;

public class Book {

    private String autor;
    private String title;
    private String yearPublication;
    private int lenInfo;

    public Book(String autor, String title, String yearPublication) {
        this.autor = autor;
        this.title = title;
        this.yearPublication = yearPublication;
        lenInfo = autor.length() + title.length() + yearPublication.length() + 4;
    }

    public String getTitle() {
        return title;
    }

    public int getLenInfo() {
        return lenInfo;
    }

    @Override
    public String toString() {
        return autor + ", " + title + ", " + yearPublication;
    }
}

