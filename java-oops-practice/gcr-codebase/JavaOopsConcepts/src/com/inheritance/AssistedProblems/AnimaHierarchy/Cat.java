package AssistedProblems.AnimaHierarchy;

public class Cat extends Animal {
    Cat(String name, int age){
        super(name,age);
    }

    void catDetails(){
        System.out.println("Cat name is "+ getName() + " and cat age is "+ getAge());
    }
    @Override
    public void makeSound(){
        System.out.println("Cat Meow");
    }
}
