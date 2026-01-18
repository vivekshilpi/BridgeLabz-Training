package bird_sanctuary;

public class Sparrow extends Bird implements Flyable {

    Sparrow(String id, String name) {
        super(id, name, "Sparrow");
    }

    public void fly() {
        System.out.println("Sparrow flutters quickly.");
    }
}