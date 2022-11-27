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
                System.out.println("Количество книг: " + bookshelf.getNumberBook() + " свободных полок: "
                        + bookshelf.getAmountFreeSpace());
                bookshelf.getAllBook();
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
                    try {
                        bookshelf.delete();
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
                case 2 -> bookshelf.clearSelf();
                case 3 -> {
                    try {
                        bookshelf.addBook();
                    } catch (RuntimeException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
                case 4 -> bookshelf.getAllBook();
                case 5 -> System.out.println("Количество книг на полке: " + bookshelf.getNumberBookOnTheShelf());
                case 6 -> System.out.println("Количество свободных полок: " + bookshelf.getAmountFreeSpace());
                case 7 -> {
                    try {
                        System.out.println("Номер полки: " + bookshelf.searchBook());
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
            }
        } while (option != 8);
    }
}

