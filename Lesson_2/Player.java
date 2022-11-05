import java.util.Scanner;

public class Player {

    private String name;
    private int playerNum;
    private Scanner scan;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum() {
        scan = new Scanner(System.in);
        System.out.print("Игрок " + name + " введите число: ");
        this.playerNum = scan.nextInt();
    }
}
