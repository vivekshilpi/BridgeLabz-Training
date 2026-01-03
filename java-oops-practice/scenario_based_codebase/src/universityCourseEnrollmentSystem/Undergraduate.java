package universityCourseEnrollmentSystem;

class Undergraduate extends Student {
    public Undergraduate(int id, String name) {
        super(id, name);
    }

    public void display() {
        System.out.println("Undergraduate: " + name);
    }
}
