public class CyclesTheme {
    public static void main(String[] args){
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int x = 0, y = 0;
        int num1 = -10, num2 =21;
        do{
            if(num1 % 2 == 0){
                x += num1;
            } else {
                y += num1;
            }
            num1++;
        } while (num1 <= num2);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + x + ", а нечетных = " 
                + y);

        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания");
        num1 = 10; 
        num2 = 5;
        int i;
        int num3 = -1, min, max;
        if(num1 > num2){
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        if(max < num3){
            max = num3;
        }
        if(min > num3){
            min = num3;
        }
        for(i = max - 1; i > min; i--){
            System.out.print(i+" ");
        }
        System.out.println("");

        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        num2 = 0;
        while(num1 != 0){
            System.out.print(num1 % 10 + " ");
            num2 += num1 % 10;
            num1 /= 10;
        }
        System.out.println("Сумма = " + num2);

        System.out.println("4. Вывод чисел на консоль в несколько строк");
        num1 = 1;
        num2 = 24;
            for(i = num1+1; i < num2; i += 2){
                System.out.printf("%3d ", i);
                while((i >= (num2 - 2)) && (i % 5 != 0)){
                    System.out.printf("%3d ", 0);
                    i += 2;
                }
                if(i % 5 == 0)
                    System.out.println("");
            }

        System.out.println("5. Проверка количества единиц на четность");
        num1 = 3141591;
        int numTmp = num1;
        num2 = 0;
        while(num1 != 0){
            if(num1 % 10 == 1){
                num2++;
            }
            num1 /= 10;
        }
        if(num2 % 2 == 0)
            System.out.println("число " + numTmp + " содержит " + num2 + " (четное) количество единиц");
        else 
            System.out.println("число " + numTmp + " содержит " + num2 + " (нечетное) количество единиц");

        System.out.println("6. Отображение фигур в консоли");
        num1 = 50;
        for(i = 1; i <= num1; ++i){
            System.out.print("*");
            if(i % 10 == 0)
                System.out.println("");
        }
        num1 = 5;
        i = 0;
        while(num1 > 0){
            System.out.print("#");
            i++;
            if(num1 == i){
                System.out.println("");
                i = 0;
                num1--;
            }
        }
        i = 3;
        num1 = 0;
        num2 = 1;
        num3 = 1;
        do{
            if(num2 > 0){
                System.out.print("$");
                num1 += num2;
                if(num1 == num3){
                    if(num1 == i){
                        num2 *= -1;
                    }
                    System.out.println("");
                        num1 = 0;
                        num3 += num2;
                    }
                } else {
                    System.out.print("$");
                    num3 += num2;
                    if(num1 == num3){
                    System.out.println("");
                        num3 += num2;
                }
            }
            if(num3 == -2)
                System.out.println("");
        }while(num3 >= -1);

        System.out.println("7. Отображение ASCII-символов");
        num1 = 49;
        num2 = 97;
        num3 = 122;
        for(i = 0; i <= num3; i++){
            if(i <= num1 && i % 2 != 0)
                System.out.printf("%4d %4c\n", i, i);
            else if(i >= num2 && i % 2 == 0)
                System.out.printf("%4d %4c\n", i, i);
            if(i == num1)
                i = num2;
        }

        System.out.println("8. Проверка, является ли число палиндромом");
        num1 = 1234321;
        num2 = 0;
        numTmp = num1;
        while(true){
            num2 += num1 % 10;
            num1 /= 10;
            if(num1 == 0) 
                break;
            num2 *= 10;
        }
        if(num2 == numTmp){
            System.out.println("число " + numTmp + " является палиндромом");
        } else {
            System.out.println("число " + numTmp + " не является палиндромом");
        }
        
        System.out.println("9. Определение, является ли число счастливым");
        String isHappy = "";
        num1 = 127321;
        num2 = num1 % 1000;
        int sumNum1 = 0, sumNum2 = 0, tmpNum1 = 0, tmpNum2 = 0;
        numTmp = num1;
        while(num1 > 1000){
            num1 /= 10;
        }
        tmpNum1 = num1;
        tmpNum2 = num2;
        while(num1 != 0 || num2 != 0){
            sumNum2 += num2 % 10;
            num2 /= 10;
            sumNum1 += num1 % 10;
            num1 /= 10;
        }
        if(sumNum1 == sumNum2){
            isHappy = " является счастливым";
        } else {
            isHappy = " не является счастливым";
        }
        System.out.println("Сумма цифр " + tmpNum1 + " = " + sumNum1 + "\nСумма цифр " + tmpNum2 + 
            " = " + sumNum2 +"\nЧисло " + numTmp + isHappy);

        System.out.println("10. Вывод таблицы умножения Пифагора");
        num1 = 10;
        for (i = 1; i < num1; i++) {
            for (int j = 1; j < num1; j++) {
                if(j == 1 & i == 1){
                    System.out.print("   |");
                } else if (j == 1){
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