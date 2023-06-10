public class Calculator {
    public static void  main(String[] args) {

        System.out.println("\nКалькулятор : ");

        int num1 = 2;
        int num2 = 4;
        int count = 1;

        char plus = '+';
        char minus = '-';
        char multi = '*';
        char div = '/';
        char degree = '^';
        char mod = '%';
        char sign = ' ';

        char choicePlayer = '^';
        int result = 0;

        while (count != 0) {

            if (choicePlayer == plus) {
                result = num1 + num2;
                sign = plus;
            } else if (choicePlayer == minus) {
                result = num1 - num2;
                sign = minus;
            } else if (choicePlayer == multi) {
                result = num1 * num2;
                sign = multi;
            } else if (choicePlayer == div) {
                result = num1 / num2;
                sign = div;
            } else if (choicePlayer == degree) {
                for (int i = 0; i < num2; i++) {
                    result = num1 * num2; 
                }
                sign = degree;
            } else if (choicePlayer == mod) {
                result = num1 % num2;
                sign = mod;
            }
            count -= 1;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}