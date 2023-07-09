public class JaegerTest {
    public static void  main(String[] args) {
        Jaeger bracerPhoenix = new Jaeger();
        bracerPhoenix.setModelName("Bracer Phoenix");
        bracerPhoenix.setMark("Mark-5");
        bracerPhoenix.setOrigin("USA");
        bracerPhoenix.setHeight(70.7f);
        bracerPhoenix.setWeight(2.1f);
        bracerPhoenix.setStrength(8);
        bracerPhoenix.setArmor(9);

        System.out.println(bracerPhoenix.getModelName());
        System.out.println(bracerPhoenix.getMark());
        System.out.println(bracerPhoenix.getOrigin());
        System.out.println(bracerPhoenix.getHeight());
        System.out.println(bracerPhoenix.getWeight());
        System.out.println(bracerPhoenix.getStrength());
        System.out.println(bracerPhoenix.getArmor());
        bracerPhoenix.move();
        System.out.println(bracerPhoenix.scanKaiju());
        bracerPhoenix.useVortexCannon();
        bracerPhoenix.setArmor(12);
        System.out.println(bracerPhoenix.getArmor());

        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "USA", 76.2f, 1.85f, 10, 9);
        System.out.println(strikerEureka.getModelName());
        System.out.println(strikerEureka.getMark());
        System.out.println(strikerEureka.getOrigin());
        System.out.println(strikerEureka.getHeight());
        System.out.println(strikerEureka.getWeight());
        System.out.println(strikerEureka.getStrength());
        System.out.println(strikerEureka.getArmor());
        strikerEureka.move();
        System.out.println(strikerEureka.scanKaiju());
    }
}
