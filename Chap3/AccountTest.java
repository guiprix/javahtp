// Fig. 3.14: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest
{
   // main method begins execution of Java application
   public static void main( String[] args ) 
   {
      Account account1 = new Account( 50.00, "account1"); // create Account object
      Account account2 = new Account( -7.53, "account2"); // create Account object
      /*
      // display initial balance of each object
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );
      */
      displayAccount(account1);
      displayAccount(account2);
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );
      double depositAmount; // deposit amount read from user

      System.out.println( "Enter withdraw amount for account1: " ); // prompt
      depositAmount = input.nextDouble();
      System.out.printf("Whitdrawing %.2f to account 1 balance\n", depositAmount);
      account1.debit(depositAmount);
      System.out.printf("Account 1 balance : $%.2f\n", account1.getBalance());

      System.out.println( "Enter deposit amount for account1: " ); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\nadding %.2f to account1 balance\n\n", 
         depositAmount );
      account1.credit( depositAmount ); // add to account1 balance

      // display balances
      /*
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );
      */
      displayAccount(account1);
      displayAccount(account2);

      System.out.println( "Enter withdraw amount for account2: " ); // prompt
      depositAmount = input.nextDouble();
      System.out.printf("Whitdrawing %.2f to account 2 balance\n", depositAmount);
      account2.debit(depositAmount);

      System.out.print( "Enter deposit amount for account2: " ); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\nadding %.2f to account2 balance\n\n", 
         depositAmount );
      account2.credit( depositAmount ); // add to account2 balance
      /*
      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n", 
         account2.getBalance() );
      */
      displayAccount(account1);
      displayAccount(account2);

   } // end main

   public static void displayAccount(Account account){
       System.out.printf("%s balance: $%.2f%n", 
         account.getName(), account.getBalance()); 

   }
} // end class AccountTest


/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
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