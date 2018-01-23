/**
   KBEntry uses an object of the Scanner class to enter
   product information (Number, Name, Quantity Purchased,
   Product Cost, Description, and total cost.
   
   @author: Brittany Drost
   @verstion: 6 February 2017
   
   CIS 1500
*/
import java.util.*; //References the library containing the Scanner class

public class KBEntry
{
 public static void main(String [] args)
 {
   int prodNbr;
   int qtyPurch;
      
   double prodCost;
   double totalCost;
   
   String prodDesc;
   
   Scanner userEntry;
   
   //Declare an obect of the Scanner class
   userEntry = new Scanner(System.in);
   
   System.out.println("Enter Product Number.");
   prodNbr = userEntry.nextInt();
   
   System.out.println("Enter the number purchased.");
   qtyPurch = userEntry.nextInt();
   
   System.out.println("Enter product cost.");
   prodCost = userEntry.nextDouble();
   
   //remoe the "new line" character
   userEntry.nextLine();
   
   System.out.println("Enter product description.");
   prodDesc = userEntry.nextLine();
   
   totalCost = prodCost * qtyPurch;
   
   System.out.println(qtyPurch + " " + prodDesc + 
   " were purchase at the cost of $" + prodCost + 
   "\nfor a total cost of $" + totalCost);
   
 } //End of main method.
} //End of KBEntry class definition.