public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numberCores = 16;
        short numberThreads = 32;
        long maxMemorySizeByte = 128;
        float baseFraquency = 3.4f;
        double turboBoostFraquency = 4.9;
        int serialProcessorNumber = 5950;
        char serialProcessorSymbol = 'X';
        boolean unlockedMultiplier = true;
        System.out.println("Процессор AMD Ryzen 9 " + serialProcessorNumber + serialProcessorSymbol 
                + "\nКоличество ядер: " + numberCores + "\nКоличество потоков: " + 
                numberThreads + "\nМаксимальный объем памяти: " + maxMemorySizeByte + 
                " Гб\nБазовая частота: " + baseFraquency+ " ГГц\nМаксимальная частота: " + 
                turboBoostFraquency + " ГГц\n"+ "Множитель разблокирован: " + unlockedMultiplier);

        System.out.println("2. Расчет стоимости товара со скидкой");
        double pricePen = 100;
        double priceBook = 200;
        double discountAmount = (pricePen + priceBook) * 0.11;
        double discontPrice = pricePen + priceBook - discountAmount;
        System.out.println("Сумма скидки = " + discountAmount + "\nОбщая стоимость = " + 
                discontPrice);

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a      \n   J   a a  v   v  a a    \n"+
                "J  J  aaaaa  V V  aaaaa    \n JJ  a     a  V  a     a");

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Max byte = " + maxByte + "; max short = " + maxShort + "; max int = " + 
                maxInt + "; max long = " + maxLong + "\nMax byte = " + ++maxByte + 
                "; max short = " + ++maxShort + "; max int = " + ++maxInt + "; max long = " + 
                ++maxLong + "\nMax byte = " + --maxByte + "; max short = " + --maxShort + 
                "; max int = " + --maxInt + "; max long = " + --maxLong);

        System.out.println("5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Перестановка с помощью третьей переменной \nfirst = " + num1 + 
                " second = " + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Итоговые значения first = " + num1 + " second = " + num2);
        System.out.println("Перестановка с помощью арифметических операций \nfirst = " + num1 + 
                " second = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Итоговые значения first = " + num1 + " second = " + num2);
        System.out.println("Перестановка с помощью побитовой операции ^ \nfirst = " + num1 + 
                " second = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Итоговые значения first = " + num1 + " second = " + num2);

        System.out.println("6. Вывод символов и их кодов");
        char char1 = '#';
        char char2 = '&';
        char char3 = '@';
        char char4 = '^'; 
        char char5 = '_';
        System.out.println((int) char1 + " " + char1 + "\n" + (int) char2 + " " + 
                char2 + "\n" + (int) char3 + " " + char3 + "\n" + (int) char4 + 
                " " + char4 + "\n" + (int) char5 + " " + char5);

        System.out.println("7. Отображение количества сотен, десятков и единиц числа");
        int sourceNumber = 123;
//        int copyNumber = sourceNumber;
        int z = sourceNumber % 10;
        int y = (sourceNumber / 10) % 10;
        int x = (sourceNumber / 100) % 10;
        System.out.println("Число N = " + sourceNumber + " содержит:\n" + z + " единиц\n" + y + 
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
        int resultSum = sourceNumber % 10 + (sourceNumber / 10) % 10 + (sourceNumber / 100) % 10;
        int resultMultiplication = sourceNumber % 10 * ((sourceNumber / 10) % 10) *
                ((sourceNumber / 100) % 10);
        System.out.println("сумма цифр числа " + sourceNumber + " = " + resultSum + 
                "\nпроизвендение числа " + sourceNumber + " = " + resultMultiplication);

        System.out.println("10. Преобразование секунд");
        sourceNumber = 86399;
        int sec = sourceNumber % 60;
        int min = (sourceNumber / 60) % 60;
        int hour = (sourceNumber / 3600) % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}
