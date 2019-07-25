/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiongoodluck;

public class RecursionGOODLUCK {
    //summation 5;5+4+3+2+1 3;3+2+1 1;1
    public static int Summation(int n){
//        Base Case
        if(n<=0){ //additive identity
            return 0;
        }
//        Recursive case --> invoke function in a function
        else{
            
            return n + Summation(n-1);
        }
    }
    
    public static int Factorial(int n){
//        Base case 
        if(n<=1){ //multiplicative identity
            return 1;
        }
//        recursive case 
        else{
            return n* Factorial(n-1);
        }
    }
    
    public static int exponentiation(int n, int p){
//   Base Case
        if(p<=0){ //multiplicative identity
            return 1;
        }
//        Recursive case
        else{
            return n*exponentiation(n, p-1); 
        }
    } 
    public static void main(String[] args) {
        // TODO code application logic here
        Summation(3);
        System.out.println( Factorial(5));
        System.out.println( exponentiation(5, 3));
    }
    
}


//Binary Solutions 
//public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//    int consec1=0;
//    String strBinary = Integer.toString(n, 2);
//   // above is binary of given in in string
//    String[] strparts = strBinary.split("0");
//    //above we get all strings of ones, below find max from them
//    for(int i=0;i<strparts.length;i++ ){
//        if (consec1 < strparts[i].length()) {consec1 = strparts[i].length();}
//    }
//    System.out.println(consec1);  //result
//}