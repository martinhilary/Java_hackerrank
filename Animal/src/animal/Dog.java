package animal;

//extend-inherinting from the class
public class Dog extends Animal {
//    Constructor--> whenever we construct dog we need top construct animal first
    public Dog(){
        super(15);
        System.out.println("A dog has been created");
    }
    public void ruff(){
        System.out.println("The dog says ruff");
    }
    public void eat(){
        System.out.println("A dog is eating");
    }
    public void sleep(){
        System.out.println("A dog is sleeping");
    }
    public void run(){
        System.out.println("A dog is running");
    }
}
