import java.util.Scanner;
public class GameNumber{
    public static void main(String[] args){
        int numComp = (int) (Math.random()*100);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int myNum = scan.nextInt();
        while(numComp != myNum){
            if(myNum > numComp){
                System.out.println("число " + myNum + " больше того, что загадал компьютер");
            } else if (myNum < numComp){
                System.out.println("число " + myNum + " меньше того, что загадал компьютер");
            }
            myNum = scan.nextInt();
        }
        System.out.println("Вы победили!");
    }
}