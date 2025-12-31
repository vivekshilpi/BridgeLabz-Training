package AssistedProblems.AnimaHierarchy;

public class Dog extends Animal {

    Dog(String name, int age){
        super(name,age);
    }

    void dogDetails(){
        System.out.println("Dog name is "+ getName() + " and dog age is "+ getAge());
    }
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
