package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private int num1;
    private int num2;
    private char sign;
    private String expression;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public char getSign() {
        return sign;
    }

    public void setExpression(String expression) {
        this.expression = expression;
        dividingLine();
    }

    private void dividingLine() {
        String[] lines = expression.split(" ");
        this.num1 = Integer.parseInt(lines[0]);
        this.sign = lines[1].charAt(0);
        this.num2 = Integer.parseInt(lines[2]);
    }

    public int calculate() {
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
}
