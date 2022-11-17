package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private static int num1;
    private static int num2;
    private static char sign;

    public static int calculate(String expression) {
        parseExpression(expression);
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> (int) Math.pow(num1, num2);
            default -> throw new IllegalArgumentException("sign может принимать только следующие значения: " +
                    "'+', '-', '*', '/', '%', '^'");
        };
    }

    private static void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        if (partsExpression.length != 3) {
            throw new IllegalArgumentException("Проверьте правильность формата введенного выражения." +
                    "Числа и знак должны быть разделены пробелом");
        }
        num1 = validPositiveNumber(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        num2 = validPositiveNumber(partsExpression[2]);
        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException("num1 и num2 должны быть положительными числами");
        }
    }

    private static int validPositiveNumber(String str) {
        int num;
        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException ignored) {
            throw new IllegalArgumentException("num1 и num2 должны быть целыми числами");
        }
        if (num >= 0) {
            return num;
        }
        return -1;
    }
}
