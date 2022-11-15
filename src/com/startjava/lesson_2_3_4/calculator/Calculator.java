package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private int num1;
    private int num2;
    private char sign;

    public int calculate(String expression) {
        parseExpression(expression);
        switch (sign) {
            case '+': 
                return num1 + num2; 
            case '-': 
                return num1 - num2; 
            case '*': 
                return num1 * num2; 
            case '/': 
                return num1 / num2; 
            case '%': 
                return num1 % num2; 
            case '^': 
                return (int) Math.pow(num1, num2);
            default: 
                System.out.println("Неизвестное действие");
                return 0;
        }
    }

    private void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        num1 = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        num2 = Integer.parseInt(partsExpression[2]);
    }
}
