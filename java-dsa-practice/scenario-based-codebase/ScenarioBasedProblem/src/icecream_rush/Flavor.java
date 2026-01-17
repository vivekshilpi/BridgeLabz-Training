package icecream_rush;

class Flavor {
    String name;
    int weeklySales;

    Flavor(String name, int weeklySales) {
        this.name = name;
        this.weeklySales = weeklySales;
    }

    void display() {
        System.out.println(name + " → " + weeklySales + " sales");
    }
}
