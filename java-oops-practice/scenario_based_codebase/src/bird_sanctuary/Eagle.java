package bird_sanctuary;

public class Eagle extends Bird implements Flyable {

    Eagle(String id, String name) {
        super(id, name, "Eagle");
    }

    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}