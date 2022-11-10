package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    
    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, float height, float weight, 
            int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public void setMark(String mark) {
        if (mark == "") {
            System.out.println("Пустая строка");
        } else {
            this.mark = mark;
        }
    }

    public void setOrigin(String origin) {
        if (origin == "") {
            System.out.println("Пустая строка");
        } else {
            this.origin = origin;
        }
    }

    public void setHeight(float height) {
        if (height < 0) {
            System.out.println("Неверное значение");
        } else {
            this.height = height;
        }
    }

    public void setWeight(float weight) {
        if (weight < 0) {
            System.out.println("Неверное значение");
        } else {
            this.weight = weight;
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }

    @Override
    public String toString() {
        return "Model name: " + modelName 
                + "\nMark: " + mark 
                + "\nOrigin: " + origin
                + "\nHeight: " + height
                + " m\nWeight: " + weight
                + " Tons\nSpeed: " + speed
                + "\nStrength: " + strength
                + "\nArmor: " + armor;
    }
} 
