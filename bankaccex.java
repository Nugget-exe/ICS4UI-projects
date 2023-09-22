//Ms. Harris ICS4UI review Switch Concept, 4th example
// Review on Sep 18th
// "Code with me, in class lesson"

// imports required
import java.util.Scanner;

// note class is not named BankEXFunct - this should cause an
// issue, not just with the replit run!
public class bankaccex {
  public static void main(String[] args) {
    String accountNumber = "12345";
    double balance = 1000.0;

    System.out.println("Account Number:" + accountNumber);
    System.out.println("balance: " + balance);
    double depositamount = 500;
    if (depositamount>0){
        balance += depositamount;
        System.out.println("depositied: "+ depositamount);


    }else {
        System.out.println("Invalid deposit amount");
    }

    double withdrawamount = 200;
    if (withdrawamount>0 && withdrawamount <= balance) {
        balance -= withdrawamount;
        System.out.println("withdrawn: "+ withdrawamount);

    } else {
        System.out.println("Invalid withdrawal amount or insuffient funds");
    }
    System.out.println("Updated balance:"+balance);



   } // end void main
} // end class BankAccountExample
