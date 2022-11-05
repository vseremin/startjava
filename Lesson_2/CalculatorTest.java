import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        Calculator calculator = new Calculator();
        String continueСalculations = "";
        Scanner scan;
        do {
            scan = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            calculator.setNum1(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            scan.nextLine();
            calculator.setSign(scan.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNum2(scan.nextInt());
            System.out.println(calculator.getNum1() + " " + calculator.getSign() + " " + 
                    calculator.getNum2() + " = " + calculator.calculate());
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            continueСalculations = "";
            while (!continueСalculations.equals("yes") && !continueСalculations.equals("no")) {
                scan.nextLine();
                continueСalculations = scan.nextLine();
            }
        }
        while (!continueСalculations.equals("no")); 
    }
} 
