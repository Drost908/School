/**
 The Bakery class provides for baking, selling and reporting
 the inventory of donuts.
   
   @author: Brittany Drost
   @verstion: 3 April 2017
   
   CIS 1500
*/

public class Bakery
{
   private int donuts; //instance method.
   
   public void bake()
   {
      donuts += 12;
   }
   
   public void sell() //instance method.
   {
      int donuts = -6; //local method variable to the method sell.
      
      this.donuts -= 6; //this statement references the "class" variable
   }
   public void reportInventory() //instance method.
   {
      System.out.printf(" %02d donuts are in inventory.\n", donuts);
   }
   
} //End of Bakery class definition