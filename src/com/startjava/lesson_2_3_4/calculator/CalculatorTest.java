package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        Calculator calculator = new Calculator();
        String option;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите математическое выражение: ");
            calculator.setExpression(scan.nextLine());
            System.out.println(calculator.getNum1() + " " + calculator.getSign() + " " +
                    calculator.getNum2() + " = " + calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                option = scan.nextLine();
            } while (!option.equals("yes") && !option.equals("no"));
        }
        while (!option.equals("no")); 
    }
} 
