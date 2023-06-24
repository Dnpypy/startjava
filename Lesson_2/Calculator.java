import java.util.Scanner;

public class Calculator {

    private int result; 
    private int cycle; 
    private static Scanner sc = new Scanner(System.in);
    public static int num1;
    public static int num2;
    public static char sign;

    public Calculator(int result, int cycle) {
        this.result = result;
        this.cycle = cycle;
    }

    public int setResult(int result) {
        return result;
    }

    public int setCycle(int cycle) {
        return cycle;
    }

    public void cycleRun() {

        while (cycle > 1) {
            System.out.println("Введите первое число: ");
            int num1 = sc.nextInt();
            System.out.println("Введите знак математической операции: ");
            char sign = sc.next().charAt(0);
            System.out.println("Введите второе число: ");
            int num2 = sc.nextInt();
            
            switch (sign) {
                case '+' :
                    setResult(num1 + num2);
                    break;
                case '-' :
                    setResult(num1 - num2);
                    break;
                case '*' :
                    setResult(num1 * num2);
                    break;
                case '/' :
                    setResult(num1 / num2);
                    break;
                case '^' :
                    result = 1;
                    for (int i = 1; i <= num2; i++) {
                        result *= num1; 
                    }
                    break;
                case '%' :
                    setResult(num1 % num2);
                    break;
                default :
                    errorTextSign();
                    break;
                }
                System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
                contiProgramm();
        }
    }

    public void contiProgramm() {
        textContinueProgramm();
        var yesNo = sc.next();
        if (yesNo.equals("no")) {
            setCycle(cycle -= 1);
            sc.close();
        } 

    }

    public void nameProgramm() {
        System.out.println("\nКалькулятор : ");
    }

    public void errorTextSign() {
        System.out.println("введенная математическая операция не поддерживается!");
    }
    
    public void textContinueProgramm() {
        System.out.println("Хотите продолжить вычисления? [yes/no]: ");
    }
}