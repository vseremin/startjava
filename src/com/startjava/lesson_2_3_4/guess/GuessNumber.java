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
        } while (activePlayer.addNums(scan.nextInt()) && compareNums());
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
        if (activePlayer.getNum() > secretNum) {
            System.out.println("Число " + activePlayer.getNum()
                    + " больше того, что загадал компьютер");
        } else if (activePlayer.getNum() < secretNum) {
            System.out.println("Число " + activePlayer.getNum()
                    + " меньше того, что загадал компьютер");
        }
        return secretNum != activePlayer.getNum();
    }

    private void printWinner() {
        if (activePlayer.getNumberTries() < 10) {
            System.out.println("Победил игрок " + activePlayer.getName()
                    + " угадал число " + activePlayer.getNum() + " с "
                    + activePlayer.getNumberTries() + " попытки");
        } else {
            System.out.println("Попытки закончились, победителя нет");
        }
        printNumbers(player1);
        printNumbers(player2);
    }

    private void printNumbers(Player player) {
        System.out.print("Числа названные игроком " + player.getName() + ": ");
        for (int num : player.getNums()) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
