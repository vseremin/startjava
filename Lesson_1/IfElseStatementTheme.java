public class IfElseStatementTheme{
    public static void main(String[] args){
        System.out.println("1. Перевод псевдокода на язык Java (это название задачи)");
        int age = 20;
        boolean maleGender = true;
        double height = 1.90;
        char firstLetterOfTheName = "Мария".charAt(0);
        if(age > 20){
            System.out.println("age > 20");
        } else {
            System.out.println("age <= 20");
        }
        if(!maleGender){
            System.out.println("female");
        } else {
            System.out.println("male");
        }
        if(height > 1.80){
            System.out.println("height > 1.80");
        } else {
            System.out.println("height <= 1.80");
        }
        if(firstLetterOfTheName == 'М'){
            System.out.println("M");
        } else if (firstLetterOfTheName == 'I') {
            System.out.println("I");
        } else {
            System.out.println("Other");
        }

        System.out.println("2. Поиск max и min числа");
        int a = 43, b = -12;
        if(a > b){
            System.out.println("Число a = " + a + " больше числа b = " + b);
        } else if (b < a ) {
            System.out.println("Число b = " + b + " больше числа a = " + a);
        } else {
            System.out.println("Числа a = " + a + " и число b = " + b + " равны");
        }

        System.out.println("3. Работа с числом");
        int number = 17;
        if(number == 0){
            System.out.println("Число " + number + " равно нулю");
        } else {
            if ( (number % 2) == 0){
                System.out.println("Число " + number + " четное");
            } else {
                System.out.println("Число " + number + " нечетное");
            }
            if (number >= 0){
                System.out.println("Число " + number + " не отрицательное");
            } else {
                System.out.println("Число " + number + " отрицательное");
            }
        }
        
        System.out.println("4. Поиск одинаковых цифр в числах");
        int first = 574, second = 784;
        int firstTmp = first, secondTmp = second;
        int i = 1, j = 0;
        while(first != 0 || second != 0){
            if(first % 10 == second % 10){
                System.out.println("У числа " + firstTmp + " и " + secondTmp + " одинаковые числа " 
                 + first % 10 + " в " + i + " разряде");
                j++;
            }
            first /= 10;
            second /=10;
        }
        if(j == 0){
            System.out.println("У числа " + firstTmp + " и " + secondTmp + " одинаковых чисел нет");
        }

        System.out.println("5. Определение буквы, числа или символа по их коду");
        char code = '\u0057';
        if((int) code >= '0' && (int) code <= '9'){
            System.out.println(code + " это число");
        } else if ((int) code >= 'A' && (int) code <= 'Z'){
            System.out.println(code + " это большая буква");
        } else if ((int) code >= 'a' && (int) code <= 'z'){
            System.out.println(code + " это маленькая буква");
        } else {
            System.out.println(code + " не число и не буква");
        }

        System.out.println("6. Определение суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        int percent = 0;
        if(depositAmount < 100_000){
            percent = 5;
        } else if (depositAmount >= 100_000 && depositAmount <= 300_000){
            percent = 7;
        } else {
            percent = 10;
        }
        System.out.println("Сумма вклада = " + depositAmount + "\nНачисленный процент = " + 
            depositAmount * percent / 100 + "\nИтоговая сумма = " + (depositAmount + 
            depositAmount * ((double) percent / 100)));

        System.out.println("7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyAssessment = 0;
        int programmingAssessment = 0;
        if(historyPercent <= 60){
            historyAssessment = 2;
        } else if (historyPercent > 60 && historyPercent <= 73){
            historyAssessment = 3;
        } else if (historyPercent > 73 && historyPercent <= 91){
            historyAssessment = 4;
        } else {
            historyAssessment = 5;
        }
        if(programmingPercent <= 60){
            programmingAssessment = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73){
            programmingAssessment = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91){
            programmingAssessment = 4;
        } else {
            programmingAssessment = 5;
        }
        System.out.println("Оценка по программированию = " + programmingAssessment + 
            " Оценка по истории = " + historyAssessment + "\nСредний бал = " + 
            (1.0*programmingAssessment + historyAssessment) / 2 + "\nСредний % = " + 
            (1.0*programmingPercent + historyPercent) / 2);

        System.out.println("8. Расчет прибыли");
        int rentalPrice = 5000;
        int costPrice = 9000;
        int revenue = 13000;
        if((revenue - costPrice - rentalPrice) > 0){
            System.out.println("Прибыль = +" + (revenue - costPrice - rentalPrice));
        } else if ((revenue - costPrice - rentalPrice) < 0){
            System.out.println("Прибыль = " + (revenue - costPrice - rentalPrice));
        } else {
            System.out.println("Прибыль = 0");
        }

        System.out.println("9. Подсчет количества банкнот");
        int summa = 576;
        int summaTmp = summa;
        int nominal100 = 10;
        int number100 = 0;
        int nominal10 = 5;
        int number10 = 0;
        int nominal1 = 50;
        int number1 = 0;
        int n = 100;
        if((summa / 100) <= nominal100){
            number100 = summa / 100;
            nominal100 -= number100;
            summa -= 100 * number100;
        } else if((summa / 100) > nominal100){
            number100 = nominal100;
            nominal100 -= number100;
            summa -= 100 * number100;
        }
        if(summa / 10 <= nominal10){
            number10 = summa % 10;
            nominal10 -= number10;
            summa -= 10 * number10;
        } else {
            number10 = nominal10;
            nominal10 -= number10;
            summa -= 10 * number10;
        }
        if(summa <= nominal1){
            number1 = summa;
            nominal1 -= number1;
            summa -= number1;
        } else {
            System.out.println("В банкомате недостаточно денег нужного номинала!");
        }
        System.out.println("Количество банкнот номиналом 100 = " + number100 + " сумма = " + 
            number100*100 + "\nКоличество банкнот номиналом 10 = " + number10 + " сумма = " + 
            number10*10 + "\nКоличество банкнот номиналом 1 = " + number1 + " сумма = " + 
            number1 + "\nНеобходимая сумма: " + (number100 * 100 + number10 * 10 + number1));
    }
}