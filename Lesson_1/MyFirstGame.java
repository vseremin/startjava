public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число\"");
        int minValue = 1;
        int maxValue = 100;
        int numComp = 17;
        int numUser = 3;
        while (numComp != numUser) {
            if (numUser > numComp) {
                System.out.println("число " + numUser + " больше того, что загадал компьютер");
                maxValue = numUser;
                numUser = (minValue + maxValue) / 2;
            } else if (numUser < numComp) {
                System.out.println("число " + numUser + " меньше того, что загадал компьютер");
                minValue = numUser;
                numUser = (minValue + maxValue + 1) / 2;
            }
        }
        System.out.println("Вы победили!");
    }
}
