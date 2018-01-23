
/**
   The BakeryManager instatiates objects of the Bakery class
   and controls the baking, selling, and reporting donut inventory.
   
   @author: Brittany Drost
   @verstion: 3 April 2017
   
   CIS 1500
*/

public class BakeryManager
{
   public static void main( String [] args )
   {
      Bakery homeBakery;
      
      homeBakery = new Bakery();
      homeBakery.reportInventory();
      
      //homeBakery.donuts = 12; (can't access a private variable)
      
      homeBakery.bake();
      homeBakery.bake();
      homeBakery.reportInventory();
      
      homeBakery.sell();
      homeBakery.reportInventory();
      
   } //End main method
} //End of BakeryManager class