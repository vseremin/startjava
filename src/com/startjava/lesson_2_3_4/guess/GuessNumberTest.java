package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.print("""
                "Угадай число"
                У каждого игрока по 10 попыток
                Введите имя первого игрока:\s""");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Player player1 = new Player(name);
        System.out.print("Введите имя второго игрока: ");
        name = scan.nextLine();
        Player player2 = new Player(name);
        System.out.print("Введите имя третьего игрока: ");
        name = scan.nextLine();
        Player player3 = new Player(name);
        GuessNumber game = new GuessNumber(player1, player2, player3);
        String option = "yes";
        do {
            if (option.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            option = scan.nextLine();
        } while (!option.equals("no"));
    }
} 
