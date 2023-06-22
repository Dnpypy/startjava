public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        
        wolf1.setGender("male");
        System.out.println(wolf1.getGender());
        wolf1.setName("Denis");
        System.out.println(wolf1.getName());
        wolf1.setAge(9);
        System.out.println(wolf1.getAge());
        wolf1.setWeight(75);
        System.out.println(wolf1.getWeight());
        wolf1.setColor("violet");
        System.out.println(wolf1.getColor());
    }
    

}