public class JaegerTest {
    public static void  main(String[] args) {
        Jaeger bracerPhoenix = new Jaeger();
        bracerPhoenix.setA("Bracer Phoenix");
        bracerPhoenix.setB("Mark-5");
        bracerPhoenix.setC("USA");
        bracerPhoenix.setD(70.7f);
        bracerPhoenix.setE(2.1f);
        bracerPhoenix.setF(8);
        bracerPhoenix.setG(9);

        System.out.println(bracerPhoenix.getA());
        System.out.println(bracerPhoenix.getB());
        System.out.println(bracerPhoenix.getC());
        System.out.println(bracerPhoenix.getD());
        System.out.println(bracerPhoenix.getE());
        System.out.println(bracerPhoenix.getF());
        System.out.println(bracerPhoenix.getG());
        bracerPhoenix.move();
        System.out.println(bracerPhoenix.scanKaiju());
        bracerPhoenix.useVortexCannon();
        bracerPhoenix.setG(12);
        System.out.println(bracerPhoenix.getG());

        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "USA", 76.2f, 1.85f, 10, 9);
        System.out.println(strikerEureka.getA());
        System.out.println(strikerEureka.getB());
        System.out.println(strikerEureka.getC());
        System.out.println(strikerEureka.getD());
        System.out.println(strikerEureka.getE());
        System.out.println(strikerEureka.getF());
        System.out.println(strikerEureka.getG());
        strikerEureka.move();
        System.out.println(strikerEureka.scanKaiju());
    }
}
