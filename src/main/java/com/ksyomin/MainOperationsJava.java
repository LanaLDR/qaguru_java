package com.ksyomin;

public class MainOperationsJava {
    public static void main(String[] args) {
//Типы данных и их диапазоны
        // Запомнить можно по степени двойки -1, и 3 положительной границы вычитаем 1
        byte typeByte; // -128 ... 127, 8 битное число
        short typeShort; //-32 768 ... 32 767, 16 битное число
        long typeLong; //-9 223 372 036 854 775 808 ... 9 223 372 036 854 775 807, 64 битное число
        int typeInt; // -2 147 483 648 до 2 147 483 647, 32 битное число
        float typeFloat; // 1.4e-45 ... 3.4e+38, 32 битное
        double typeDouble; //4.9e-324 до 1.7e+308, 64 битное
        boolean typeBoolean; //true/false
        char typeChar; // символы Юникода

        // Математические операции
        int a = 10;
        int b = 5;

        System.out.println("Математические операции:");
        System.out.println("a + b = " + (a + b)); // Сложение
        System.out.println("a - b = " + (a - b)); // Вычитание
        System.out.println("a * b = " + (a * b)); // Умножение
        System.out.println("a / b = " + (a / b)); // Целочисленное деление
        System.out.println("a % b = " + (a % b)); // Остаток от деления

        // Логические операции
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("\nЛогические операции:");
        System.out.println("isTrue && isFalse = " + (isTrue && isFalse)); // Логическое И (AND)
        System.out.println("isTrue || isFalse = " + (isTrue || isFalse)); // Логическое ИЛИ (OR)
        System.out.println("!isTrue = " + !isTrue); // Логическое отрицание (NOT)

        // Переполнение памяти при вычислениях
        System.out.println("\nПереполнение памяти при вычислениях:");
        int largeNumber = Integer.MAX_VALUE;
        System.out.println("Большое число: " + largeNumber);
        System.out.println("Большое число + 1: " + (largeNumber + 1)); // Здесь произойдет переполнение


        //Комбинация различных типов данных
        int intValue = 10;
        double doubleValue = 3.14;
        float floatValue = 2.71f;
        long longValue = 1000000000L;

        double sum1 = intValue + doubleValue; // Результат будет double
        float sum2 = intValue + floatValue;   // Результат будет float
        double sum3 = doubleValue + longValue; // Результат будет double
        long product = intValue * longValue;   // Результат будет long

        // Вывод результатов
        System.out.println("\nКомбинация различных типов данных:");
        System.out.println("intValue + doubleValue = " + sum1);
        System.out.println("intValue + floatValue = " + sum2);
        System.out.println("doubleValue + longValue = " + sum3);
        System.out.println("intValue * longValue = " + product);
    }
}