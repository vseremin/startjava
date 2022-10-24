public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 20;
        boolean isMale = true;
        double height = 1.89;
        if (age > 20) {
            System.out.println("age > 20");
        } else {
            System.out.println("age <= 20");
        }
        if (!isMale) {
            System.out.println("female");
        } else {
            System.out.println("male");
        }
        if (height > 1.80) {
            System.out.println("height > 1.80");
        } else {
            System.out.println("height <= 1.80");
        }
        char firstLetterName = "Vyacheslav".charAt(0);
        if (firstLetterName == 'М') {
            System.out.println("M");
        } else if (firstLetterName == 'I') {
            System.out.println("I");
        } else {
            System.out.println("Other");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = -43; 
        int num2 = -12;
        if (num1 > num2) {
            System.out.println("Число a = " + num1 + " больше числа b = " + num2);
        } else if (num2 > num1) {
            System.out.println("Число b = " + num2 + " больше числа a = " + num1);
        } else {
            System.out.println("Числа a = " + num1 + " и число b = " + num2 + " равны");
        }

        System.out.println("\n3. Работа с числом");
        num1 = 17;
        if (num1 == 0) {
            System.out.println("Число " + num1 + " равно нулю");
        } else {
            if ((num1 % 2) == 0) {
                System.out.println("Число " + num1 + " четное");
            } else {
                System.out.println("Число " + num1 + " нечетное");
            }
            if (num1 > 0) {
                System.out.println("Число " + num1 + " положительное");
            } else {
                System.out.println("Число " + num1 + " отрицательное");
            }
        }
        
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 723;
        num2 = 784;
        if (num1 % 10 != num2 % 10 && (num1 / 10) % 10 != (num2 / 10) % 10 && 
                (num1 / 100) % 10 != (num2 / 100) % 10) {
            System.out.println("У чисел " + num1 + " и " + num2 + 
                    " одинаковых цифр в одном и том же разряде нет");
        } else {
            if (num1 % 10 == num2 % 10) {
                System.out.println("У чисел " + num1 + " и " + num2 + " одинаковые цифры " + 
                        num1 % 10 + " в " + " 1 разряде");
            }
            if ((num1 / 10) % 10 == (num2 / 10) % 10) {
                System.out.println("У чисел " + num1 + " и " + num2 + " одинаковые цифры " + 
                        (num1 / 10) % 10 + " во " + " 2 разряде");
            }
            if ((num1 / 100) % 10 == (num2 / 100) % 10) {
                System.out.println("У чисел " + num1 + " и " + num2 + " одинаковые цифры " + 
                        (num1 / 100) % 10 + " в " + "3 разряде");
            }
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char code = '\u0057';
        if (code >= '0' && code <= '9') {
            System.out.println(code + " это число");
        } else if (code >= 'A' && code <= 'Z') {
            System.out.println(code + " это большая буква");
        } else if (code >= 'a' && code <= 'z') {
            System.out.println(code + " это маленькая буква");
        } else {
            System.out.println(code + " не число и не буква");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int percent = 0;
        if (deposit < 100_000) {
            percent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        } else {
            percent = 10;
        }
        System.out.println("Сумма вклада = " + deposit + "\nНачисленный процент = " + 
                deposit * percent / 100 + "\nИтоговая сумма = " + (deposit + 
                deposit * ((double) percent / 100)));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 2;
        int programmingGrade = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        System.out.println("Оценка по программированию = " + programmingGrade + 
                " Оценка по истории = " + historyGrade + "\nСредний бал = " + 
                (1.0*programmingGrade + historyGrade) / 2 + "\nСредний % = " + 
                (1.0*programmingPercent + historyPercent) / 2);

        System.out.println("\n8. Расчет прибыли");
        int rentalPrice = 5000;
        int costPrice = 9000;
        int revenue = 13000;
        int profit = 12 * (revenue - costPrice - rentalPrice);
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else if (profit < 0) {
            System.out.println("Прибыль за год: " + profit);
        } else {
            System.out.println("Прибыль = 0");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int sum = 576;
        int sumTmp = sum;
        int atmBanknotesValue100 = 10;
        int numBanknotesValue100 = 0;
        int atmBanknotesValue10 = 5;
        int numBanknotesValue10 = 0;
        int atmBanknotesValue1 = 50;
        int numBanknotesValue1 = 0;
        int n = 100;
        if ((sum / 100) <= atmBanknotesValue100) {
            numBanknotesValue100 = sum / 100;
            atmBanknotesValue100 -= numBanknotesValue100;
            sum -= 100 * numBanknotesValue100;
        } else if ((sum / 100) > atmBanknotesValue100) {
            numBanknotesValue100 = atmBanknotesValue100;
            atmBanknotesValue100 -= numBanknotesValue100;
            sum -= 100 * numBanknotesValue100;
        }
        if (sum / 10 <= atmBanknotesValue10) {
            numBanknotesValue10 = sum % 10;
            atmBanknotesValue10 -= numBanknotesValue10;
            sum -= 10 * numBanknotesValue10;
        } else {
            numBanknotesValue10 = atmBanknotesValue10;
            atmBanknotesValue10 -= numBanknotesValue10;
            sum -= 10 * numBanknotesValue10;
        }
        if (sum <= atmBanknotesValue1) {
            numBanknotesValue1 = sum;
            atmBanknotesValue1 -= numBanknotesValue1;
            sum -= numBanknotesValue1;
        } else {
            System.out.println("В банкомате недостаточно денег нужного номинала!");
        }
        System.out.println("Количество банкнот номиналом 100 = " + numBanknotesValue100 + 
                " сумма = " + numBanknotesValue100*100 + "\nКоличество банкнот номиналом 10 = " + 
                numBanknotesValue10 + " сумма = " + numBanknotesValue10*10 + 
                "\nКоличество банкнот номиналом 1 = " + numBanknotesValue1 + " сумма = " + 
                numBanknotesValue1 + "\nНеобходимая сумма: " + 
                (numBanknotesValue100 * 100 + numBanknotesValue10 * 10 + numBanknotesValue1));
    }
} 
