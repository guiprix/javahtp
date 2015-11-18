import java.util.Scanner;

public class SavingAccountsTest{

	public static void main(String[]args){

		SavingAcconts saver1 = new SavingAcconts(2000);
		SavingAcconts saver2 = new SavingAcconts(3000);
		System.out. printf("intitial balance: %.2f%n", saver1.getSavingBalance());
		System.out.printf("intital balance saver2: %.2f%n", saver2.getSavingBalance());
		//saver1.calculateMonthlyInterest();
		//saver2.calculateMonthlyInterest();
		
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter a new interest : ");
		//int newInterest = input.nextInt();

		SavingAcconts.modifyInterestRate(4);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		saver1.savingAccountsToString();
		saver2.savingAccountsToString();

		SavingAcconts.modifyInterestRate(5);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		saver1.savingAccountsToString();
		saver2.savingAccountsToString();
		


	}//end main
}//end class