package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private int secretNum;
    private Player activePlayer;
    private final Player[] playerArr = new Player[3];
    private int numGame;

    public GuessNumber(Player... player) {
        castLots(player);
    }

    public void start() {
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            secretNum = new Random().nextInt(100) + 1;
            init();
            do {
                selectPlayer();
                System.out.print("Игрок " + activePlayer.getName() + " введите число: ");
                if (!activePlayer.addNum(scan.nextInt())) {
                    if (activePlayer.getNumTries() == 10) {
                        break;
                    } else {
                        do {
                            System.out.print("Игрок " + activePlayer.getName() + " введите число. " +
                                    "Значение должно быть в полуинтервале (0, 100] : ");
                            activePlayer.setNumTries(activePlayer.getNumTries());
                        } while (!activePlayer.addNum(scan.nextInt()));
                    }
                }
            } while (!compareNums());
            printWinner();
        }
    }

    private void castLots(Player... player) {
        Random rnd = new Random();
        int numArr = 0;
        for (int length = player.length; length > 0; length--) {
            int num = rnd.nextInt(length);
            playerArr[numArr] = player[num];
            player[num] = player[length - 1];
            numArr++;
        }
    }

    private void init() {
        for (Player player : playerArr) {
            player.clearTries();
        }
    }

    private void selectPlayer() {
        if (activePlayer == null) {
            activePlayer = playerArr[0];
        } else {
            for (int i = 0; i < playerArr.length; i++) {
                if (activePlayer == playerArr[i]) {
                    activePlayer = i == playerArr.length - 1 ? playerArr[0] : playerArr[i + 1];
                    return;
                }
            }
        }
    }

    private boolean compareNums() {
        int num = activePlayer.getNum();
        System.out.println(secretNum != num ? "Число " + num
                + (num > secretNum ? " больше " : " меньше ")
                + "того, что загадал компьютер" : "Число отгадано");
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
            activePlayer = null;
            int maxNumWins = 0;
            int numPlayerWins = 0;
            for (Player player : playerArr) {
                if (maxNumWins < player.getNumWins()) {
                    maxNumWins = player.getNumWins();
                    activePlayer = player;
                    numPlayerWins = 1;
                } else if (maxNumWins == player.getNumWins()) {
                    numPlayerWins++;
                }
            }
            if (activePlayer != null && numPlayerWins == 1) {
                System.out.println("По итогам 3 раундов победил: " + activePlayer.getName());
            } else {
                System.out.println("По итогам 3 раундов победителя нет");
            }
            numGame = 0;
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
