public class JaegerTest {

    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger();
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 6);

        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);
        
        System.out.println(chernoAlpha);
        chernoAlpha.move();
        System.out.println("\nModel name: " + gipsyDanger.getModelName() 
                + "\nMark: " + gipsyDanger.getMark() 
                + "\nOrigin: " + gipsyDanger.getOrigin()
                + "\nHeight: " + gipsyDanger.getHeight()
                + " m\nWeight: " + gipsyDanger.getWeight()
                + " Tons\nSpeed: " + gipsyDanger.getSpeed()
                + "\nStrength: " + gipsyDanger.getStrength()
                + "\nArmor: " + gipsyDanger.getArmor());
        gipsyDanger.setWeight(-1);
        System.out.println(gipsyDanger);
    }
} 
