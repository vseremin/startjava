public class VariablesTheme{
    
    public static void main(String[] args){
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numberOfCores = 16;
        short numberOfThreads = 32;
        long maxMemorySizeByte = 128;
        float baseFraquency = 3.4f;
        double turboBoostFraquency = 4.9;
        int serialProcessorNumber = 5950;
        char serialProcessorSymbol = 'X';
        boolean unlockedMultiplier = true;
        System.out.println("Процессор AMD Ryzen 9 " + serialProcessorNumber + serialProcessorSymbol 
            + "\nКоличество ядер: " + numberOfCores + "\nКоличество потоков: " + numberOfThreads + 
            "\nМаксимальный объем памяти: " + maxMemorySizeByte + " Гб\nБазовая частота: " +
            baseFraquency+ " ГГц\nМаксимальная частота: " + turboBoostFraquency + " ГГц\n"+
            "Множитель разблокирован: " + unlockedMultiplier);

        System.out.println("2. Расчет стоимости товара со скидкой");
        double priceOfPen = 100;
        double priceOfBook = 200;
        double discountAmount = (priceOfPen + priceOfBook) * 0.11;
        double totalСost = priceOfPen + priceOfBook - discountAmount;
        System.out.println("Сумма скидки = " + discountAmount + "\nОбщая стоимость = " + totalСost);

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a      \n   J   a a  v   v  a a    \n"+
            "J  J  aaaaa  V V  aaaaa    \n JJ  a     a  V  a     a");

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Max byte = " + maxByte + "; max short = " + maxShort + "; max int = " 
            + maxInt + "; max long = " + maxLong);
        maxByte++;
        maxShort++;
        maxInt++;
        maxLong++;
        System.out.println("Max byte = " + maxByte + "; max short = " + maxShort + "; max int = " 
            + maxInt + "; max long = " + maxLong);
        maxByte--;
        maxShort--;
        maxInt--;
        maxLong--;
        System.out.println("Max byte = " + maxByte + "; max short = " + maxShort + "; max int = " + 
            maxInt + "; max long = " + maxLong);

        System.out.println("5. Перестановка значений переменных");
        int first = 2;
        int second = 5;
        System.out.println("Перестановка с помощью третьей переменной \nfirst = " + first + 
            " second = " + second);
        int temp = first;
        first = second;
        second = temp;
        System.out.println("Итоговые значения first = " + first + " second = " + second);
        System.out.println("Перестановка с помощью арифметических операций \nfirst = " + first + 
            " second = " + second);
        first += second;
        second = first - second;
        first -= second;
        System.out.println("Итоговые значения first = " + first + " second = " + second);
        System.out.println("Перестановка с помощью побитовой операции ^ \nfirst = " + first + 
            " second = " + second);
        first ^= second;
        second ^= first;
        first ^= second;
        System.out.println("Итоговые значения first = " + first + " second = " + second);

        System.out.println("6. Вывод символов и их кодов");
        char firstChar = '#';
        char secondChar = '&';
        char thirdChar = '@';
        char fourthChar = '^'; 
        char fifthChar = '_';
        System.out.println((int) firstChar + " " + firstChar + "\n" + (int) secondChar + " " 
            + secondChar + "\n" + (int) thirdChar + " " + thirdChar + "\n" + (int) fourthChar + " "
            + fourthChar + "\n" + (int) fifthChar + " " + fifthChar);

        System.out.println("7. Отображение количества сотен, десятков и единиц числа");
        int sourceNumber = 123;
        int number = sourceNumber;
        int z = sourceNumber % 10;
        sourceNumber /= 10;
        int y = sourceNumber % 10;
        sourceNumber /= 10;
        int x = sourceNumber % 10;
        System.out.println("Число N = " + number + " содержит:\n" + z + " единиц\n" + y + 
            " десяток\n" + x + " сотен");

        System.out.println("8. Вывод на консоль ASCII-арт Дюка");
        char whitespace = ' ';
        char slash = '/';
        char backSlash = '\\';
        char openingParenthesis = '(';
        char closingParenthesis = ')';
        char underline = '_';
        String s1 = Character.toString(whitespace) + whitespace + whitespace + whitespace +
                    slash + backSlash + whitespace + whitespace + whitespace +whitespace;
        String s2 = Character.toString(whitespace) + whitespace + whitespace + slash + whitespace + 
                    whitespace + backSlash + whitespace + whitespace + whitespace +whitespace;
        String s3 = Character.toString(whitespace) + whitespace + slash + underline + 
                    openingParenthesis + whitespace + closingParenthesis + backSlash + whitespace 
                    + whitespace +whitespace;
        String s4 = Character.toString(whitespace) + slash + whitespace + whitespace + whitespace 
                    + whitespace + whitespace + whitespace + backSlash + whitespace + whitespace;
        String s5 = Character.toString(slash) + underline + underline + underline + underline + 
                    slash + backSlash + underline + underline + backSlash + whitespace;
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5);

        System.out.println("9. Произведение и сумма цифр числа");
        sourceNumber = 345;
        number = sourceNumber;
        int resultSum = 0, resultMultiplication = 1;
        while(sourceNumber!=0){
            resultSum += (sourceNumber % 10);
            resultMultiplication *= (sourceNumber % 10);
            sourceNumber /= 10;
        }
        System.out.println("сумма цифр числа " + number + " = " + resultSum + 
            "\nпроизвендение числа " + number + " = " + resultMultiplication);

        System.out.println("10. Преобразование секунд");
        sourceNumber = 86399;
        int sec = sourceNumber % 60;
        sourceNumber /= 60;
        int min = sourceNumber % 60;
        sourceNumber /= 60;
        int hour = sourceNumber;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}