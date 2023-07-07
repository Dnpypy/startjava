public class Jaeger {
    private String modelName; 
    private String mark; 
    private String origin; 
    private float height; 
    private float weight; 
    private int strength; 
    private int armor; 

    public Jaeger () {
    }

    public Jaeger (String modelName, String mark, String origin, float height, float weight, int strength, int armor){
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public void setA(String modelName) {
        this.modelName = modelName;
    }

    public void setB(String mark) {
        this.mark = mark;
    }    

    public void setC(String origin) {
        this.origin = origin;
    }

    public void setD(float height) {
        this.height = height;
    }

    public void setE(float weight) {
        this.weight = weight;
    }

    public void setF(int strength) {
        this.strength = strength;
    }

    public void setG(int armor) {
        this.armor = armor;
    }

    public String getA() {
        return modelName;
    }

    public String getB() {
        return mark;
    }

    public String getC() {
        return origin;
    }

    public float getD() {
        return height;
    }

    public float getE() {
        return weight;
    }

    public int getF() {
        return strength;
    }

    public int getG() {
        return armor;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }
}