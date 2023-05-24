public class CyclesTheme {
    public static void  main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел : ");
        int count = -10;
        int sumX = 0;
        int sumY = 0;
        do {
            if (count % 2 == 0) {
                sumX += count;
            } else {
                sumY += count;
            }
            count++;
        } while (count <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumX + "," +
         " а нечетных = " + sumY);
        
        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания : ");
        int ten = 10;
        int five = 5;
        int one = -1;
        int max = 0;
        int min = 0;

        if (ten < min) {
            min = ten;
        } 
        if (five < min) {
            min = five;    
        } 
        if (one < min) {
            min = one;
        }

        if (five > max) {
            max = five;
        } 
        if (ten > max) {
            max = ten;    
        }
        if (one > max) {
            max = one;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.println(i);
        }

        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр : ");
        int num = 1234;
        int a, b, c, d;
        
        while (num != 0) {
            a = (num / 10) % 10; // 3 
            b = (num / 10 / 10) % 10; // 2 
            c = (num / 10 / 10 / 10) % 10; // 1
            d = num % 10; // 4
            num = 0;
            System.out.println(d + "\n" + a + "\n" + b + "\n" + c);
            System.out.println("Сумма цифр : " + a + b + c + d);
        }

        System.out.println("\n4.Вывод чисел на консоль в несколько строк: ");
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%2d", i);
            System.out.print(" ");
            if (i % 5 == 0 && i < 10) {
                System.out.printf("%2d", 0);
                System.out.printf("%2d", 0);
                System.out.println();
            }
            if (i % 5 == 0 && i > 10) {
                System.out.println();
            }
            if (i == 23) {
                System.out.printf("%2d", 0);
            }
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность: ");
        int aNum = 3242592;
        int bNum = aNum; // для вывода в конце
        int remainder = 0; // остаток от числа
        int sumTwo = 0; // количество двоек

        while (aNum != 0) {
            remainder = aNum % 10; 
            aNum = aNum /= 10; //откидываю крайнее число
            if (remainder == 2) {
                sumTwo++;
            }
            
        }
        
        if (sumTwo % 2 == 0) {
            System.out.println("число " + bNum + " содержит " + sumTwo + " четное количество двоек");
        } else {
            System.out.println("число " + bNum + " содержит " + sumTwo + " нечетное количество двоек");
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
        int numMain = 1234321;
        int num1 = numMain / 1000000;
        int num2 = numMain / 100000 % 10;
        int num3 = numMain / 10000 % 10;
        
        int num4 = numMain / 1000 % 10;
        
        int num5 = numMain / 100 % 10;
        int num6 = numMain / 10 % 10;
        int num7 = numMain % 10;
        
        if (num1 == num7 && num2 == num6 && num3 == num5) {
            System.out.println("число " + numMain + " является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым : ");
        int lucky = 424424;
        num2 = lucky / 100000 % 10;
        System.out.println(num2);
        num3 = lucky / 10000 % 10;
        System.out.println(num3);
        num4 = lucky / 1000 % 10;
        System.out.println(num4);    
        num5 = lucky / 100 % 10;
        System.out.println(num5);
        num6 = lucky / 10 % 10;
        System.out.println(num6);
        num7 = lucky % 10;
        System.out.println(num7);

        System.out.println("" + num2 + "" + num3 + "" + num4 +" = " + num5 + "" + num6 + "" + num7);

        if ((num2 + num3 + num4 == num5 + num6 + num7)) {
            System.out.println("Число " + lucky + " счастливое!");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора : ");
        int i, j;
        System.out.printf(" * |");
        for (i = 2; i < 10; i++){
            System.out.printf("%2d ", i);
        }
        System.out.printf("\n---|------------");
        System.out.printf("----------------\n");
        for (i = 2;i < 10; i++) {
            System.out.printf("%2d |", i);
            for (j = 1; j < 10; j++) {
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