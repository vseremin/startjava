package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr1 = {7, 2, 5, 3, 1, 6, 4};
        printIntArr(intArr1);
        int len = intArr1.length;
        for (int i = 0; i < len / 2; i++) {
            int tmp = intArr1[i];
            intArr1[i] = intArr1[--len];
            intArr1[len] = tmp;
        }
        printIntArr(intArr1);

        System.out.println("\n2. Вывод произведения элементов массива");
        int[] intArr2 = new int[10];
        len = intArr2.length;
        for (int i = 0; i < len; i++) {
            intArr2[i] = i;
        }
        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            product *= intArr2[i];
            System.out.print(intArr2[i] + (intArr2[i + 1] != 9 ? " * " :  " = " + product));
        }

        System.out.println("\n\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        printDoubleArr(doubleArr);
        double middleNumber = doubleArr[len / 2];
        int zeroCounter = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > middleNumber) {
                doubleArr[i] = 0;
                zeroCounter++;
            }
        }
        printDoubleArr(doubleArr);
        System.out.println("количество обнуленных ячеек = " + zeroCounter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet =  new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNums = new int[30];
        Random random = new Random();
        len = uniqueNums.length;
        for (int i = 0; i < len; i++) {
            int number = random.nextInt(40) + 60;
            boolean unique = false;
            for (int j = 0; j <= i; j++) {
                if (uniqueNums[j] == number) {
                    unique = true;
                    break;
                }
            }
            if (!unique) {
                uniqueNums[i] = number;
            } else {
                i--;
            }
        }
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (uniqueNums[j] > uniqueNums[j + 1]) {
                    int tmp = uniqueNums[j];
                    uniqueNums[j] = uniqueNums[j + 1];
                    uniqueNums[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(uniqueNums[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n*6. Сдвиг элементов массива");
        String[] srcArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int newLen = 0;
        for (String str : srcArr) {
            if (!str.isBlank()) {
                newLen++;
            }
        }
        String[] destArr = new String[newLen];
        int position = 0;
        for (int i = 0; i < srcArr.length; i++) {
            int j = i;
            while (!srcArr[i].isBlank()) {
                i++;
            }
            System.arraycopy(srcArr, j, destArr, position, i - j);
            position += i - j;
        }
        printStringArr(srcArr);
        printStringArr(destArr);
    }

    private static void printIntArr(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void printDoubleArr(double[] arr) {
        int averageIndex = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%8.3f ", arr[i]);
            if (i == averageIndex) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printStringArr(String[] stringArr) {
        for (String str : stringArr) {
            System.out.print(str);
        }
        System.out.println();
    }
}
