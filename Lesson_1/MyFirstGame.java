public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число\"");
        int startRange = 1;
        int endRange = 100;
        int compNum = 17;
        int playerNum = 3;
        while (compNum != playerNum) {
            if (playerNum > compNum) {
                System.out.println("число " + playerNum + " больше того, что загадал компьютер");
                endRange = playerNum;
                playerNum = (startRange + endRange) / 2;
            } else if (playerNum < compNum) {
                System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
                startRange = playerNum;
                playerNum = (startRange + endRange + 1) / 2;
            }
        }
        System.out.println("Вы победили!");
    }
}
