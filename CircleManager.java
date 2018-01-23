import javax.swing.*; //For the JOptionPane class

/**
   The Circle assignment shows us how to do calculations
   and return information from a different file.
   
   @author: Brittany Drost
   @verstion: 17 April 2017
   
   CIS 1500
*/

public class CircleManager
{
   public static void main(String [] args)
   {

      String strEntry;
      double newradius;
      
      //Have user input radius
      strEntry =
         JOptionPane.showInputDialog( "Enter the circle's radius:" );
      newradius = Double.parseDouble( strEntry);
      
      Circle circle1 = new Circle(); //create new circle
      
      circle1.setRadius( newradius);
      
      //display results
      System.out.printf( "Area: %.2f \nDiameter: %.2f \nCircumfrence: %.2f", circle1.getArea(),
                         circle1.getDiameter(), circle1.getCircumfrence() );
                         
   } //End of main method.
} //End of CircleManager class.