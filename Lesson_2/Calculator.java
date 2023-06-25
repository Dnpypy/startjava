
public class Calculator {

    private int cycle; 
    public int num1;
    public int num2;
    public char sign;
    public static char signPrint; // для отображение знака в выводе и для вычисления
    
    public Calculator(int cycle) {
        this.cycle = cycle;
    }

    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    public int getCycle() {
        return cycle;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }

    public char getSign(){
        return sign;
    }

    // вычисления
    public void calculations(int num1, int num2) {
        var result = 0;
        switch (signPrint) {
            case '+' :
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            case '^' :
                var temp = 1;
                for (int i = 1; i <= num2; i++) {
                    temp *= num1; 
                }
                result = temp;
              break;
            case '%' :
                result = num1 % num2;
                break;
            default :
                break;
            }
            System.out.println(num1 + " " + signPrint + " " + num2 + " = " + result);
    }

    // проверка математического знака
    public int checkSign(char ch) {
        signPrint = ch;
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch ==  '%') {
            return 0;
        } else {
            errorTextSign();
            return 1;
        }
    }

    void errorTextSign() {
        System.out.println("введенная математическая операция не поддерживается!");
    }

    void textSign() {
        System.out.println("Введите знак математической операции: ");
    }
}
