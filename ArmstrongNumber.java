import java.util.Scanner;
/**
   Armstrong Number shows us how to use the return-value method.
   
   @author: Brittany Drost
   @version: 9 April 2017
   
   CIS 1500
*/

public class ArmstrongNumber
{
   public static void main( String [] args )
   {
      int num;
      int sum = 0;
      int temp;
      int remainder;
      int digits = 0;
 
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a number.");      
      num = keyboard.nextInt();
 
      temp = num;
 
      // Count number of digits
 
      while (temp != 0) 
      {
         digits++;
         temp = temp/10;
      }
 
      temp = num;
 
      while (temp != 0) 
      {
         remainder = temp % 10;
         sum = sum + power (remainder, digits);
         temp = temp / 10;
      }
 
      if (num == sum)
         System.out.println(num + " is an Armstrong number.");
      else
         System.out.println(num + " is not an Armstrong number.");         
      } //End of main method.
 
   static int power(int num, int rem) 
   {
      int x, y = 1;
 
      for (x = 1; x <= rem; x++) 
         y = y*num;
 
      return y;    
   } //End of return value method
} //End of ArmstrongNumber class definition.