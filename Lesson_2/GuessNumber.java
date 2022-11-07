import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player activePlayer;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.activePlayer = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        secretNum = new Random().nextInt(100) + 1;
        do {
            selectPlayer();
            System.out.print("Игрок " + activePlayer.getName() + " введите число: ");
            activePlayer.setNum(scan.nextInt());
            scan.nextLine();
            if (activePlayer.getNum() > secretNum) {
                System.out.println("Число " + activePlayer.getNum() 
                        + " больше того, что загадал компьютер");
            } else if (activePlayer.getNum() < secretNum) {
                System.out.println("Число " + activePlayer.getNum() 
                        + " меньше того, что загадал компьютер");
            }
        } while (secretNum != activePlayer.getNum());
        System.out.println("Победил игрок " + activePlayer.getName());
    }

    private void selectPlayer() {
        activePlayer = activePlayer == player1 ? player2 : player1;
    }
}