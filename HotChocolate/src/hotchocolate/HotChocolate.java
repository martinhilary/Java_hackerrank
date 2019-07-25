/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotchocolate;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException {
        if (cocoaTemp > tooHot) {
//            System.out.println("This is where the TooHotException was created");
            throw new TooHotException();
        } else if (cocoaTemp < tooCold) {
//            System.out.println("This is where the TooColdException was created");
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        double currentCocoaTemp = 100;
        boolean wrongTemp =true;
        while(wrongTemp){
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("The cocoa was good!");
                wrongTemp = false;
            } catch (TooHotException e1) {
                System.out.println("That's too Hot");
                currentCocoaTemp -= 5; 
            } catch (TooColdException e2) {
                System.out.println("That's too cold.");
                currentCocoaTemp += 5;
            } 
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("The coffee is gone!");

    }

}
