/*
This is your first class and it may not be review for some of you,
so here's a brief not with some terminology you might want to look up.
- This is a boat class.
- I created/will create an instance of the Boat class called Canoe
- (think of this like a cookie cutter or blueprint of the class.)
- getter and setter methods are better for public classes, but we are 
- not there yet.
- The constructor sets default values for the fields when a boat object
is created with no arguments.
- in the main method, we directly access and display the values of these
fields.
Our first instance is a canoe.  We will get it running, then your teacher
will add a second instance called Fishing.
After your teacher has given you two instances, you will create a 3rd and 4th on your own and submit.

The actual Details:
Created by Ms. Harris for ICS4UI
Finished Canoe and Fishing in class.
Modified by:
Date: 
First instance: canoe with 2 people and a speed of 1 km/hour with a power source of human.
2nd instance: Fishing with 3 people and a speed of 5 km/hour with a power source being a trolling motor.  
Added 3rd instance called skiing boat that has 4 people and a speed
of 100 km/hour with outboard motor as a power source.

add 4th instance called sailing that has 2 people and a power source of sail with 13 kmh
*/
public class Boat {
  // Fields to store information
  public int numOfPeople;
  public double speed; // in km per hour
  public String powerSource;

  //Constructor with default values (an instance, a cookie cutter, a blueprint) - similar to a method when an object is created
 // not a method which returns a value.
  public Boat(){
    numOfPeople = 2;
    speed = 1.0;
    powerSource = "People power";
  }//end constructor Boat

  // Constructor with custom values no longer using default
  public Boat(int numOfPeople, double speed, String powerSource){
    //"this" is the current object of the constructor - it tries to
    //elminate confusion between the class attributes with the same name
    // this cannot be used inside a static method
    this.numOfPeople = numOfPeople;
    this.speed = speed;
    this.powerSource = powerSource;
  }// end of custom values for our constructor Boat

  // main method to demonstrate the class - looks like usual
  public static void main(String[] args) {
    // Create an instance of the Boat class called "canoe" with default values - which means they can change.
    Boat canoe = new Boat();//use default values
    System.out.println("Canoe information");
    System.out.println("Number of people: " + canoe.numOfPeople);
    System.out.println("Speed: " + canoe.speed);
    System.out.println("Powersource: " + canoe.powerSource);
    
    Boat fishing = new Boat(3, 5.0, "trolling motor");
    System.out.println("\nFIshing information");
    System.out.println("Num of people: " + fishing.numOfPeople);
   
    System.out.println("Speed: " + fishing.speed);
    System.out.println("Powersource: " + fishing.powerSource);

    Boat Skiiing = new Boat(4, 100, "Outboard motor");
    System.out.println("\nSkiing information");
    System.out.println("Num of people: " + Skiiing.numOfPeople);
   
    System.out.println("Speed: " + Skiiing.speed);
    System.out.println("Powersource: " + Skiiing.powerSource);

    Boat sail = new Boat(2, 13.0, "sail");
    System.out.println("\nFIshing information");
    System.out.println("Num of people: " + sail.numOfPeople);
   
    System.out.println("Speed: " + sail.speed);
    System.out.println("Powersource: " + sail.powerSource);
  }// end public void main
}// end boat class
