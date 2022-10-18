public class Calculator {
    public static void main(String[] args){
        int num1 = 5, num2 = 7;
        int result = 0;
        char sign = '^';
        if(sign == '+'){
            result = num1 + num2;
        } else if(sign == '-'){
            result = num1 - num2;
        } else if(sign == '*'){
            result = num1 * num2;
        } else if(sign == '/'){
            result = num1 / num2;
        } else if(sign == '%'){
            result = num1 % num2;
        } else if(sign == '^'){
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = "  + result);
    }
}