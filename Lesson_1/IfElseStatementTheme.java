public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 20;
        boolean isMale = true;
        double height = 1.89;
        char firstLetterName = "Vyacheslav".charAt(0);
        if(age > 20){
            System.out.println("age > 20");
        } else {
            System.out.println("age <= 20");
        }
        if(!isMale){
            System.out.println("female");
        } else {
            System.out.println("male");
        }
        if(height > 1.80){
            System.out.println("height > 1.80");
        } else {
            System.out.println("height <= 1.80");
        }
        if(firstLetterName == 'М') {
            System.out.println("M");
        } else if (firstLetterName == 'I') {
            System.out.println("I");
        } else {
            System.out.println("Other");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = -43; 
        int num2 = -12;
        if(num1 > num2) {
            System.out.println("Число a = " + num1 + " больше числа b = " + num2);
        } else if (num2 > num1) {
            System.out.println("Число b = " + num2 + " больше числа a = " + num1);
        } else {
            System.out.println("Числа a = " + num1 + " и число b = " + num2 + " равны");
        }

        System.out.println("\n3. Работа с числом");
        num1 = 17;
        if(num1 == 0) {
            System.out.println("Число " + num1 + " равно нулю");
        } else {
            if((num1 % 2) == 0) {
                System.out.println("Число " + num1 + " четное");
            } else {
                System.out.println("Число " + num1 + " нечетное");
            }
            if(num1 > 0) {
                System.out.println("Число " + num1 + " положительное");
            } else {
                System.out.println("Число " + num1 + " отрицательное");
            }
        }
        
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 723;
        num2 = 784;
        int num1Tmp = num1;
        int num2Tmp = num2;
        int i = 1;
        int j = 0;
        while(num1 != 0 || num2 != 0) {
            if(num1 % 10 == num2 % 10) {
                System.out.println("У числа " + num1Tmp + " и " + num2Tmp + " одинаковые цифры " 
                 + num1 % 10 + " в " + i + " разряде");
                j++;
            }
            num1 /= 10;
            num2 /=10;
            i++;
        }
        if(j == 0) {
            System.out.println("У числа " + num1Tmp + " и " + num2Tmp + " одинаковых цифр нет");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char code = '\u0057';
        if((int) code >= '0' && (int) code <= '9') {
            System.out.println(code + " это число");
        } else if ((int) code >= 'A' && (int) code <= 'Z') {
            System.out.println(code + " это большая буква");
        } else if ((int) code >= 'a' && (int) code <= 'z') {
            System.out.println(code + " это маленькая буква");
        } else {
            System.out.println(code + " не число и не буква");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int percent = 0;
        if(deposit < 100_000) {
            percent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000){
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
        int historyAssessment = 0;
        int programmingAssessment = 0;
        if(historyPercent <= 60) {
            historyAssessment = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyAssessment = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyAssessment = 4;
        } else {
            historyAssessment = 5;
        }
        if(programmingPercent <= 60) {
            programmingAssessment = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingAssessment = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingAssessment = 4;
        } else {
            programmingAssessment = 5;
        }
        System.out.println("Оценка по программированию = " + programmingAssessment + 
            " Оценка по истории = " + historyAssessment + "\nСредний бал = " + 
            (1.0*programmingAssessment + historyAssessment) / 2 + "\nСредний % = " + 
            (1.0*programmingPercent + historyPercent) / 2);

        System.out.println("\n8. Расчет прибыли");
        int rentalPrice = 5000;
        int costPrice = 9000;
        int revenue = 13000;
        int profit = 12 * (revenue - costPrice - rentalPrice);
        if(profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else if (profit < 0) {
            System.out.println("Прибыль за год: " + profit);
        } else {
            System.out.println("Прибыль = 0");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int sum = 576;
        int sumTmp = sum;
        int nominal100 = 10;
        int num100 = 0;
        int nominal10 = 5;
        int num10 = 0;
        int nominal1 = 50;
        num1 = 0;
        int n = 100;
        if((sum / 100) <= nominal100) {
            num100 = sum / 100;
            nominal100 -= num100;
            sum -= 100 * num100;
        } else if ((sum / 100) > nominal100) {
            num100 = nominal100;
            nominal100 -= num100;
            sum -= 100 * num100;
        }
        if(sum / 10 <= nominal10) {
            num10 = sum % 10;
            nominal10 -= num10;
            sum -= 10 * num10;
        } else {
            num10 = nominal10;
            nominal10 -= num10;
            sum -= 10 * num10;
        }
        if(sum <= nominal1) {
            num1 = sum;
            nominal1 -= num1;
            sum -= num1;
        } else {
            System.out.println("В банкомате недостаточно денег нужного номинала!");
        }
        System.out.println("Количество банкнот номиналом 100 = " + num100 + " сумма = " + 
            num100*100 + "\nКоличество банкнот номиналом 10 = " + num10 + " сумма = " + 
            num10*10 + "\nКоличество банкнот номиналом 1 = " + num1 + " сумма = " + 
            num1 + "\nНеобходимая сумма: " + (num100 * 100 + num10 * 10 + num1));
    }
} 
