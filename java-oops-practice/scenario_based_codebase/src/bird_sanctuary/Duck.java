package bird_sanctuary;

public class Duck extends Bird implements Flyable, Swimmable {

    Duck(String id, String name) {
        super(id, name, "Duck");
    }

    public void fly() {
        System.out.println("Duck flies short distances.");
    }

    public void swim() {
        System.out.println("Duck swims gracefully.");
    }
}