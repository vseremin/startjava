package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int numberTries;
    private int[] nums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return nums[numberTries - 1];
    }

    public int getNumberTries() {
        return numberTries;
    }

    public boolean addNums(int num) {
        if (numberTries == 10) {
            System.out.println("У " + name + " закончились попытки");
            return false;
        } else {
            nums[numberTries] = num;
            numberTries++;
            return true;
        }
    }

    public void clearTries() {
        Arrays.fill(nums, 0, numberTries, 0);
        numberTries = 0;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, numberTries);
    }
}
