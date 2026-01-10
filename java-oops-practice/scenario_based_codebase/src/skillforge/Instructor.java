package skillforge;

public class Instructor extends User {

    public Instructor(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println("Instructor: " + name);
    }
}
