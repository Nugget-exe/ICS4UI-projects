package Reviewassignment;

/*
 * Problem: We're a store with no ordering system. we want a ordering system to take in user input and compile it to a list for the user to read
 */
import java.util.Scanner;//use scanner to read input

import java.util.ArrayList;

public class orderapp {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        ArrayList<Order> cart = new ArrayList<Order>();// https://stackoverflow.com/questions/19616972/how-to-add-an-object-to-an-arraylist-in-java

        boolean condition = true;
        while (condition == true) {
            System.out.println(
                    "What would you liikem to do? Type end to exit, add to add item, view to view items, and remove to remove item");
            String answer = Input.nextLine().toLowerCase();
            switch (answer) {
                case "add":

                    try {

                        System.out.println("What item do you want to order? type the name below");
                        String itemname = Input.nextLine().toLowerCase();
                        System.out.println("Amount of items?");
                        String Itemnum = Input.nextLine().toLowerCase();
                        int numbers = Integer.parseInt(Itemnum);
                        Order OrderName = new Order(itemname, numbers);
                        cart.add(OrderName);

                        System.out.println("Would you like to add more of the item amount?");
                        String choice = Input.nextLine().toLowerCase();
                        if (choice.equals("yes")) {
                            System.out.println("Enter amount to be added");
                            String Amountadd = Input.nextLine().toLowerCase();
                            int addnums = Integer.parseInt(Amountadd);
                            OrderName.amount(addnums);

                        } else {
                            System.out.println("ok noted");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e);

                    }
                    break;

                case "end":
                    condition = false;
                    break;

                case "view":
                    for (int i = 0; i < cart.size(); i++) {// print objects in the arraylist
                        cart.get(i).Print();
                        System.out.print("Number "+(i+1)+" on cart");
                        System.out.println();

                    }

                case "remove":
                    


                default:
                    System.out.println("Wrong choice buddy");

            }

        }
        Input.close();
       
    }

}
