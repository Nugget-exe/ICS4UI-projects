/* Very basic program to ease you in after the long weekend. 
 Your teacher will walk through this code, then you will write code with the following additions;
 a) create user input to request the two values
 b) then create a method to calculate the min value
 c) then create a method to calculate the average of 5 values
 d) then create a method to find the prime number of 10 numbers input by the user.  Give an appropriate answer if none of the numbers are prime.
 e) then Play and show results from using ceil, floor, rint, round, and abs.
 f) then Play and show results from using pow, sqrt, cbrt, and hypot.
 g) CHALLENGE - show me something with sin, cos and tan
 HINT: import math!
 HINT: import java.util.Scanner too
*/
import java.util.Scanner; 
import java.lang.Math.*;
import java.util.ArrayList;
public class MaxVal {

    

    
  public static void main(String[] args) {
    
    double Sum = 0; 

    Scanner Input = new Scanner(System.in);
  // main method
    int i = Input.nextInt();
    int j = Input.nextInt();
    int k = max( i,j);
    int mini = min(i,j);
    System.out.println("The maximum between " + i + " and " + j + " is " + k);
    System.out.println("The min between " + i + " and " + j + " is " + mini);
    System.out.println("input 5 numnbers line by line");
    for (int l = 0; l < 5; l++) {
        double num = Input.nextInt();
        Sum += num;
       

    }
    double average = avg(Sum);
    System.out.println(average);
   


    /* 


    for (int d = 0; d < 10; d++) {
        int num = Input.nextInt();
        if (ifprime(num) == true) {
            System.out.println("Number is prime");


        }else {
            System.out.println("Number is not prime");
        }
        
       

    }
*/

    Input.close();
    
    

  }// end main

  public static int max(int num1, int num2) {
    int answer;

    if (num1 > num2){
      answer = num1;
    }else{
      answer = num2;
    }// end if
    return answer;


 
  }// end max

  public static int min(int num1, int num2) {
    int answer;

    if (num1 < num2){
      answer = num1;
    }else{
      answer = num2;
    }// end if
    return answer;


 
  }// end max


  public static double avg(double int1) {// really simple average calculator
    double response;
  
    
    
    response = int1/5;
    return response;

        

   
    
    
  }

  public static boolean Isprime(int num) {
    for (int factor = 2; factor < num;factor++) {
        if (factor ) {

        }

    }

  }

 
  
}// end MaxVal