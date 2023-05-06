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
        int sumGoods = pricePen + priceBook;
        int discountSum = (sumGoods / 100) * discount; 
        int discountPrice = sumGoods - discountSum;

        System.out.println("\nобщую стоимость товаров без скидки: " + sumGoods +" руб");
        System.out.println("сумму скидки : " + discountSum + " руб");
        System.out.println("общую стоимость товаров со скидкой : " + discountPrice + " руб");

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("   J    a  v     v  a     \n" +
                           "   J   a a  v   v  a a    \n" +
                           "J  J  aaaaa  V V  aaaaa  \n"+
                           " JJ  a     a  V  a     a ");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 2  ^ 63 - 1;

        System.out.println("первоначальное значение byte : " + maxByte);
        System.out.println("значение после инкремента на единицу byte : " + ++maxByte);
        System.out.println("значение после декремента на единицу byte: " + --maxByte);

        System.out.println("\nпервоначальное значение short : " + maxShort);
        System.out.println("значение после инкремента на единицу short : " + ++maxShort);
        System.out.println("значение после декремента на единицу short : " + --maxShort);

        System.out.println("\nпервоначальное значение int : " + maxInt);
        System.out.println("значение после инкремента на единицу int : " + ++maxInt);
        System.out.println("значение после декремента на единицу int : " + --maxInt);

        System.out.println("\nпервоначальное значение long : " + maxLong);
        System.out.println("значение после инкремента на единицу long : " + ++maxLong);
        System.out.println("значение после декремента на единицу long : " + --maxLong);

        System.out.println("\n5.Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("с помощью третьей переменной :" + "\n" + "исходные значения переменных");
        System.out.println(a + "\n" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("новые значения переменных");
        System.out.println(a + "\n" + b);

        System.out.println("\nс помощью арифметических операций" + "\n" + "исходные значения переменных");
        System.out.println(a + "\n" + b);

        a += b; 
        b = a - b; 
        a -= b; 

        System.out.println("новые значения переменных");
        System.out.println(a + "\n" + b);

        System.out.println("\nс помощью побитовой операции ^ :" + "\n" + "исходные значения переменных");
        System.out.println(a + "\n" + b);

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("новые значения переменных");
        System.out.println(a + "\n" + b);

        System.out.println("\n6.Вывод символов и их кодов");
        char numberSign = '#';
        char ampersand = '&';
        char atSign = '@';
        char caret = '^';
        char underscore = '_'; 

        System.out.println((int) numberSign + " " + numberSign);
        System.out.println((int) ampersand + " " + ampersand);
        System.out.println((int) atSign + " " + atSign);
        System.out.println((int) caret + " " + caret);
        System.out.println((int)  underscore + " " +  underscore);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char backslash = '\\';
        char underscoreX1 = '_';
        char leftBracket = '(';
        char rightBracket = ')';

        System.out.println("    " + slash + backslash + "\n" +
                "   " + slash + "  " + backslash + "\n" +
                "  " + slash + underscoreX1 + leftBracket + " " + rightBracket + backslash + "\n" +
                " " + slash + "      " + backslash);
 
        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundred = number / 100;
        int tens = number / 10 % 10;
        int ones = number % 10;

        System.out.println("Число " + number + " содержит : " + "\n" +  
                "сотен : " + hundred + "\n" +
                "десятков : " + tens + "\n" +
                "единиц : "  + ones);
       
       System.out.println("Сумма его цифр: " + (hundred + tens + ones));
       System.out.println("Произведение : " + (hundred * tens * ones));

       System.out.println("\n9.Вывод времени");
       int time = 86399;
       int hour = time / 3600;
       int minute = time / 60 % 60;
       int seconds = time % 60;

       System.out.printf("%02d" + ":" + "%02d" + ":" + "%02d", hour, minute, seconds);
    }
}