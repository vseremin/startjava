public class WolfTest {

    public static void main(String[] args) {
        System.out.println("Волк");
        Wolf wolf = new Wolf();
        wolf.sex = "male";
        wolf.name = "Akela";
        wolf.weight = 90;
        wolf.age = 7;
        wolf.color = "grey";
        System.out.println("Wolf sex = " + wolf.sex + 
                "\nWolf name = " + wolf.name + 
                "\nWolf weight = " + wolf.weight + 
                "\nWolf age = " + wolf.age + 
                "\nWolf color = " + wolf.color);
        wolf.go();
        wolf.sit();
        System.out.println(wolf.run());
        wolf.howl();
        System.out.println(wolf.hunting());
    }
}
