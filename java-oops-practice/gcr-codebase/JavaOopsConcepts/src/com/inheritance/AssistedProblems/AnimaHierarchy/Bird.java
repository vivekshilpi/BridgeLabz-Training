package AssistedProblems.AnimaHierarchy;

public class Bird extends Animal {
    Bird(String name, int age){
        super(name,age);
    }
    void birdDetails(){
        System.out.println("Bird name is "+ getName() + " and bird age is "+ getAge());
    }
    @Override
    public void makeSound(){
        System.out.println("Bird chirps");
    }
}
