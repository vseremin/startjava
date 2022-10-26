public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNum = 0; 
        int sumOddNum = 0;
        int num1 = -10;
        int num2 = 21;
        do{
            if (num1 % 2 == 0) {
                sumEvenNum += num1;
            } else {
                sumOddNum += num1;
            }
            num1++;
        } while (num1 <= num2);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvenNum + 
                ", а нечетных = " + sumOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        num1 = 10; 
        num2 = 5;
        int num3 = -1;
        int min = num1;
        int max = num2;
        if (min > num2) {
            min = num2;
        } 
        if (max < num1) {
            max = num1;
        }
        if (max < num3) {
            max = num3;
        }
        if (min > num3) {
            min = num3;
        }
        int i = --max;
        for ( ; i > min; i--) {
            System.out.print(i+" ");
        }
        System.out.println("");

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        num2 = 0;
        int sum = 0;
        while (num1 != 0) {
            num2 *= 10;
            num2 += (num1 % 10);
            sum += num1 % 10;
            num1 /= 10;
        }
        System.out.println("Исходное число в обратном порядке = " + num2 + " Сумма = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        num1 = 1;
        num2 = 24;
            for (i = ++num1; i < num2; i += 2) {
                System.out.printf("%3d ", i);
                while ((i >= (num2 - 2)) && (i % 5 != 0)) {
                    System.out.printf("%3d ", 0);
                    i += 2;
                }
                if (i % 5 == 0) {
                    System.out.println("");
                }
            }

        System.out.println("\n5. Проверка количества единиц на четность");
        num1 = 3141591;
        int copyNum1 = num1;
        sum = 0;
        while (num1 != 0) {
            if (num1 % 10 == 1) {
                sum++;
            }
            num1 /= 10;
        }
        if (num2 % 2 == 0) {
            System.out.println("число " + copyNum1 + " содержит " + sum + 
                    " (четное) количество единиц");
        } else {
            System.out.println("число " + copyNum1 + " содержит " + sum + 
                    " (нечетное) количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        num1 = 50;
        for (i = 1; i <= num1; ++i) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println("");
            }
        }
        num1 = 5;
        i = 0;
        while (num1 > 0) {
            System.out.print("#");
            i++;
            if (num1 == i) {
                System.out.println("");
                i = 0;
                num1--;
            }
        }
        i = 3;
        num1 = 0;
        num2 = 1;
        num3 = 1;
        do {
            if (num2 > 0) {
                System.out.print("$");
                num1 += num2;
                if (num1 == num3) {
                    if (num1 == i) {
                        num2 *= -1;
                        i--;
                    }
                    System.out.println("");
                        num1 = 0;
                        num3 += num2;
                    }
                } else {
                    System.out.print("$");
                    num3 += num2;
                    if (num1 == num3) {
                    System.out.println("");
                        num3 = --i;
                    }
                }
        } while (i > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        num1 = 49;
        num2 = 97;
        num3 = 122;
        for (i = 0; i <= num3; i++) {
            if (i <= num1 && i % 2 != 0) {
                System.out.printf("%4d %4c\n", i, i);
            } else if (i >= num2 && i % 2 == 0) {
                System.out.printf("%4d %4c\n", i, i);
            }
            if (i == num1) {
                i = num2;
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num1 = 1234321;
        num2 = 0;
        copyNum1 = num1;
        while (num1 / 10 >= num2) {
            if (num1 / 10 == num2) {
                num1 /= 10;
            } else {
                num2 *= 10;
                num2 += num1 % 10;
                num1 /= 10; 
            }
        }
        if (num2 == num1) {
            System.out.println("число " + copyNum1 + " является палиндромом");
        } else {
            System.out.println("число " + copyNum1 + " не является палиндромом");
        }
        
        System.out.println("\n9. Определение, является ли число счастливым");
        String isHappy = "";
        num1 = 127321;
        num2 = num1 % 1000;
        int copyNum = num1;
        while (num1 > 1000) {
            num1 /= 10;
        }
        copyNum1 = num1;
        int copyNum2 = num2;
        int sumNum1 = 0;
        int sumNum2 = 0;
        while (num1 != 0 || num2 != 0) {
            sumNum2 += num2 % 10;
            num2 /= 10;
            sumNum1 += num1 % 10;
            num1 /= 10;
        }
        if (sumNum1 == sumNum2) {
            isHappy = " является счастливым";
        } else {
            isHappy = " не является счастливым";
        }
        System.out.println("Сумма цифр " + copyNum1 + " = " + sumNum1 + "\nСумма цифр " + copyNum2 + 
                " = " + sumNum2 +"\nЧисло " + copyNum + isHappy);

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        num1 = 10;
        for (i = 1; i < num1; i++) {
            for (int j = 1; j < num1; j++) {
                if (j == 1 & i == 1) {
                    System.out.print("   |");
                } else if (j == 1) {
                    System.out.printf("%3d|",i * j);
                } else {
                    System.out.printf("%4d",i * j);
                }
            }
            System.out.println("");
            if(i == 1)
                System.out.println("-------------------------------------");
        }
    }
} 
