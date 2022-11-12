package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr1 = {7, 2, 5, 3, 1, 6, 4};
        printIntArr(intArr1);
        System.out.println();
        int len = intArr1.length - 1;
        for (int i = 0; i < intArr1.length / 2; i++, len--) {
            int tmp = intArr1[i];
            intArr1[i] = intArr1[len];
            intArr1[len] = tmp;
        }
        printIntArr(intArr1);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] intArr2 = new int[10];
        len = intArr2.length;
        for (int i = 0; i < len; i++) {
            intArr2[i] = i;
        }
        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            product *= intArr2[i];
            String sign = intArr2[i + 1] == 9 ? " = " : " * ";
            System.out.print(intArr2[i] + sign);
        }
        System.out.println(product);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        printDoubleArr(doubleArr);
        double valueAverageIndex = doubleArr[len / 2];
        int zeroCounter = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > valueAverageIndex) {
                doubleArr[i] = 0;
                zeroCounter++;
            }
        }
        System.out.println();
        printDoubleArr(doubleArr);
        System.out.println("\nколичество обнуленных ячеек = " + zeroCounter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr =  new char[26];
        char currentValue = 'A';
        len = charArr.length;
        for (int i = 0; i < len; i++) {
            charArr[i] = currentValue;
            currentValue++;
        }
        for (int i = len - 1; i >= 0; i--) {
            int j = len - 1;
            while (i <= j) {
                System.out.print(charArr[j]);
                j--;
            }
            System.out.println();
        }

        System.out.println("5. Генерация уникальных чисел");
        int[] intArr = new int[30];
        Random random = new Random();
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            int number = random.nextInt(40) + 60;
            boolean hasValue = false;
            for (int j = 0; j <= i; j++) {
                if (intArr[j] == number) {
                    hasValue = true;
                    break;
                }
            }
            if (!hasValue) {
                intArr[i] = number;
            } else {
                i--;
            }
        }
        int copyNum;
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    copyNum = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = copyNum;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(intArr[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n*6. Сдвиг элементов массива");
        String[] stringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = 0;
        for (String stringA : stringArr) {
            if (!stringA.isBlank()) {
                len++;
            }
        }
        String[] stringArr2 = new String[len];
        int position = 0;
        for (int i = 0; i < stringArr.length; i++) {
            int j = i;
            while (!stringArr[i].isBlank()) {
                i++;
            }
            System.arraycopy(stringArr, j, stringArr2, position, i - j);
            position += i - j;
        }
        printStringArr(stringArr);
        printStringArr(stringArr2);
    }

    private static void printIntArr(int[] numbers) {
        for (int number : numbers
        ) {
            System.out.print(number + " ");
        }
    }

    private static void printDoubleArr(double[] arr) {
        int averageIndex = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%8.3f ", arr[i]);
            if (i == averageIndex) {
                System.out.println();
            }
        }
    }

    private static void printStringArr(String[] stringArr) {
        for (String stringAr : stringArr) {
            System.out.print(stringAr);
        }
        System.out.println();
    }
}
