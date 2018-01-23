 
import java.util.Scanner;
 
/**
   
   @author: Brittany Drost
   @verstion: 26 March 2017
   
   CIS 1500
*/
public class CentigradetoFahrenheit 
{
 
    public static void main( String [] args ) 
    {
   
        double fah, cent;
        cent = 0;
        
        //User enters temp in Centigrade
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "Enter the temperature in Centigrade:" );
        cent = keyboard.nextDouble();
 
        //Calculate and display in Fahrenheit
        fah = (1.8 * cent) + 32;
        System.out.print("Temperature in Fahrenheit: " + fah);
 
   } //End of main method.
} //End of CentigradetoFahrenheit class definition.