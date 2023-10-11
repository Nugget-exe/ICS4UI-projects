/*
A bit of theory, just a bit... see the markup file called theory - notes for definitions and descriptions, shortened in the code below with inline comments.
Your tasks: Beginning with easiest following through to challenge for the advanced people
a) round the area to 2 decimal points
b) request user input regarding the circle radius
c) add a square, after all that is why the class is called Shapes NOTE: Rectangle class would gave height and width.
d) Add perimeter to the Rectangle Class
e) add multiple shapes (circles, Squares, triangles, polygon)
f) CHALLENGE - add an array of Circles
g) CHALLENGE - add an array of Squares
i) SUPER CHALLENGE - Change to JavaFX and add graphics in addition to the console output for the shapes. {you are pioneers with ReplIt - I have not yet tried to see how slow JavaFX is in ReplIt and if there are any quirks...}

Looking ahead - "this" and Super and Sub on Thursday
*/
import java.lang.Math;
import java.util.Scanner;

class Shapes {
  // main method
  public static void main(String[] args) {
    //create a circle with a radius of 10.0
    Shapes myCircle = new Shapes(10.0);

    System.out.println("Area with radius "+ myCircle.radius + " is " +myCircle.getArea());

    Shapes yourCircle = new Shapes();
    System.out.println("Area with radius "+ yourCircle.radius + " is "+ yourCircle.getArea());


    

    // create a circle with radius 1
    Scanner Input = new Scanner(System.in);
    yourCircle.radius = Input.nextInt();
    System.out.println("Area with radius "+ yourCircle.radius + " is " +myCircle.getArea());


    Input.close();


    System.out.println(square(4));



    

    //Modify circle radius



    
  } // end main method

  double radius;
  double length;
  double height;

  //Construct a circle with radius 1
  Shapes () {
    radius = 1.0;
    
    
  }
  public static int square(int side) {
    return side * side;


  }


  

  //Construct a circule with a specified radius
  Shapes(double newRadius) {
    radius = newRadius;
  } 


  

  //return the area of your shape, so far circle

  double getArea() {
    double roundOff = Math.round((radius*radius*Math.PI) * 100.0) / 100.0;
    return roundOff;
    
  }


  
  
}// end class Shapes