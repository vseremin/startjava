import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.print("Введите имя первого игрока: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Player player1 = new Player(name);
        System.out.print("Введите имя второго игрока: ");
        name = scan.nextLine();
        Player player2 = new Player(name);
        GuessNumber game = new GuessNumber(player1, player2);
        String option;
        do {
            game.start();
            option = "";
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                option = scan.nextLine();
            } while (!option.equals("yes") && !option.equals("no"));
        } while (!option.equals("no"));
    }
} 
