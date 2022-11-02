public class WolfTest {

    public static void main(String[] args) {
        System.out.println("Волк");
        Wolf wolf = new Wolf();
        wolf.setSex("male");
        wolf.setName("Akela");
        wolf.setWeight(90);
        wolf.setAge(7);
        wolf.setColor("grey");
        System.out.println("Wolf sex = " + wolf.getSex() + 
                "\nWolf name = " + wolf.getName() + 
                "\nWolf weight = " + wolf.getWeight() + 
                "\nWolf age = " + wolf.getAge() + 
                "\nWolf color = " + wolf.getColor());
        wolf.go();
        wolf.sit();
        System.out.println(wolf.run());
        wolf.howl();
        System.out.println(wolf.hunting());
    }
}
