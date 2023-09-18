import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the type of boat(sailboat, speedboat, yaught, canoe): ");
    // accept input
    String UserInput = scanner.nextLine().toLowerCase(); 
    String message = " ";
    String boatType;

    switch(UserInput){
        case "sailboat":
            boatType = "Sailboat";
            message = "hope the winds are strong";
            break;

        case "speedboat":
            boatType = "Speedboat";
            message = "WOW so fast";
            break;
        
        case "yaught":
            boatType = "Yaught";
            message = "so rich wow";
            break;

        case "canoe":
            boatType = "Canoe";
            message = "hope you didnt skip arm day";
            break;

        default:
            boatType = "unknown";
            System.out.println("invalid please try again");


    }



    // show our results
    System.out.println("The boat type is: " + boatType);
    System.out.println(message);

    scanner.close();
  } // end public 
    
}
