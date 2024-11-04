public class Tank extends Heroes implements Printable{
    private double health;

    public Tank(String name, double health) {
        super(name);
        this.health = health;
    }
    public void print() {
        System.out.println("Tank:" + this.getName() + " health:" + this.health);
    }
}
