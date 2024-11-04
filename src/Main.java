public class Main {
    public static Heroes createObject(String className){
        switch (className){
            case "Warrior":
                return new Warrior("Captain America", 45);
            case "Magic":
                return new Magic("Dr.Strange", "Portal");
            case "Tank":
                return new Tank("Hulk", 999.9);
            default:
                return null;
        }
    }
    public static void main(String[] args) {
        Heroes[] objects = {
                createObject("Tank"),
                createObject("Warrior"),
                createObject("Magic")
        };

        for (Heroes hero: objects){
            if (hero instanceof Printable){
                ((Printable) hero).print();
            }
        }

    }
}
