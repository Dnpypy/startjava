
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
        this.sign = sign;
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign ==  '%') {
            return false;
        } else {
            System.out.println("введенная математическая операция не поддерживается!");
            return true;
        }
        
    }

    public char getSign() {
        return sign;
    }

    // вычисления
    public void calculate() {
        var result = 0;
        switch (getSign()) {
            case '+' :
                result = getNum1() + getNum2();
                //System.out.println(result);
                break;
            case '-' :
                result = getNum1() - getNum2();
                break;
            case '*' :
                result = getNum1() * getNum2();
                break;
            case '/' :
                result = getNum1() / getNum2();
                break;
            case '^' :
                var temp = 1;
                for (int i = 1; i <= getNum2(); i++) {
                    temp *= getNum1(); 
                }
                result = temp;
              break;
            case '%' :
                result = getNum1() % getNum2();
                break;
            default :
                break;
            }
            System.out.println(getNum1() + " " + getSign() + " " + getNum2() + " = " + result);
    }
}
