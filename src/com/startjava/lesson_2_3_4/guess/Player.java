package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int numTries;
    private int[] nums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return nums[numTries - 1];
    }

    public int getNumTries() {
        return numTries;
    }

    public boolean addNums(int num) {
        if (numTries == 10) {
            System.out.println("У " + name + " закончились попытки");
            return false;
        }
        nums[numTries] = num;
        numTries++;
        return true;
    }

    public void clearTries() {
        Arrays.fill(nums, 0, numTries, 0);
        numTries = 0;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, numTries);
    }
}
