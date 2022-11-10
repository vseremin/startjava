package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);
        System.out.println(chernoAlpha);
        chernoAlpha.move();
        
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 6);
        System.out.println(gipsyDanger);
        gipsyDanger.setWeight(-1);
        System.out.println(gipsyDanger);
    }
} 
