//Ms. Harris ICS4UI review CSV Concept, 2nd example
// Review on Sep 18th
// "Code with me, in class lesson"

/*
In this example, we assume there's a a CSV file named pizza_orders.csv with lines containing the day of the week
and number of pizza's ordered.  It reads the file line by line,
splits each line into parts using a comma as a delimeter, and calculates the total and average number of pizza's ordered while
handling errors like file not found or invalid number format.
*/

// imports required
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// note class is not named CsvFileEx - this should cause an
// issue, not just with the replit run!
public class CsvFileEx {
  public static void main(String[] args) {
    // initialize variables to store total and count
    int totalPizzas = 0;
    int dayCount = 0;
    try {
      //Create a scanner to read the  CSV file
      File file = new File("pizzaorders.csv");
      Scanner filescanner = new Scanner(file);
      
      while(filescanner.hasNextLine()){//read each line, and split it into parts using the delimiter
        String line = filescanner.nextLine();
        String[] parts = line.split(",");
        if (parts.length == 2) {
            String dayOfWeek = parts[0].trim();
        }

      }

      
     

    //make a list to store the data
      List<String[]>data = new ArrayList<>();
      // loop through each line in the file



      //Close the file scanner
      filescanner.close();
    } catch (FileNotFoundException e){
      System.err.println("File not found: piuzza orders.csv");
    } catch (NumberFormatException e){
      System.err.println("Invalid number format is CSV file.");
    } // end try Catch
  }// end void main
} // end public class
