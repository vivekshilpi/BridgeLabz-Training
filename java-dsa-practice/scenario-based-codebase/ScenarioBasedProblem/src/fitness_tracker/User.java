package fitness_tracker;

class User {
    int id;
    String name;
    int steps;

    public User(int id, String name, int steps) {
        this.id = id;
        this.name = name;
        this.steps = steps;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Steps: " + steps;
    }
}
