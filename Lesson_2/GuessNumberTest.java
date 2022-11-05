import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.print("Введите имя первого игрока: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Player firstPlayer = new Player(name);
        System.out.print("Введите имя второго игрока: ");
        name = scan.nextLine();
        Player secondPlayer = new Player(name);
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        game.start();
    }
} 
