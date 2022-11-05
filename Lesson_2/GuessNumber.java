import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private Player activePlayer;
    private int compNumber;
    private String continueGame = "";

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.activePlayer = firstPlayer;
        compNumber = new Random().nextInt(101);
        // System.out.println(compNumber);
    }

    public void start() {
        do {
            game();
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            Scanner scan = new Scanner(System.in);
            continueGame = scan.nextLine();
            while (!continueGame.equals("yes") && !continueGame.equals("no")) {
                continueGame = scan.nextLine();
            }
            if (continueGame.equals("yes")) {
                newCompNumber();
            }
        } while (!continueGame.equals("no"));
    }

    public void game() {
         do {
            mixPlayers();
            activePlayer.setPlayerNum();
            if (activePlayer.getPlayerNum() > compNumber) {
                System.out.println("Число " + activePlayer.getPlayerNum() 
                        + " больше того, что загадал компьютер");
            } else if (activePlayer.getPlayerNum() < compNumber) {
                System.out.println("Число " + activePlayer.getPlayerNum() 
                        + " меньше того, что загадал компьютер");
            } else if (activePlayer.getPlayerNum() == compNumber) {
                System.out.println("Победил игрок " + activePlayer.getName());
                break;
            }
        } while (compNumber != activePlayer.getPlayerNum());
    }

    public void mixPlayers() {
            activePlayer = firstPlayer;
            firstPlayer = secondPlayer;
            secondPlayer = activePlayer;
    }

    public void newCompNumber() {
        compNumber = new Random().nextInt(101);
        // System.out.println(compNumber);
    }
}
