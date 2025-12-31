package AssistedProblems.AnimaHierarchy;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Harshveer", 12);
        dog.dogDetails();
        dog.makeSound();
        Bird bird = new Bird("Bipin", 2);
        bird.birdDetails();
        bird.makeSound();
        Cat cat = new Cat("Aryan", 15);
        cat.catDetails();
        cat.makeSound();
    }
}
