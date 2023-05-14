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
        char unknownChar = '\u0097'; // 'a' 
        
        if (unknownChar >= '\u0097' && unknownChar <= '\u0122') {
            System.out.println("\nМаленькая буква : " + unknownChar);
        } else if (unknownChar >= '\u0065' && unknownChar <= '\u0090') {  
            System.out.println("\nБольшая буква : " + unknownChar);
        } else if (unknownChar >= '\u0048' && unknownChar <= '\u0057') {
            System.out.println("\nЧисло : " + unknownChar);
        } else {
            if (!(unknownChar >= '\u0097' && unknownChar <= '\u0122') && 
                !(unknownChar >= '\u0065' && unknownChar <= '\u0090') &&
                !(unknownChar >= '\u0048' && unknownChar <= '\u0057')) {
                System.out.println("Символ " + unknownChar + "\nНе буква и не число");
            }
        }
         
        System.out.println("\n6.Подсчет суммы вклада и начисленных банком % : ");
        int depositAmount = 300_000; // сумма вклада
        int border100_000 = 100_000; // граница вклада 1
        int border300_000 = 300_000; // граница вклада 2

        double percent5 = 5.0;
        double percent7 = 7.0;
        double percent10 = 10.0;
        double accruedInterest = 0.0;  
    
        if (depositAmount < border100_000) {
            accruedInterest = depositAmount * percent5 / 100;
        } else if (depositAmount >= border100_000 && depositAmount < border100_000) {
            accruedInterest = depositAmount * percent7 / 100;
        } else if (depositAmount >= border300_000) {
            accruedInterest = depositAmount * percent10 / 100;    
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
        
        if (historyPercent > borderPercent60) {
            historyGrade = 3;
        } else if (historyPercent > borderPercent73) {
            historyGrade = 4;
        } else if (historyPercent > borderPercent91) {
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
        int bankomatCash = 1100;
        int dollarCashWith = 567;
        String infoNominal = "";
        String infoCashpayment = "";
        String infoErrorPayment = "";
        String infoAllCashPayment = "";

        if (dollarCashWith > bankomatCash) {
            infoErrorPayment = "В банкомате нет нужной суммы!!";
        } else {
            infoAllCashPayment = "Выдаваемую сумму : " + dollarCashWith + " USD";
            if ((dollarCashWith > 99 && (dollarCashWith < 1000))) {
            infoNominal = "\nНоминалы банкнот : " + "\n100" + "\n10" + "\n1";
            int hundred = dollarCashWith / 100;
            int tens = dollarCashWith / 10 % 10;
            int ones = dollarCashWith % 10;
            if (tens >= 5) {
                int nominalOnes = (tens - 5) * 10;
                tens = 5;
                infoCashpayment = "\nТребуемое их количество : \n" + hundred + " банкнот номиналом 100 \n" + 
                    tens + " банкнот номиналом 10\n" + (ones + nominalOnes) + " банкнот номиналом 1\n";    
            } else {
                infoCashpayment = "\nТребуемое их количество : \n" + hundred + " банкнот номиналом 100 \n" + 
                              tens + " банкнот номиналом 10\n" + ones + " банкнот номиналом 1\n";
            }
        
            } else if ((dollarCashWith > 9 && (dollarCashWith < 100))) {
                infoNominal = "\nНоминалы банкнот : " + "\n10" + "\n1";
                int tens = dollarCashWith / 10 % 10;
                int ones = dollarCashWith % 10;
                if (tens >= 5) {
                    int nominalOnes = (tens - 5) * 10;
                    tens = 5;
                    infoCashpayment = "\nТребуемое их количество : \n" + tens + " банкнот номиналом 10\n" + 
                        (ones + nominalOnes) + " банкнот номиналом 1\n";    
                } else {
                    infoCashpayment = "\nТребуемое их количество : \n" + tens + " банкнот номиналом 10\n" + ones + 
                        " банкнот номиналом 1\n"; 
                }
                
            } else if ((dollarCashWith > 0 && (dollarCashWith < 10))) {
                int ones = dollarCashWith % 10;
                infoNominal = "\nНоминалы банкнот : " + "\n";
                infoCashpayment = "\nТребуемое их количество : \n" + ones + " банкнот номиналом 1\n";
            }
        }
        
        System.out.println(infoNominal);
        System.out.println(infoCashpayment);
        System.out.println(infoAllCashPayment);
        System.out.println(infoErrorPayment);
    }   
}