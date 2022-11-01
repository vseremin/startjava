public class Wolf {

    String sex;
    String name;
    int weight;
    int age;
    String color;

    void go() {
        System.out.println("Идет");
    }

    void sit() {
        System.out.println("Сидит");
    }

    boolean run() {
        System.out.println("Бежит");
        return true;
    }

    void howl() {
        System.out.println("Воет");
    }

    String hunting() {
        System.out.println("Охотится");
        return "Охотится";
    }
}
