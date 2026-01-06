package petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // 0 = full, 100 = very hungry
    private int energy;   // 0 = tired, 100 = energetic
    private String mood;  // internal state

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(40) + 30;  // 30–70
        this.energy = r.nextInt(40) + 30;
        updateMood();
    }

    // Constructor with user-specified values
    public Pet(String name, String type, int age, int hunger, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        updateMood();
    }

    // ---------- Encapsulated Logic ----------
    protected void updateMood() {
        if (hunger > 70) {
            mood = "Hungry";
        } else if (energy < 30) {
            mood = "Tired";
        } else {
            mood = "Happy";
        }
    }

    public String getMood() {
        return mood;
    }

    // ---------- Interactions ----------
    @Override
    public void feed() {
        hunger -= 20;
        if (hunger < 0) hunger = 0;
        updateMood();
        System.out.println(name + " has been fed.");
    }

    @Override
    public void play() {
        energy -= 20;
        hunger += 15;
        normalize();
        updateMood();
        System.out.println(name + " is playing.");
    }

    @Override
    public void sleep() {
        energy += 30;
        hunger += 10;
        normalize();
        updateMood();
        System.out.println(name + " is sleeping.");
    }

    private void normalize() {
        if (energy > 100) energy = 100;
        if (hunger > 100) hunger = 100;
    }

    // ---------- Polymorphism ----------
    public abstract void makeSound();
}
