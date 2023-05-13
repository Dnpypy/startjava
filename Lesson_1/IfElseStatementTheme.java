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
        int checkValue = -23;

        if (checkValue == 0) {
                System.out.println("Число : " + checkValue + " равно нулю");
        } else {
            if (checkValue != 0) {
                if (checkValue % 2 == 0) {
                    System.out.println("Число : " + checkValue + " четное");
                } else {
                    System.out.println("Число : " + checkValue + " нечетное");
                }

                if (checkValue > 0) {
                    System.out.println("Число : " + checkValue + " положительное");
                } else {
                    System.out.println("Число : " + checkValue + " отрицательное");
                }
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
        char chValue = '\u0057';
        int iChar = (int) chValue;
        int iChar2 = 0;

        if (chValue >= 'A' && chValue <= 'Z') {  
            iChar2 += iChar + 32;
            System.out.println("Символ : " + chValue + " маленькая буква : " + (char)iChar2 + "\n" +
             "код числа совпадает : " + iChar);
        } else {
            if (!(chValue >= 'A' && chValue <= 'z') && !(chValue >= '0' && chValue <= '9')) {
                System.out.println("Символ " + chValue);
                System.out.println("Не буква и не число");
            }
            
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком % : ");
        int depositAmount = 300_000; // сумма вклада
        int sumBorder1 = 100_000; // граница вклада 1
        int sumBorder2 = 300_000; // граница вклада 2

        double percent1 = 5.0;
        double percent2 = 7.0;
        double percent3 = 10.0;

        double percentPlus = 0.0;  
    
        if (depositAmount < sumBorder1) {
            percentPlus = depositAmount * percent1 / 100;
        } else if (depositAmount >= sumBorder1 && depositAmount < sumBorder1) {
            percentPlus = depositAmount * percent2 / 100;
        } else if (depositAmount >= sumBorder2) {
            percentPlus = depositAmount * percent3 / 100;    
        }

        double sumPercentTotal = depositAmount + percentPlus; 

        System.out.println("Сумма вклада : " + depositAmount + "\nНачисленный процент : " + percentPlus + 
                            "\nИтоговая сумма с % : " + sumPercentTotal);

        System.out.println("\n7.Определение оценки по предметам : ");
        double historyProcent = 59;
        double programmingProcent = 91;
        int grade1 = 0;
        int grade2 = 0;
        int borderProcent1 = 60;
        int borderProcent2 = 73;
        int borderProcent3 = 91;

        if (historyProcent <= borderProcent1) {
            grade1 = 2;
        } else if (historyProcent > borderProcent1) {
            grade1 = 3;
        } else if (historyProcent > borderProcent2) {
            grade1 = 4;
        } else if (historyProcent > borderProcent3) {
            grade1 = 5;
        }

        System.out.println("Оценка : " + grade1 + " история");

        if (programmingProcent <= borderProcent1) {
            grade2 = 2;
        } else if (programmingProcent > borderProcent1 && programmingProcent < borderProcent2) {
            grade2 = 3;
        } else if (programmingProcent >= borderProcent2 && programmingProcent < borderProcent3) {
            grade2 = 4;
        } else if (programmingProcent >= borderProcent3) {
            grade2 = 5;
        }

        System.out.println("Оценка : " + grade2 + " программирование");
        System.out.println("Средняя оценка по предметам : " + ((grade1 + grade2) / 2));
        System.out.println("Средний % по предметам : " + ((historyProcent + programmingProcent) / 2));

        System.out.println("\n8.Расчет прибыли за год : ");
        int roomPrice = 5000; 
        int averageProduct = 13000; 
        int costPrice = 9000; 

        int annualProfit = ((averageProduct * 12) - ((costPrice * 12) + (5000 * 12)));
        System.out.println("Прибыль за год : " + annualProfit);

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