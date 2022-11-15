package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        String option;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите математическое выражение: ");
            String expression = scan.nextLine();
            try {
                System.out.println(expression + " = " + Calculator.calculate(expression));
            } catch (UnsupportedOperationException exeption) {
                System.out.println("Введены некорректные данные! Введите правильное выражение");
            }
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                option = scan.nextLine();
            } while (!option.equals("yes") && !option.equals("no"));
        } while (!option.equals("no"));
    }
} 
