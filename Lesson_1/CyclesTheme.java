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
        int max = 0;
        int min = 0;

        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        if (min > num3){
            min = num3;
        }

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        if (max < num3){
            max = num3;
        }

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
        
        int fiveNum = 5;
        if (counter <= 5) {
            fiveNum -= counter;
            for (int i = 0;i <= fiveNum ; i++) {
                System.out.printf("%2d", 0);
                System.out.print(" ");
            }
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность: ");
        int copyNum = 324259222;
        num = copyNum; // для вывода в конце
        int remainder = 0; // остаток от числа
        int countTwos = 0; // количество двоек

        while (copyNum != 0) {
            remainder = copyNum % 10; 
            copyNum /= 10; //откидываю крайнее число
            if (remainder % 10 == 2) {
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
            System.out.print("#");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        int space = 0; // в первой строке количество пробелов в начале строки 0
        int gratings = 5; // в первой строке количество решеток равно ширине
        while (gratings > 0) { // пока есть решетки для вывода
            for (int i = 0;i < space; i++) {
                System.out.println(" ");
            }
            for (int i = 0; i < gratings; i++) { //потом выводим решеток штук
                System.out.print("#");
            }
            System.out.println(); //переводим курсор
            // готовимся к следующей итерации цикла
            gratings--; //решеток на одну меньше
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
                System.out.printf("%2d", i);
                System.out.print(" " + perevod(i));
                System.out.println();
            }
            if (i % 2 == 0 && i >= 97) {
                System.out.printf("%2d", i);
                System.out.print(" " + perevod(i));
                System.out.println();
            }
        }    

        System.out.println("\n8.Проверка, является ли число палиндромом : ");
        
        num = 1234321;
        int revertNumber = 0;
        copyNum = num;

        while (copyNum > 0) {
            remainder = copyNum % 10;
            revertNumber = (revertNumber * 10) + remainder;
            copyNum /= 10;
        }
        
        if (num == revertNumber) {
            System.out.println("число " + num + " является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым : ");
        num = 424424; 
        copyNum = num;
        counter = 1;
        int firstThreeNumbers = 0;
        int twosThreeNumbers = 0;

        while (counter != 7) {
            if (counter < 4) {
                firstThreeNumbers += num % 10;
                num /= 10;
            } else {
                twosThreeNumbers += num % 10;
                num /= 10;
            }
            counter++;
        }
        System.out.println(firstThreeNumbers);
        System.out.println(twosThreeNumbers);

        if ((firstThreeNumbers == twosThreeNumbers)) {
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