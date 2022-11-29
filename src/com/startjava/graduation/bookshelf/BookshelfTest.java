package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            if (bookshelf.getAmountFreeSpace() == 10) {
                System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            } else {
                do {
                    System.out.print("Для продолжения работы нажмите Enter");
                } while (scanner.nextLine().toCharArray().length != 0);
                System.out.println("Количество книг: " + bookshelf.getNumberBook() + ", количество свободных полок: "
                        + bookshelf.getAmountFreeSpace() +"\n");
                printShelf(bookshelf.getAllBook(), bookshelf.getMaxLength());
            }
            System.out.println("""
                    МЕНЮ
                    1. Удалить книгу
                    2. Очистить шкаф
                    3. Сохранить книгу
                    4. Получить все книги
                    5. Получить количество книг на полке
                    6. Получить количество свободного места
                    7. Найти книгу
                    8. Завершить""");

            option = scanner.hasNextInt() ? scanner.nextInt() : 0;
            scanner.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    try {
                        bookshelf.delete(title);
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
                case 2 -> bookshelf.clearSelf();
                case 3 -> {
                    System.out.print("Введите автора книги: ");
                    String autor = scanner.nextLine();
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите год издания книги: ");
                    String year = scanner.nextLine();
                    try {
                        bookshelf.addBook(autor, title, year);
                    } catch (RuntimeException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
                case 4 -> printShelf(bookshelf.getAllBook(), bookshelf.getMaxLength());
                case 5 -> System.out.println("Количество книг на полке: " + bookshelf.getNumberBookOnTheShelf());
                case 6 -> System.out.println("Количество свободных полок: " + bookshelf.getAmountFreeSpace());
                case 7 -> {
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    try {
                        System.out.println("Номер полки: " + bookshelf.searchBook(title));
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
                default -> {
                    if (option != 8) {
                        System.out.println("Неизвестная команда!");
                    }
                }
            }
        } while (option != 8);
    }

    private static void printShelf(Book[] books, int maxLength) {
        for (Book book : books) {
            System.out.println("|" + book
                    + " ".repeat(maxLength - book.getLenInfo())
                    + "|\n|" + "-".repeat(maxLength) + "|");
        }
        if (books.length < Bookshelf.SIZE_SHELF) {
            String shelf = "|" + " ".repeat(maxLength) + "|";
            System.out.println(shelf);
        }
    }
}

