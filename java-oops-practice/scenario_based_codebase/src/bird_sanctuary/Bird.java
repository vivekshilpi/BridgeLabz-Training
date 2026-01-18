package bird_sanctuary;

abstract class Bird {

    private String id;
    private String name;
    private String species;

    Bird(String id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public String getId() {
        return id;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void displayInfo() {
        System.out.print("ID: " + id +
                ", Name: " + name +
                ", Species: " + species +
                ", Abilities: ");
    }
}