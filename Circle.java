/**
   The Circle assignment shows us how to do calculations
   and return information from a different file.
   
   @author: Brittany Drost
   @verstion: 17 April 2017
   
   CIS 1500
*/


public class Circle
{
   private double radius;
   private final double PI = 3.14159; //must be a final double
   
   public Circle()
   {
      radius = 0.0; //set radius equal to 0 so user can input radius
   }
   
   public void setRadius( double radiusGiven) //set radius
   {
      radius = radiusGiven;
   }
   
   public double getRadius() //get radius
   {
      return radius;
   }
   
   public double getArea() //calculate area
   {
      return PI * radius * radius;
   }
   
   public double getDiameter() //calculate diameter
   {
      return radius * 2;
   }
   
   public double getCircumfrence() //calculate circumfrence
   {
      return 2 * PI * radius;
   }
} //End of Circle class