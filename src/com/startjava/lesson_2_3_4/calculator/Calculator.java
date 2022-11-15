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
            default -> throw new UnsupportedOperationException("Неверные данные");
        };
    }

    private static void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        if (isPositiveNumber(partsExpression[0]) && isPositiveNumber(partsExpression[2])) {
            num1 = Integer.parseInt(partsExpression[0]);
            sign = partsExpression[1].charAt(0);
            num2 = Integer.parseInt(partsExpression[2]);
        } else {
            throw new UnsupportedOperationException("Неверные данные");
        }
    }

    private static boolean isPositiveNumber(String str) {
        try {
            int intNum = Integer.parseInt(str);
            if (intNum >= 0) {
                return true;
            }
        } catch (NumberFormatException ignored) { }
        return false;
    }
}
