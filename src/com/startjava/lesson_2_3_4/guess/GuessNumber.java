package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player activePlayer;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        secretNum = new Random().nextInt(100) + 1;
        init();
        do {
            selectPlayer();
            System.out.print("Игрок " + activePlayer.getName() + " введите число: ");
            if (!activePlayer.addNums(scan.nextInt())) {
                break;
            }
        } while (!compareNums());
        printWinner();
    }

    private void init() {
        player1.clearTries();
        player2.clearTries();
    }

    private void selectPlayer() {
        activePlayer = activePlayer == player1 ? player2 : player1;
    }

    private boolean compareNums() {
        int num = activePlayer.getNum();
        if (num > secretNum) {
            System.out.println("Число " + num
                    + " больше того, что загадал компьютер");
        } else if (num < secretNum) {
            System.out.println("Число " + num
                    + " меньше того, что загадал компьютер");
        }
        return secretNum == num;
    }

    private void printWinner() {
        if (activePlayer.getNumTries() < 10) {
            System.out.println("Победил игрок " + activePlayer.getName()
                    + " угадал число " + activePlayer.getNum() + " с "
                    + activePlayer.getNumTries() + " попытки");
        } else {
            System.out.println("Попытки закончились, победителя нет");
        }
        printNum(player1);
        printNum(player2);
    }

    private void printNum(Player player) {
        System.out.print("Числа названные игроком " + player.getName() + ": ");
        for (int num : player.getNums()) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
