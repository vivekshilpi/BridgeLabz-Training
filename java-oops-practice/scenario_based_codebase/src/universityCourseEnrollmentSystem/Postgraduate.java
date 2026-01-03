package universityCourseEnrollmentSystem;

class Postgraduate extends Student {
    public Postgraduate(int id, String name) {
        super(id, name);
    }

    public void display() {
        System.out.println("Postgraduate: " + name);
    }
}
