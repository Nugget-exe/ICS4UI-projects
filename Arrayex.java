//Ms. Harris ICS4UI review 2D array Concept, 3rd example
// Review on Sep 18th
// "Code with me, in class lesson"


/*
In this example we have student files which track clubs, sports
and preferences for each student that could be used for "Letters" upon graduation.  It also calculates percentages of 
students involved in each sport, club, yearbook and colour preferences while performing error checking.  The students in this example are Looney Tunes characters and we'll assume for purposes of this example that there are just 10 students.
*/
// imports required
import java.util.Scanner;
import java.util.Arrays;

// note class is not named 2DArrayEx - this should cause an
// issue, not just with the replit run!
public class Arrayex {
  public static void main(String[] args) {
    String [][] studentData = {
      {"Bugs Bunny", "Blue", "25", "Basketball", "Deca", "Yearbook"},
      {"Daffy Duck", "Red", "23", "Soccer", "Drama Club", "Yearbook"},
      {"Porky Pig", "Green", "22", "Baseball", "Science Club", "No Yearbook"},
      {"Tweety Bird", "Yellow", "20", "Swimming", "CS Club", "Yearbook"},
      {"Sylvester Cat", "Black", "27", "Tennis", "Music Club", "No Yearbook"},
      {"Elmer Fudd", "Brown", "30", "Basketball", "Deca", "Yearbook"},
      {"Foghorn Leghorn", "Orange", "28", "Football", "Drama Club", "No Yearbook"},
      {"YosemiteSam", "Purple", "32", "Baseball", "Science Club","Yearbook"},
      {"Wile E. Coyote", "Gray", "24", "CS Club", "Yearbook"},
      {"Road Runner", "White", "21", "Track and Field", "Music Club", "Yearbook"}
    };// end array

    int totalStudents = studentData.length;
    int []sportCounts = new int[totalStudents];
    int []clubCounts = new int[totalStudents];
    int yearbookCount = 0;
    int[]colorCounts = new int[totalStudents];
    try { 

    }catch (IllegalArgumentException e){
      System.err.println(e.getMessage());
    }// end try catch


  } // end void main
} // end  StudentInfo class