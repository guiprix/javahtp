// Fig. 4.12: Analysis.java
// Analysis of examination results using nested control statements.
import java.util.Scanner; // class uses class Scanner

public class Analysis 
{
   public static void main(String[] args) 
   {
      /*
      int count  =1;
      while(count<=10){

         System.out.println(count%2==1 ? "****" : "+++++++++" );
         ++count;
      }
      */

      int row = 10;
      while(row>=1){

         int colum = 1;
         while(colum<=10){

               System.out.print(colum%2 ==1 ? "<" : ">");
               ++colum;
         }
         row--;
         System.out.println();

      }
      /*
      
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      // initializing variables in declarations
      int passes = 0; 
      int failures = 0;
      int studentCounter = 1; 
      int result = 0;

      // process 10 students using counter-controlled loop
      while (studentCounter <= 5) 
      {

         //if(result!=1|| result !=2){
         // prompt user for input and obtain value from user
         System.out.print("Enter result (1 = pass, 2 = fail): ");
          result = input.nextInt();
         
         //
            
         //}
         
         // if...else is nested in the while statement           
         if (result == 1) {        
            passes = passes + 1;  
            studentCounter++;
         }else  if (result ==2) {                  
            failures = failures + 1; 
            studentCounter++;
        } else 
            System.out.println("Enter a valid number!");

         // increment studentCounter so loop eventually terminates
         //studentCounter = studentCounter + 1;  
      } 

      // termination phase; prepare and display results
      System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

      // determine whether more than 8 students passed
      if (passes > 8)
         System.out.println("Bonus to instructor!");
        */ 
   } 
} // end class Analysis

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
