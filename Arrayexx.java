//Ms. Harris ICS4UI review 2D array Concept, 3rd example
// Review on Sep 18th
// "Code with me, in class lesson"


/*
In this example we have student files which track clubs, sports
and preferences for each student that could be used for "Letters" upon graduation.  It also calculates percentages of 
students involved in each sport, club, yearbook and colour preferences while performing error checking.  The students in this example are Looney Tunes characters and we'll assume for purposes of this example that there are just 10 students.
*/
//Student task add some data to csv file so we do not simply have 1,1,1 for each. fix totalstudents - yearbookcount for sports
//fix total students -yearbookcount for clubs
//print out students names only that are in cs club
// imports required
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// note class is not named 2DArrayEx - this should cause an
// issue, not just with the replit run!
public class Arrayexx{
  public static void main(String[] args) {
    String [][] studentData = {
      {"Bugs Bunny", "Blue", "25", "Basketball", "Deca", "Yearbook"},
      {"Daffy Duck", "Red", "23", "Soccer", "Drama Club", "Yearbook"},
      {"Porky Pig", "Green", "22", "Baseball", "Science Club", "No Yearbook"},
      {"Tweety Bird", "Yellow", "20", "Swimming", "CS Club", "Yearbook"},
      {"Sylvester Cat", "Blue", "27", "Tennis", "Music Club", "No Yearbook"},
      {"Elmer Fudd", "Brown", "30", "Basketball", "Deca", "Yearbook"},
      {"Foghorn Leghorn", "Orange", "28", "Football", "Drama Club", "No Yearbook"},
      {"YosemiteSam", "Purple", "32", "Baseball", "Science Club","Yearbook"},
      {"Wile E. Coyote", "Purple", "24", "running","CS Club", "Yearbook"},
      {"Road Runner", "Purple", "21", "Track and Field", "Music Club", "Yearbook"}
    };// end array

    int totalStudents = studentData.length;
    int sportCounts = 0;
    int clubCounts = 0;
    int yearbookCount = 0;
    List<String> Coolcsppl = new ArrayList<String>();
    List<String> noyear = new ArrayList<String>();
    //use arraylist to have ability to add???
    int[]colorCounts = new int[totalStudents];
    try { 
      for (int p = 0; p < totalStudents; p++) {
        if (studentData[p][4].equals("CS Club")) {
          Coolcsppl.add(studentData[p][0]);//add names of student in cs club

        }

      }
      for (int h = 0; h < totalStudents; h++) {
        if (studentData[h][5].equals("No Yearbook")) {
          noyear.add(studentData[h][0]);//add names of student with no yearbook

        }

      }
      for (int i = 0; i < totalStudents; i++) {
        //check if data format is correct
        if (studentData[i].length != 6){// check data in rows, all data inside. if not equal to len 6, reject
          throw new IllegalArgumentException("Invalid data format for student" + studentData[i][0]);
        }
        if(studentData[i][5].equals("Yearbook")){
          yearbookCount++;
        }
        if(studentData[i][4].equals("Deca")||studentData[i][4].equals("Drama Club")||studentData[i][4].equals("Science Club")||studentData[i][4].equals("Music Club")) {
          clubCounts++;
        }
        if(studentData[i][3].equals("Basketball")||studentData[i][3].equals("Running")||studentData[i][3].equals("Football")||studentData[i][3].equals("Soccer")||studentData[i][3].equals("Baseball")||studentData[i][3].equals("Track and Field")||studentData[i][3].equals("Swimming")||studentData[i][3].equals("Tennis")) {
          sportCounts++;
        }
        
        //counting color preferences
        for(int j=0; j<totalStudents; j++){
          
          if (studentData[i][1].equalsIgnoreCase(studentData[j][1])) {
            colorCounts[i]++;

          }


        }
        //print cs ppl
        
        
       

      }
   

      System.out.println("percentage of students involved in each club, sport and yearbook: ");
      System.out.println("Sports: " + (sportCounts)*10 + "%");
      System.out.println("Clubs: " +(clubCounts)*10 + "%");
      System.out.println("Yearbook: "+ (yearbookCount)*10+"%");
      System.out.println("\nColor preferences");
      for (int i = 0; i < totalStudents; i++){
       
        System.out.println(studentData[i][0]+ " prefers "+ studentData[i][1] + "(" + colorCounts[i] + " students)");
        
      }

      for (int l = 0; l < Coolcsppl.size();l++) {
        System.out.println(Coolcsppl.get(l) + " is a really cool person in CS club");
      }

      for (int s = 0; s < noyear.size();s++) {
        System.out.println(noyear.get(s) + " DIDnt get a yearbook so weird");
      }

    }catch (IllegalArgumentException e){
      System.err.println(e.getMessage());
    }// end try catch


  } // end void main
} // end  StudentInfo class