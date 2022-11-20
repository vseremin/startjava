package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player[] playerArr = new Player[3];
    private Player activePlayer;
    private int secretNum;
    private int numGame;

    public GuessNumber(Player ... player) {
        Random rnd = new Random();
        int length = player.length;
        int numArr = 0;
        while (length > 0) {
            int num = rnd.nextInt(length);
            playerArr[numArr] = player[num];
            player[num] = player[length - 1];
            length--;
            numArr++;
        }
    }

    public void start() {
        for (int i = 0; i < 3; i++) {
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
    }

    private void init() {
        for (Player player : playerArr) {
            player.clearTries();
        }
    }

    private void selectPlayer() {
        activePlayer = activePlayer == playerArr[0] ? playerArr[1] :
                activePlayer == playerArr[1] ? playerArr[2] : playerArr[0];
    }

    private boolean compareNums() {
        int num = activePlayer.getNum();
        System.out.println("Число " + num
                + (num > secretNum ? " больше " : " меньше ")
                + "того, что загадал компьютер");
        return secretNum == num;
    }

    private void printWinner() {
        if (activePlayer.getNumTries() < 10) {
            System.out.println("В этом раунде победил игрок " + activePlayer.getName()
                    + " угадал число " + activePlayer.getNum() + " с "
                    + activePlayer.getNumTries() + " попытки");
            activePlayer.setNumWins(activePlayer.getNumWins() + 1);
        } else {
            System.out.println("Попытки закончились, в этом раунде победителя нет");
        }
        for (Player player : playerArr) {
            printNum(player);
        }
        numGame++;
        if (numGame >= 3) {
            if (playerArr[0].getNumWins() == playerArr[1].getNumWins() ||
                    playerArr[1].getNumWins() == playerArr[2].getNumWins() ||
                    playerArr[0].getNumWins() == playerArr[2].getNumWins()) {
                System.out.println("По итогам 3 раундов победителя нет");
                numGame = 0;
            } else {
                activePlayer = playerArr[0].getNumWins() > playerArr[1].getNumWins() ?
                        playerArr[0].getNumWins() > playerArr[2].getNumWins() ? playerArr[0] : playerArr[2] :
                        playerArr[1].getNumWins() > playerArr[2].getNumWins() ? playerArr[1] : playerArr[2];
                System.out.println("По итогам 3 раундов победил: " + activePlayer.getName());
                numGame = 0;
            }
        }
    }

    private void printNum(Player player) {
        System.out.print("Числа названные игроком " + player.getName() + ": ");
        for (int num : player.getNums()) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
