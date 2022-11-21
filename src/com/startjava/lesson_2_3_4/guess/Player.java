package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {

    private final String name;
    private int numTries;
    private final int[] nums = new int[10];
    private int numWins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addNum(int num) {
        if (numTries == 10) {
            System.out.println("У " + name + " закончились попытки");
            return false;
        }
        while (num <= 0 || num > 100) {
            System.out.print("Значение должно быть в в полуинтервал (0, 100]. "
                    + "Введите другое число: ");
            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();
        }
        nums[numTries] = num;
        numTries++;
        return true;
    }

    public int getNumTries() {
        return numTries;
    }

    public void setNumTries(int numTries) {
        this.numTries = numTries;
    }

    public int getNum() {
        return nums[numTries - 1];
    }

    public int getNumWins() {
        return numWins;
    }

    public void setNumWins(int numWins) {
        this.numWins = numWins;
    }

    public void clearTries() {
        Arrays.fill(nums, 0, numTries, 0);
        numTries = 0;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, numTries);
    }
}
