public class Warrior extends Heroes implements Printable{
    private int damage;

    public Warrior(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    @Override
    public void print() {
        System.out.println("Warrior:" + this.getName() + " damage:" + this.damage);
    }
}
