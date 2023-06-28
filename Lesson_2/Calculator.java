public class Calculator {

    private int num1;
    private int num2;
    private char sign;
    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // проверка математической операции
    public boolean setSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign ==  '%') {
            this.sign = sign;
            return false;
        } else {
            System.out.println("введенная математическая операция не поддерживается!");
            return true;
        }
    }

    // проверка на ответ yes/no
    public boolean answered(String str) {
        if (str.equals("no") || str.equals(" ")) {
            return false;
        }
        return true;
    }

    public char getSign() {
        return sign;
    }

    // вычисления
    public void calculate() {
        var result = 0;
        switch (sign) {
            case '+' :
                result = num1 + num2;
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
                result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1; 
                }
                break;
            case '%' :
                result = num1 % num2;
                break;
            default :
                break;
            }
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}
