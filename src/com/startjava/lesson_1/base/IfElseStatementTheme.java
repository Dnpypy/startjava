package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java : ");
        int age = 41;
        String gender = "male";
        double height = 1.75;
        String name = "Maxx";

        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше 20");    
        }

        boolean isMaleGender = gender == "male";

        if (!isMaleGender) {
            System.out.println("Пол женский");
        } else {
            System.out.println("Пол мужской");
        }

        if (height < 1.80) {
            System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост больше 1.80");
        }

        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени " + 'M');
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени " + 'I');
        } else {
            System.out.println("Другая первая буква имени");
        }

        System.out.println("\n2.Поиск max и min числа : ");
        int a = 44;
        int b = 260;

        if (a > b) {
            System.out.println("Максимальное число a : " + a + "\n" + "Минимальное число b : " + b);
        } else if (b > a) {
            System.out.println("Максимальное число b : " + b + "\n" + "Минимальное число a : " + a);
        } else {
            System.out.println("Числа a и b равны!");
        }

        System.out.println("\n3.Проверка числа : ");
        int srcNum = -23;

        if (srcNum == 0) {
            System.out.println("Число : " + srcNum + " равно нулю");
        } else {
            if (srcNum % 2 == 0) {
                System.out.println("Число : " + srcNum + " четное");
            } else {
                System.out.println("Число : " + srcNum + " нечетное");
            }

            if (srcNum > 0) {
                System.out.println("Число : " + srcNum + " положительное");
            } else {
                System.out.println("Число : " + srcNum + " отрицательное");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах : ");
        int num1 = 444;
        int num2 = 444;
        
        System.out.println("Исходное число num1 : " + num1);
        System.out.println("Исходное число num2 : " + num2);

        int hundreds1 = num1 / 100;
        int ten1 = num1 / 10 % 10;
        int one1 = num1 % 10;

        int hundreds2 = num2 / 100;
        int ten2 = num2 / 10 % 10;
        int one2 = num2 % 10;
        
        if (hundreds1 != hundreds2 && ten1 != ten2 && one1 != one2) {
            System.out.println("Равных цифр нет!");
        } else {
            if (hundreds1 == hundreds2) {
                System.out.println("В числах " + num1 + " " + num2 + " одинаковое число : " + hundreds1);
                System.out.println("Цифра " + hundreds1 + " находится в третьем разряде сотен");
            } 
            if (ten1 == ten2) {
                System.out.println("В числах " + num1 + " " + num2 + " одинаковое число : " + ten1);
                System.out.println("Цифра " + ten1 + " находится в втором разряде десятков");
            } 
            if (one1 == one2) {
                System.out.println("В числах " + num1 + " " + num2 + " одинаковое число : " + one1);
                System.out.println("Цифра " + one1 + " находится в первом разряде единиц");
            }
        }
        
        System.out.println("\n5.Определение символа по его коду : ");
        char unknownChar = '('; 
        
        if (unknownChar >= 'a' && unknownChar <= 'z') {
            System.out.println("\nМаленькая буква : " + unknownChar);
        } else if (unknownChar >= 'A' && unknownChar <= 'Z') {  
            System.out.println("\nБольшая буква : " + unknownChar);
        } else if (unknownChar >= '0' && unknownChar <= '9') {
            System.out.println("\nЧисло : " + unknownChar);
        } else {
            System.out.println("Символ " + unknownChar + "\nНе буква и не число");
        }
         
        System.out.println("\n6.Подсчет суммы вклада и начисленных банком % : ");
        int depositAmount = 300_000; // сумма вклада
        int border100_000 = 100_000; // граница вклада 1
        int border300_000 = 300_000; // граница вклада 2

        double percent5 = 5.0;
        double percent7 = 7.0;
        double percent10 = 10.0;
        double accruedInterest = 0.0; 
    
        if (depositAmount >= border100_000 && depositAmount < border100_000) {
            accruedInterest = depositAmount * percent7 / 100;
        } else if (depositAmount >= border300_000) {
            accruedInterest = depositAmount * percent10 / 100; 
        } else {
            accruedInterest = depositAmount * percent5 / 100; // depositAmount < border100_000
        }

        double sumPercentTotal = depositAmount + accruedInterest; 
        
        System.out.println("Сумма вклада : " + depositAmount + "\nНачисленный процент : " + accruedInterest + 
                            "\nИтоговая сумма с % : " + sumPercentTotal);

        System.out.println("\n7.Определение оценки по предметам : ");
        double historyPercent = 59;
        double programmingPercent = 91;
        int borderPercent60 = 60;
        int borderPercent73 = 73;
        int borderPercent91 = 91;
        int historyGrade = 2;
        
        if (historyPercent > borderPercent60 && historyPercent < borderPercent73) {
            historyGrade = 3;
        } else if (historyPercent > borderPercent73 && historyPercent < borderPercent91) {
            historyGrade = 4;
        } else if (historyPercent >= borderPercent91) {
            historyGrade = 5;
        } 

        System.out.println("Оценка : " + historyGrade + " история");
        int programmingGrade = 2;
        if (programmingPercent > borderPercent60 && programmingPercent < borderPercent73) {
            programmingGrade = 3;
        } else if (programmingPercent >= borderPercent73 && programmingPercent < borderPercent91) {
            programmingGrade = 4;
        } else if (programmingPercent >= borderPercent91) {
            programmingGrade = 5;
        }

        System.out.println("Оценка : " + programmingGrade + " программирование");
        System.out.println("Средняя оценка по предметам : " + ((historyGrade + programmingGrade) / 2));
        System.out.println("Средний % по предметам : " + ((historyPercent + programmingPercent) / 2));

        System.out.println("\n8.Расчет прибыли за год : ");
        int roomPrice = 5000; 
        int averageProduct = 13000; 
        int costPrice = 9000; 

        int annualProfit = 12 * (averageProduct - costPrice  + roomPrice);

        if (annualProfit > 0) {
            System.out.println("Прибыль за год : +" + annualProfit + "руб");
        } else {
            System.out.println("Прибыль за год : " + annualProfit + "руб");
        }
        
        System.out.println("\n9.Подсчет количества банкнот : ");
        
        int cashingOut = 567;
        System.out.println("\tСумма = " + cashingOut + " $");

        /** ПЕРЕМЕННЫЕ БАНКНОТ **/
        int atmBanknoteNominal100 = 10; // номинал банкнот 100
        int atmBanknoteNominal10 = 5;  // номинал банкнот 10
        int atmBanknoteNominal1 = 50;   // номинал банкнот 1
        
        /** ПОДСЧЕТ **/
        // Количество банкнот 100
        int count100 = cashingOut / 100; 
        if (count100 > atmBanknoteNominal100) { 
            count100 = atmBanknoteNominal100;  
        }
        cashingOut -= 100 * count100; 
        // Количество банкнот 10   
        int count10 = cashingOut / 10; 
        if (count10 > atmBanknoteNominal10) { 
            count10 = atmBanknoteNominal10;   
        }
        cashingOut -= 10 * count10; 
        // Количество банкнот 1
        int count1 = cashingOut;
        if (count1 > atmBanknoteNominal1) {
            count1 = atmBanknoteNominal1;
        }

        /** ВЫВОД БАНКНОТ **/
        System.out.println("\n\tБанкнот :");
        System.out.printf("\t100 $: %2d", count100);
        System.out.printf("\n\t10 $: %2d", count10);
        System.out.printf("\n\t1 $: %2d", count1);
        System.out.println("\n\tВыдаваемая сумма: " + (count100 * 100 + count10 * 10 + count1) + " $");              
    }   
}