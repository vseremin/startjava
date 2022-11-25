package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private int numTries;
    public static final int NUM_ATTEMPTS = 10;
    private final int[] nums = new int[NUM_ATTEMPTS];
    private int numWins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addNum(int num) {
        if (numTries == NUM_ATTEMPTS) {
            System.out.println("У " + name + " закончились попытки");
            return false;
        }
        if (num <= 0 || num > 100) {
            return false;
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

    public void clearTries() {
        Arrays.fill(nums, 0, numTries, 0);
        numTries = 0;
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

    public int[] getNums() {
        return Arrays.copyOf(nums, numTries);
    }
}
