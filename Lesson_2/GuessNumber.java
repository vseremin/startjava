import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private Player activePlayer;
    private int secretNum;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.activePlayer = secondPlayer;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        secretNum = new Random().nextInt(100) + 1;
        do {
            mixPlayers();
            System.out.print("Игрок " + activePlayer.getName() + " введите число: ");
            int num = scan.nextInt();
            activePlayer.setNum(num);
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

    private void mixPlayers() {
        activePlayer = activePlayer == firstPlayer ? secondPlayer: firstPlayer;
    }

}
