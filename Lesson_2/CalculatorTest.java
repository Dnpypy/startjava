import java.util.Scanner;

public class CalculatorTest {
    public static void  main(String[] args) {
        System.out.println("\nКалькулятор : \n");
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        
        boolean yesNo = true;
        do {
            System.out.println("Введите первое число: ");
            calc.setNum1(sc.nextInt());
            
            var inputCheckSign = true;
            do {
                System.out.println("Введите знак математической операции: ");
                inputCheckSign = calc.setSign(sc.next().charAt(0));
            } while (inputCheckSign);
            
            System.out.println("Введите второе число: ");
            calc.setNum2(sc.nextInt());
            
            calc.calculate();
            
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            yesNo = calc.answered(sc.next());
        } while(yesNo);
        //}
    }
}