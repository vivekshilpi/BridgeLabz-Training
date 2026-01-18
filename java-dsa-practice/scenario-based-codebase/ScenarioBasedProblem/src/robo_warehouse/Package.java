package robo_warehouse;

class Package {
    String id;
    double weight;

    Package(String id, double weight) {
        this.id = id;
        this.weight = weight;
    }

    void display() {
        System.out.println(id + " → " + weight + " kg");
    }
}
