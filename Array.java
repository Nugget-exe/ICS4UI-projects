package Reviewassignment;
/*
 * Problem:
 * 2D Array. Create a problem and solution that uses a multi-dimensional array with
error checking, and at least 5 different results from your array. You must have
at least 15 or more records for your array to make sense, and also our results.


Given: Sep. 25/23 Due: Oct 4/23
Typical results could be sum, average, sorting, rotation, min & max, specific
numbers or results will be determined by what your array is. Use your
discretion. Your user input and results (print to console) must be reasonable with
no errors.
problem: our store is too complex so customers demanded a inventory system using 2d arrays. the arrays will have 5 characteristics with item[0][0] being the first item with a identifier at [0]

Author: Henry Lin
Citations will be in code
 */

import java.util.ArrayList;
//import libarieissssss
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        String[] Itemdescription = { "name", "itempopular?", "Orders", "characteristics", "stock" };// list product list
                                                                                                    // thing(index
                                                                                                    // related)

        String[][] Itemsinstore = {
                { "duck tape", "1", "2000", "grey", "25" },
                { "spoons", "0", "1500000", "silver", "1" },
                { "balls", "", "2000000000", "round", "10000000" },
                { "socks", "unpopular", "1", "sock", "0" },
                { "soap", "unpopular", "0", "white", "0" },
                { "mr piche", "hot item", "99999", "gold", "1" },
                { "allen", "hot item", "0", "pink", "34" },
                { "henry lin", "unpopular", "0", "coder", "1" },
                { "sus among us meme", "hot item", "1000000", "red", "0" }
        };

        ArrayList<ArrayList<String>> Itemtobeadded = new ArrayList<ArrayList<String>>();// create a 2d array list that CAN BE CHANGED

        int totalitems = Itemsinstore.length;
        int numOfHitems = 0;// number of popular(hot items)
        int numOfUitems = 0;// number of unpopular items
        int numOfOrders = 0;// nom of ordeers
        int numOfStock = 0;// nom of stock
        try {// start a try statement for reading the array

            for (int i = 0; i < totalitems; i++) {
                if (Itemsinstore[i].length != 5) {
                    throw new IllegalArgumentException("Invalid data format for item " + Itemsinstore[i][0]);

                }
                if (Itemsinstore[i][1].equals("hot item")) {
                    numOfHitems++;

                } else if (Itemsinstore[i][1].equals("unpopular")) {// using else if for ihot and unpopular items
                    numOfUitems++;

                } else {
                    System.out.println("Invalid discription at line " + (i + 1));
                }

                numOfOrders += Integer.parseInt(Itemsinstore[i][2].trim());
                numOfStock += Integer.parseInt(Itemsinstore[i][4].trim());

            }

            System.out.println(numOfOrders + " total orders");
            System.out.println(numOfHitems + " total hot items");
            System.out.println(numOfUitems + " total unpopular items");
            System.out.println(numOfStock + " total stock");

            Scanner Input = new Scanner(System.in);
            boolean condition = true;

            while (condition == true) {
                System.out.println("Would you like to browse our items or request an item to be added? type browse to browse and add to add item. type end to exit");
                String Answer = Input.nextLine().toLowerCase();
                switch (Answer) {
                    case "browse":
                        System.out.println("WHat would you like to browse?");
                        System.out.println("Here is a list of our items");
                        for (int j = 0; j < totalitems; j++) {
                            System.out.println(Itemsinstore[j][0]);
                        }
                        String browse = Input.nextLine().toLowerCase();
                        for (int k = 0; k < totalitems; k++) {

                            if (browse.equals(Itemsinstore[k][0])) {
                                System.out.println("Item found Here are the characteristics");

                                for (int h = 0; h < 5; h++) {
                                    if (h == 2 || h == 4) {
                                        System.out.println(Itemsinstore[k][h] + " " + Itemdescription[h]);

                                    } else {
                                        System.out.println(Itemsinstore[k][h]);
                                    }

                                }

                            }

                        }
                        break;

                    case "end":
                        condition = false;
                        break;

                    case "add":
                        System.out.println(
                                "Enter information format is : Name, Isitempopular(hot item or unpopular), Orders in int, 1 characteristic, # of stock");
                        int numofitemsadded = 0;

                        ArrayList<String> Thing = new ArrayList<String>();
                        for (int l = 0; l < 5; l++) {
                            String Thingadd = Input.nextLine().toLowerCase();
                            Thing.add(Thingadd);// we're doing error checking later

                        }

                        Itemtobeadded.add(numofitemsadded, Thing);

                        numofitemsadded++;
                        System.out.println("Your added product:");
                        for (int parent = 0; parent < Itemtobeadded.size(); parent++) {
                            for (int child = 0; child < 5; child++) {// there will always be 5 itmes in the sublists in
                                                                     // the lists
                                try {
                                    if (child == 2 || child == 4) {
                                        int temporder = Integer.parseInt(Itemtobeadded.get(parent).get(child));//this is how you get 1 item in the 2d array: i figured this out messing around
                                        int tempstock = Integer.parseInt(Itemtobeadded.get(parent).get(child));
                                        System.out.println(temporder + " Orders");
                                        System.out.println(tempstock + " stock");

                                    } else if (child == 1 && !"hot item".equals(Itemtobeadded.get(parent).get(child))) {
                                        throw new Exception("Incorrect discriptor");
                                    } else if (child == 1 && !Itemtobeadded.get(parent).get(child).equals("unpopular")) {
                                        throw new Exception("Incorrect discriptor");

                                        
                                    } else {
                                        System.out.println(Itemtobeadded.get(parent).get(child) + " " + Itemdescription[child]);

                                    }

                                } catch (NumberFormatException e) {

                                    System.out.println("replacing inccorect value with a default value of 0");
                                    Itemtobeadded.get(parent).set(child, "0");// https://stackoverflow.com/questions/15855154/two-dimensional-arraylist-set-an-element
                                                                              // where i got my answer to

                                } catch (Exception e) {
                                    System.out.println("Replacing inccorect value with undetermined");
                                    Itemtobeadded.get(parent).set(child, "Undetermined");

                                }

                            }

                        }
                        System.out.println(Itemtobeadded);
                        break;

                    default:// default case: what happens if response that does not match the cases above
                        System.out.println("Invalid response");
                        break;
                }
            }

            Input.close();

        } catch (IllegalArgumentException e) {
            System.out.println(e);

        }
    }
}
