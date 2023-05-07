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

        boolean isGenderMale = gender == "male" ? true : false;
        if (!isGenderMale) {
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
        int a = 26;
        int b = 245;
        int min, max, temp;

        if (a > b) {
            max = a;
            min = b;     
            System.out.println("Максимальное число a : " + a + "\n" + "Минимальное число b : " + b);
        } else if (b > a) {
            max = b;
            min = a;
            System.out.println("Максимальное число b : " + b + "\n" + "Минимальное число a : " + a);
        } else {
            System.out.println("Числа a и b равны!");
        }

        temp = a;
        a = b;
        b = temp;

        if (a > b) {
            max = a;
            min = b;     
            System.out.println("Максимальное число a : " + a + "\n" + "Минимальное число b : " + b);
        } else if (b > a) {
            max = b;
            min = a;
            System.out.println("Максимальное число : b " + b + "\n" + "Минимальное число a : " + a);
        } else {
            System.out.println("Числа a и b равны!");
        }

        a = b;

        if (a > b) {
            max = a;
            min = b;     
            System.out.println("Максимальное число a : " + a + "\n" + "Минимальное число b : " + b);
        } else if (b > a) {
            max = b;
            min = a;
            System.out.println("Максимальное число : b " + b + "\n" + "Минимальное число a : " + a);
        } else {
            System.out.println("Числа a и b равны!");
        }

        System.out.println("\n3.Проверка числа : ");
        int value = -11;

        if (!(value == 0)) {
            if (value % 2 == 0) {
                System.out.println("Число : " + value + " четное");
            } else {
                System.out.println("Число : " + value + " нечетное");
            }

            if (value > 0) {
                System.out.println("Число : " + value + " положительное");
            } else {
                System.out.println("Число : " + value + " отрицательное");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах : ");
        int num1 = -525;
        int num2 = -522;
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        System.out.println("Исходное число num1 : " + num1);
        System.out.println("Исходное число num2 : " + num2);

        int n1 = num1 / 100;
        int n2 = num1 / 10 % 10;
        int n3 = num1 % 10;

        System.out.println("");

        int n4 = num2 / 100;
        int n5 = num2 / 10 % 10;
        int n6 = num2 % 10;
        
        if (((num1 & num2) > 99 || ((num1 & num2) < 1000))) {
            if (n1 != n4 && n2 != n5 && n3 != n6) {
                System.out.println("Равных цифр нет!");
            } else {
                if (n1 == n4) {
                    System.out.println("В числах " + num1 + " " + num2 + " одинаковое число : " + n1);
                    System.out.println("Цифра " + n1 + " находится в третьем разряде сотен");
                } 
                if (n2 == n5) {
                    System.out.println("В числах " + num1 + " " + num2 + " одинаковое число : " + n2);
                    System.out.println("Цифра " + n2 + " находится в втором разряде десятков");
                } 
                if (n3 == n6) {
                    System.out.println("В числах " + num1 + " " + num2 + " одинаковое число : " + n3);
                    System.out.println("Цифра " + n3 + " находится в первом разряде единиц");
                }
            }
        }

        System.out.println("\n5.Определение символа по его коду : ");
        char chValue = '\u0057';
        int iChar = (int) chValue;
        int iChar2 = 0;

        if (chValue != 'w') {
            iChar2 += iChar + 32;
            System.out.println("Символ : " + chValue + " маленькая буква : " + (char)iChar2);
        }
        if (chValue == '\u0057') {
            System.out.println("Символ " + chValue);
        }
        if (chValue == 'W') {
            System.out.println("Символ : " + chValue + " код числа совпадает : " + iChar);
        }
        if (!(chValue >= 'A' && chValue <= 'z') || !(chValue >= '0' && chValue <= '9')) {
            System.out.println("Не буква и не число");
        }
        
        System.out.println("\n6.Подсчет суммы вклада и начисленных банком % : ");
        int depositAmount = 300_000;
        int sumBorder1 = 100_000;
        int sumBorder2 = 300_000;

        double procent1 = 5.0;
        double procent2 = 7.0;
        double procent3 = 10.0;

        double podschet = 0.0;
    
        if (depositAmount < sumBorder1) {
            podschet = depositAmount * procent1 / 100;
        } else if (depositAmount >= sumBorder1 && depositAmount < sumBorder1) {
            podschet = depositAmount * procent2 / 100;
        } else if (depositAmount >= sumBorder2) {
            podschet = depositAmount * procent3 / 100;    
        }

        double allSum = depositAmount + podschet;

        System.out.println("Сумма вклада : " + depositAmount + "\nНачисленный процент : " + podschet + 
                            "\nИтоговая сумма с % : " + allSum);

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