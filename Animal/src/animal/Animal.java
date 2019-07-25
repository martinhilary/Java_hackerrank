/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

public abstract class Animal {
    private int age; 
    public Animal(int age){
        this.age = age;
        System.out.println("An animal has been created!");
        
    }
//    public void eat(){
//        System.out.println("An animal is eating");
//    }
    //Abstract class
    public abstract void eat();
    public void sleep(){
        System.out.println("An animal is sleeping");
    }
    
    public int getAge(){
        return age; 
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
//        Animal a = new Animal(5);   
        Dog d = new Dog();
        Cat c = new Cat();
//        d.ruff();
//        System.out.println(d.getAge());
//        c.meow();
//        System.out.println(c.getAge());
//        d.eat();
//        c.eat();
//        d.run();
//        c.prance();
          d.sleep();
          c.sleep();
          //Casting 
          Object dog = new Dog();
          Dog realDog = (Dog)dog; 
          realDog.ruff();
          
          Object str = "est";
          String realS = (String) str ; 
          realS.getBytes(); 
          
          //What happens if 
          Dog doggy = new Dog();
          if (doggy instanceof Animal){
              Animal animal = (Animal) doggy;
              animal.sleep();
          }
          doggy.sleep();
          
          
          
          
          
        
    }
    
}

//Finish up all videos and then apply for new card later 