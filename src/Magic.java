public class Magic extends Heroes implements Printable{
    private String ability;

    public Magic(String name, String ability) {
        super(name);
        this.ability = ability;
    }
    public void print() {
        System.out.println("Magic:" + this.getName() + " ability:" + this.ability);
    }
}
