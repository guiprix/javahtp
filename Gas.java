
import java.util.Scanner;
public class Gas{
 
	public static void main(String[] args)
 {
 int gallon = 0;
 int miles = 0;
 double avaragePerTrip =0.0;
 int userInMil;
 int userInGas;
 int trip = 1;
 double total = 0;

 Scanner input = new Scanner(System.in);
 
 System.out.println("Enter a milage or enter -1 to Quit");
 userInMil = input.nextInt();

 while(userInMil != -1){

 	System.out.println("Enter a gas quantity");
 	userInGas = input.nextInt();
 	avaragePerTrip  = (double)userInMil/userInGas;
 	System.out.printf("THe usage for the %d trip is: %.2f\n",trip, avaragePerTrip);
 	trip++;
 	total += avaragePerTrip;
 	System.out.printf("the total avatage for %dtirp is %.2f\n", trip,total);
 	System.out.println("Enter anorther milage or -1 to quit");
 	userInMil = input.nextInt();

 }
 

 

  }//System.out.printf("total is: %d\n", total);
 
 } // end class gas