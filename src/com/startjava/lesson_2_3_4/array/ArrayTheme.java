package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr1 = {7, 2, 5, 3, 1, 6, 4};
        printIntArr(intArr1);
        System.out.println();
        for (int i = 0; i < intArr1.length / 2; i++) {
            int numberCopy = intArr1[i];
            intArr1[i] = intArr1[intArr1.length - 1 - i];
            intArr1[intArr1.length - 1 - i] = numberCopy;
        }
        printIntArr(intArr1);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] intArr2 = new int[10];
        for (int i = 0; i < intArr2.length; i++) {
            intArr2[i] = i;
        }
        int product = 1;
        for (int i = 0; i < intArr2.length; i++) {
            product *= intArr2[i] != 0 && intArr2[i] != 9 ? takeValue(intArr2, i) : 1;
        }
        System.out.println(product);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.random();
        }
        int averageIndex = doubleArr.length / 2;
        printDoubleArr(doubleArr, averageIndex);
        int nullCell = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > doubleArr[averageIndex]) {
                doubleArr[i] = 0;
                nullCell++;
            }
        }
        System.out.println();
        printDoubleArr(doubleArr, averageIndex);
        System.out.println("\nколичество обнуленных ячеек = " + nullCell);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr =  new char[26];
        char currentValue = 'A';
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = currentValue;
            currentValue++;
        }
        for (int i = charArr.length - 1; i >= 0; i--) {
            int j = charArr.length - 1;
            while (i <= j) {
                System.out.print(charArr[j]);
                j--;
            }
            System.out.println();
        }

        System.out.println("5. Генерация уникальных чисел");
        int[] intArr = new int[30];
        Random random = new Random();
        for (int i = 0; i < intArr.length; i++) {
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
        for (int i = intArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    copyNum = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = copyNum;
                }
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n*6. Сдвиг элементов массива");
        String[] stringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int lengthArr = 0;
        for (String stringA : stringArr) {
            if (!stringA.equals("") && !stringA.contains(" ")) {
                lengthArr++;
            }
        }
        String[] stringArr2 = new String[lengthArr];
        int position = 0;
        for (int i = 0; i < stringArr.length; i++) {
            int j = i;
            while (!stringArr[i].equals("") && !stringArr[i].contains(" ")) {
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

    private static int takeValue(int[] numbers, int i) {
        boolean sign = false;
        for (int j = i + 1; j < numbers.length; j++) {
            if (numbers[j] != 0 && numbers[j] != 9) {
                sign = true;
                break;
            }
        }
        if (sign) {
            System.out.print(numbers[i] + " * ");
        } else {
            System.out.print(numbers[i] + " = ");
        }
        return numbers[i];
    }
    private static void printDoubleArr(double[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%8.3f ", arr[i]);
            if (i == index) {
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
