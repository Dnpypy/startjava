public class CyclesTheme {
    public static void  main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел : ");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + "," +
         " а нечетных = " + sumOdd);
        
        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания : ");
        int num1 = 5;
        int num2 = 10;
        int num3 = -1;
        
        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;

        temp = num1 < num2 ? num1 : num2;
        int min = temp < num3 ? temp : num3;

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр : ");
        int num = 1234;
        int sumDigits = 0;
        
        while (num > 0) {
            int remainder = num % 10; // остаток от числа
            System.out.print(remainder); // цифры в строку ... ... .. .. 
            num /= 10; //откидываю крайнее число
            sumDigits += remainder;
        }
        System.out.println("\nСумма цифр : " + sumDigits);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк: ");

        counter = 1;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%2d", i);
            System.out.print(" ");
            if (counter == 5) {
                System.out.println();
                counter = 1;
            } else {
                counter++;
            }
        }
        
        int border = 5;
        if (counter <= border) {
            border -= counter;
            // если было counter = 1, то не захожу в цикл с нулями
            if (border == 4) { 
                int temp2; // объявил переменную временную
            } else {
                for (int i = 0;i <= border; i++) {
                    System.out.printf("%2d", 0);
                    System.out.print(" ");
                }
            }
            
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность: ");
        num = 324259222;
        int copyNum = num; // для вывода в конце
        int remainder = 0; // остаток от числа
        int countTwos = 0; // количество двоек

        while (copyNum > 0) {
            copyNum /= 10; //откидываю крайнее число
            if (copyNum % 10 == 2) {
                countTwos++;
            }
        }
        
        if (countTwos % 2 == 0) {
            System.out.println("число " + num + " содержит " + countTwos + " четное количество двоек");
        } else {
            System.out.println("число " + num + " содержит " + countTwos + " нечетное количество двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли: ");
        for (int i = 1; i <= 50 ; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        int space = 0; 
        int gratings = 5; 
        while (gratings > 0) { 
            for (int i = 0;i < space; i++) {
                System.out.println(" ");
            }
            for (int i = 0; i < gratings; i++) { 
                System.out.print("#");
            }
            System.out.println(); 
            gratings--; 
        }

        System.out.println();

        int countLine = 1; // количество строк
        do {
            if (countLine == 1 || countLine == 5) {
                System.out.print("$  ");
            } else if (countLine == 2 || countLine == 4) {
                System.out.print("$$ ");
            } else if (countLine == 3) {
                System.out.print("$$$");
            } 
            System.out.println();
            countLine++;
        } while (countLine != 6);
        
        System.out.println("\n7.Отображение ASCII-символов: ");
        System.out.println("Таблица : Dec  Char");
        
        for (int i = 1; i <= 122 ; i++) {
            if (i % 2 != 0 && i < 48) {
                System.out.printf("%2s", perevod(i) + "\n");
            }
            if (i % 2 == 0 && i >= 97) {
                System.out.printf("%2s", perevod(i) + "\n");
            }
        }    

        System.out.println("\n8.Проверка, является ли число палиндромом : ");
        
        num = 1234321;
        int revertNum = 0;
        copyNum = num;

        while (copyNum > 0) {
            remainder = copyNum % 10;
            revertNum = (revertNum * 10) + remainder;
            copyNum /= 10;
        }
        
        if (num == revertNum) {
            System.out.println("число " + num + " является палиндромом");
        } else {
            System.out.println("число " + num + "не является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым : ");
        num = 424424; 
        copyNum = num;
        counter = 1;
        int firstThreeNums = 0;
        int twosThreeNums = 0;

        while (counter != 7) {
            if (counter < 4) {
                firstThreeNums += num % 10;
                num /= 10;
            } else {
                twosThreeNums += num % 10;
                num /= 10;
            }
            counter++;
        }
        System.out.println(firstThreeNums);
        System.out.println(twosThreeNums);

        if ((firstThreeNums == twosThreeNums)) {
            System.out.println("Число " + copyNum + " счастливое!");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора : ");

        System.out.printf(" * |");
        for (int i = 2; i < 10; i++){
            System.out.printf("%2d ", i);
        }
        System.out.printf("\n---|------------");
        System.out.printf("----------------\n");
        for (int i = 2;i < 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.printf("\n");
        } 
    }

    // метод переводящий из int -> char для 7-й задачи
    public static char perevod (int ch) {
          return (char) ch;
    }
}