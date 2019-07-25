/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author martinhilary
 */
public class Car {
//    Blueprint for our car - methods and properties
    int maxSpeed=100;
    
    int minSpeed=0;
   
    double weight=4079;
    
    boolean isTheCarOn= false;
    char condition = 'A';
    String nameofCar = "Lucy";
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg= 26.4;
    int numberOfPeopleInCar= 1;
//   constructor 
//    Map the parameters of constructor to properties of blueprint
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed= customMaxSpeed;
        weight= customWeight;
        isTheCarOn= customIsTheCarOn;
    }
//    Getters and Setters
    
    public void printVariables(){
           System.out.println(maxSpeed);
           System.out.println(minSpeed);
           System.out.println(weight);
           System.out.println(isTheCarOn);
           System.out.println(condition);
           System.out.println(numberOfPeopleInCar);
    }
    public void getIn(){
        numberOfPeopleInCar= numberOfPeopleInCar+1;
    }
    public void getOut(){
        numberOfPeopleInCar--;
    }
    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg; 
    }
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }
    public void turnTheCarOn(){
        if (isTheCarOn == false){
             isTheCarOn=true;
        }
        
    }
    public void wreckCar(){
        condition= 'C';
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        create an instance over here of the car from the blueprint
        Car birthdayPresent = new Car(500, 5000.545 ,true);
        System.out.println("Birthday Car v1");
        birthdayPresent.printVariables(); 
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles left:" + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles" + birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday Car v2");
        birthdayPresent.printVariables();  
        birthdayPresent.getOut();
        birthdayPresent.printVariables(); 
//        System.out.println("Christmas Car");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();
              
       }
    
}
