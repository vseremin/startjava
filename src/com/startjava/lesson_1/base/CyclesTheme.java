package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNum = 0; 
        int sumOddNum = 0;
        int startSegment = -10;
        int endSegment = 21;
        do {
            if (startSegment % 2 == 0) {
                sumEvenNum += startSegment;
            } else {
                sumOddNum += startSegment;
            }
            startSegment++;
        } while (startSegment <= endSegment);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvenNum + 
                ", а нечетных = " + sumOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10; 
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int sum = 0;
        while (num1 != 0) {
            int digit = num1 % 10;
            System.out.print(digit);
            sum += digit;
            num1 /= 10;
        }
        System.out.println("\nСумма = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int beginInterval = 1;
        int endInterval = 24;
        int countNums = 0; 
        for (int i = beginInterval; i < endInterval; i += 2) {
            System.out.printf("%3d ", i);
            countNums++;
            if ((i + 1) % 10 == 0) {
                System.out.println();
                countNums = 0;
            }
        }
        for (int i = countNums; i < 5; i++) {
            System.out.printf("%3d ", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        num1 = 3141591;
        int copyNum1 = num1;
        int countOnes = 0;
        while (num1 != 0) {
            if (num1 % 10 == 1) {
                countOnes++;
            }
            num1 /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.println("число " + copyNum1 + " содержит " + countOnes + 
                    " (четное) количество единиц");
        } else {
            System.out.println("число " + copyNum1 + " содержит " + countOnes + 
                    " (нечетное) количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        int numberStars = 50;
        for (int i = 1; i <= numberStars; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        int numberSign = 5;
        int numberPrintedSign = 0;
        while (numberSign > 0) {
            System.out.print("#");
            numberPrintedSign++;
            if (numberSign == numberPrintedSign) {
                System.out.println();
                numberPrintedSign = 0;
                numberSign--;
            }
        }
        int step = 1;
        numberPrintedSign = 1;
        numberSign = 1;
        do {
            System.out.print("$");
            if (numberPrintedSign == 3) {
                step *= -1;
            } 
            numberSign--;
            if (numberSign == 0) {
                System.out.println();
                numberPrintedSign += step;
                numberSign = numberPrintedSign;
            }
        } while (numberPrintedSign > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        for (int i = 0; i <= 'z'; i++) {
            if (i <= '1' && i % 2 != 0) {
                System.out.printf("%4d %4c\n", i, i);
            } else if (i >= 'a' && i % 2 == 0) {
                System.out.printf("%4d %4c\n", i, i);
            }
            if (i == '1') {
                i = 'a';
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num1 = 1234321;
        copyNum1 = num1;
        int reverseNum = 0;
        while (num1 > 0) {
            reverseNum += num1 % 10;
            num1 /= 10;
            if (num1 != 0) {
                reverseNum *= 10;
            }
        }
        if (reverseNum == copyNum1) {
            System.out.println("число " + copyNum1 + " является палиндромом");
        } else {
            System.out.println("число " + copyNum1 + " не является палиндромом");
        }
        
        System.out.println("\n9. Определение, является ли число счастливым");
        num1 = 127321;
        int bottomHalf = num1 % 1000;
        copyNum1 = num1;
        while (num1 > 1000) {
            num1 /= 10;
        }
        int topHalf = num1;
        int copyBottomHalf = bottomHalf;
        int sumTopHalf = 0;
        int sumBottomHalf = 0;
        while (num1 != 0 || bottomHalf != 0) {
            sumBottomHalf += bottomHalf % 10;
            bottomHalf /= 10;
            sumTopHalf += num1 % 10;
            num1 /= 10;
        }
        String happyOrNot = "";
        if (sumTopHalf == sumBottomHalf) {
            happyOrNot = " является счастливым";
        } else {
            happyOrNot = " не является счастливым";
        }
        System.out.println("Сумма цифр " + topHalf + " = " + sumTopHalf + "\nСумма цифр " + 
                copyBottomHalf + " = " + sumBottomHalf +"\nЧисло " + copyNum1 + happyOrNot);

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        num1 = 10;
        for (int i = 1; i < num1; i++) {
            for (int j = 1; j < num1; j++) {
                if (j == 1 & i == 1) {
                    System.out.print("   |");
                } else if (j == 1) {
                    System.out.printf("%3d|",i * j);
                } else {
                    System.out.printf("%4d",i * j);
                }
            }
            System.out.println();
            if (i == 1) {
                System.out.println("-------------------------------------");
            }
        }
    }
}
