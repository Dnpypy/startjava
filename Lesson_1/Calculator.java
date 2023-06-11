public class Calculator {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : ");

        int num1 = 2;
        int num2 = 4;
        char sign = '^';
        int result = 0;

        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            int temp = 1;
            for (int i = 1; i <= num2; i++) {
                temp = temp * num1; 
            }
            result = temp;
        } else if (sign == '%') {
            result = num1 % num2;
        }

        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}