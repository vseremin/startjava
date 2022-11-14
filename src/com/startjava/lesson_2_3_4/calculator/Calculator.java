package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private int num1;
    private int num2;
    private char sign;
    private String expression;

    public int calculate(String expression) {
        this.expression = expression;
        parseExpression();
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

    private void parseExpression() {
        String[] lines = expression.split(" ");
        this.num1 = Integer.parseInt(lines[0]);
        this.sign = lines[1].charAt(0);
        this.num2 = Integer.parseInt(lines[2]);
    }
}
