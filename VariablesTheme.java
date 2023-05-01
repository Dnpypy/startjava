public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера : ");
        byte core = 3; 
        short logicalCpu = 6;
        int systemType = 64; 
        long ram = 8_000_000L; 
        float cpuSpeed = 3.3f; 
        double coreSpeedAccurate = 1406.19; 
        char allRightsReserved = '#'; 
        boolean windowsActive;
        
        String os = System.getProperty("os.name").toLowerCase();
        
        if (os.equals("windows 7")) {
            windowsActive = true;
        } else {
            windowsActive = false;
        }

        System.out.println("ядер:" + core);
        System.out.println("логических процессов: " + logicalCpu);
        System.out.println(systemType + "-битная разрядная операционная система");
        System.out.println("8 гб оперативной памяти( в десятичной " + ram + " KB)");
        System.out.println("тактовая частота процессора " + cpuSpeed);
        System.out.println("тактовая частота процессора сейчас " + coreSpeedAccurate);
        System.out.println("На компьютере windows 7? " + windowsActive);
        System.out.println(allRightsReserved + " Корпорация Майкрософт");
        
        System.out.println("\n2. Расчет стоимости товара со скидкой :");
        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;
        int discountFull = 100;
        int sumGoods = pricePen + priceBook;
        int discountSum = ((pricePen + priceBook) / discountFull ) * discount;
        int discountPrice = sumGoods - discountSum * discount;

        System.out.println("\nобщую стоимость товаров без скидки: " + sumGoods +" руб");
        System.out.println("сумму скидки : " + discountSum + " руб");
        System.out.println("общую стоимость товаров со скидкой : " + discountPrice + " руб");

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("   J    a  v     v  a     \n" +
                           "   J   a a  v   v  a a    \n" +
                           "J  J  aaaaa  V V  aaaaa  \n"+
                           " JJ  a     a  V  a     a ");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte  maxByte = 127;
        short maxShort = 32_767;
        int   maxInt = 2_147_483_647;
        long  maxLong = 2  ^ 63 - 1;

        System.out.printf("\n первоначальное значение byte : %d" , maxByte);
        maxByte++;
        System.out.printf("\n значение после инкремента на единицу byte : %d" , maxByte);
        maxByte--;
        System.out.printf("\n значение после декремента на единицу : %d\n" , maxByte);

        System.out.printf("\n первоначальное значение short : %d" , maxShort);
        System.out.printf("\n значение после инкремента на единицу short : %d" , maxShort++);
        System.out.printf("\n значение после декремента на единицу short: %d\n" , maxShort--);

        System.out.printf("\n первоначальное значение int : %d" , maxInt);
        System.out.printf("\n значение после инкремента на единицу int : %d" , maxInt++);
        System.out.printf("\n значение после декремента на единицу int: %d\n" , maxInt--);

        System.out.printf("\n первоначальное значение long : %d" , maxLong);
        System.out.printf("\n значение после инкремента на единицу long : %d" , maxLong++);
        System.out.printf("\n значение после декремента на единицу long: %d\n" , maxLong--);

        System.out.println("\n5.Перестановка значений переменных");
        int value1 = 2;
        int value2 = 5;
        int value3;
        System.out.println("с помощью третьей переменной :");
        System.out.println("исходные значения переменных");
        System.out.println(value1);
        System.out.println(value2);

        value3 = value1;
        value1 = value2;
        value2 = value3;

        System.out.println("новые значения переменных");
        System.out.println(value1);
        System.out.println(value2);

        System.out.println("\nс помощью арифметических операций");
        System.out.println("исходные значения переменных");
        System.out.println(value1);
        System.out.println(value2);

        int value4 = 3;
        value1 -= value4;
        value2 += value4;

        System.out.println("новые значения переменных");
        System.out.println(value1);
        System.out.println(value2);

        System.out.println("\nс помощью побитовой операции ^ :");
        System.out.println("исходные значения переменных");
        System.out.println(value1);
        System.out.println(value2);

        value1 = value1 ^ value2 ^ (value2 = value1);

        System.out.println("новые значения переменных");
        System.out.println(value1);
        System.out.println(value2);

        System.out.println("\n6.Вывод символов и их кодов");
        char symbol1 = '#';
        char symbol2 = '&';
        char symbol3 = '@';
        char symbol4 = '^';    
        char symbol5 = '_'; 

        System.out.print((int)symbol1);
        System.out.print(" ");
        System.out.println (symbol1);
        System.out.print((int)symbol2);
        System.out.print(" ");
        System.out.println (symbol2);
        System.out.print((int)symbol3);
        System.out.print(" ");
        System.out.println (symbol3);
        System.out.print((int)symbol4);
        System.out.print(" ");
        System.out.println (symbol4);
        System.out.print((int)symbol5);
        System.out.print(" ");
        System.out.println (symbol5);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        
        String symbol6 = "/";
        String symbol7 = "\\";
        String symbol8 = "_";
        String symbol9 = "(";
        String symbol10 = ")";
        String symbol11 = "____";
        String symbol12 = "__";

       System.out.println("    " + symbol6 + symbol7 + "    \n" +
                          "   "  + symbol6 + "  " + symbol7 + "   \n" +
                          "  "   + symbol6 + symbol8 + symbol9 + " " + symbol10 + symbol7 + "  \n" +
                          " "    + symbol6 + "      " + symbol7 + "\n" +
                         symbol6 + symbol11 + symbol6 + symbol7 + symbol12 + symbol7);

       System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
       int number = 123;
       int hundred = 123 / 100;
       int dozens = 123 / 10 % 10;
       int unit = 123 % 10;

       System.out.printf("Число %d содержит :\n", number);
       System.out.printf("%d сотен\n", hundred);
       System.out.printf("%d десятков\n",dozens);
       System.out.printf("%d единиц\n",unit);

       System.out.print("Сумма его цифр: ");
       System.out.println(hundred + dozens + unit);

       System.out.print("Произведение : ");
       System.out.println(hundred * dozens * unit);

       System.out.println("\n9.Вывод времени");
       int time = 86399;
       int hour = (time %((60 * 60 * 24)) / 60 / 60);
       int minute = time / 60 % 60;
       int seconds =(time % (60*60)) % 60;

       System.out.printf("%02d" + ":" + "%02d" + ":" + "%02d", hour, minute, seconds);
    }
}