package practiceProblems.overrideAnnotation;

// Child class
public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
