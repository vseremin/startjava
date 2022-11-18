package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int startRange = 0;
    private int numberTries = 0;
    private int[] nums = new int[10];
    private boolean active = true;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return nums[numberTries + startRange - 1];
    }

    public int getNumberTries() {
        return numberTries;
    }

    public boolean isActive() {
        return active;
    }

    public void setNumArray(int num) {
        if (numberTries == 9) {
            System.out.println("У " + name + " закончились попытки");
            active = false;
        } else {
            nums[numberTries + startRange] = num;
            numberTries++;
        }
    }

    public void continueGame() {
        startRange += numberTries;
        numberTries = 0;
        if(nums.length < startRange + 10) {
            nums = Arrays.copyOf(nums, startRange + 10);
        }
    }

    public int[] returnNumbersArray() {
        int[] itogNumbers = Arrays.copyOfRange(nums, startRange, numberTries + startRange);
        continueGame();
        return itogNumbers;
    }
}
