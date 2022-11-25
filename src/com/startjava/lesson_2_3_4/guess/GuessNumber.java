package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static final int NUM_ROUND = 3;
    private int secretNum;
    private Player activePlayer;
    private final Player[] players = new Player[3];
    private int numActivePlayer;
    private int round;


    public GuessNumber(Player... player) {
        castLots(player);
    }

    public void start() {
        for (int i = 0; i < NUM_ROUND; i++) {
            secretNum = new Random().nextInt(100) + 1;
            init();
            do {
                selectPlayer();
                System.out.print("Игрок " + activePlayer.getName() + " введите число: ");
                if (!activePlayer.addNum(inputNum())) {
                    if (activePlayer.getNumTries() == Player.NUM_ATTEMPTS) {
                        break;
                    }
                    do {
                        System.out.print("Игрок " + activePlayer.getName() + " введите число. " +
                                "Значение должно быть в полуинтервале (0, 100] : ");
                        activePlayer.setNumTries(activePlayer.getNumTries());
                    } while (!activePlayer.addNum(inputNum()));
                }
            } while (!compareNums());
            printWinner();
        }
    }

    private void castLots(Player... player) {
        Random rnd = new Random();
        int numArr = 0;
        for (int i = player.length - 1; i >= 0; i--) {
            int lot = rnd.nextInt(i + 1);
            players[numArr] = player[lot];
            player[lot] = player[i];
            numArr++;
        }
    }

    private void init() {
        for (Player player : players) {
            player.clearTries();
        }
    }

    private void selectPlayer() {
        activePlayer = players[numActivePlayer];
        numActivePlayer = numActivePlayer == players.length - 1 ? 0 : numActivePlayer + 1;
    }

    private int inputNum() {
        Scanner scan = new Scanner(System.in);
        try {
            int num = scan.nextInt();
            return num;
        } catch (InputMismatchException exception) {
            System.out.println("Вы ввели не число");
        }
        return 101;
    }

    private boolean compareNums() {
        int num = activePlayer.getNum();
        if (num > secretNum) {
            System.out.println("Число " + num + " больше того, что загадал компьютер");
        } else if (num < secretNum) {
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число отгадано");
            activePlayer.setNumWins(activePlayer.getNumWins() + 1);
        }
        return secretNum == num;
    }

    private void printWinner() {
        if (activePlayer.getNumTries() < Player.NUM_ATTEMPTS) {
            System.out.println("В этом раунде победил игрок " + activePlayer.getName()
                    + " угадал число " + activePlayer.getNum() + " с "
                    + activePlayer.getNumTries() + " попытки");
        } else {
            System.out.println("Попытки закончились, в этом раунде победителя нет");
        }
        for (Player player : players) {
            printNums(player);
        }
        round++;
        if (round >= NUM_ROUND) {
            activePlayer = null;
            int maxNumWins = 0;
            int numPlayerWins = 0;
            for (Player player : players) {
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
            round = 0;
        }
    }

    private void printNums(Player player) {
        System.out.print("Числа названные игроком " + player.getName() + ": ");
        for (int num : player.getNums()) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
