import javax.swing.*; //For the JOptionPane class

/**   
  CatsAndDogs demonstrates Decision Structures through the use
  of is, if else, and if else if statements.
   
   @author: Brittany Drost
   @verstion: 13 February 2017
      CIS 1500
      
*/

public class CatsAndDogs
{
 public static void main(String [] args)
 {
   int numberOfDogs = 110;
   int numberOfCats = 5;
   
   final int MAX_DOGS = 12;
   final int MAX_CATS = 9;
   final int MAX_PETS = 15;
   
   //Simple if statement
   if(numberOfCats <= MAX_CATS)
   {
      System.out.println( "Number of cats is fine!" );
      System.out.println( "Have a nice day!" );
    }
    
   //A Simple if else statement
   if( numberOfDogs > MAX_DOGS)
      System.out.println( "\nYou have too many dogs!");
   else
      System.out.println( "\nThe number of dogs is fine!");
      
   //Two "Nested" if statements with matching else clauses
   if( numberOfDogs <= MAX_DOGS )
      if( numberOfCats <= MAX_CATS )
         System.out.println( "\nThe number of cats and dogs is fine!" );
         
   //Two "Nested" if statements with matching else clauses
   if( numberOfDogs <= MAX_DOGS )
      if( numberOfCats <= MAX_CATS ) 
         System.out.println( "\nThe number of cats and dogs is fine!" );
      else
         System.out.println( "\nYou have too many cats!" );
   else
      System.out.println( "\nYou have too many dogs!" );
 
      //The if else if statement,
      int finalGrade = 76;
      
      System.out.println("\n" );
      
      if( finalGrade > 85)
         System.out.println( "You did very well!" );
      else  if( finalGrade > 65)
             System.out.println( "You did OK." );
         else 
             System.out.println( "You need to study more." );
             
  } //End of main method.
} //End of CatsAndDogs class definition