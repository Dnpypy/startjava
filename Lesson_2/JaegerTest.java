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

        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "USA", 76.2f, 1.85f, 10, 9);
    }
}
