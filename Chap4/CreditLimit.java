import java.util.Scanner;
public class CreditLimit{

	public static void main(String[]args){
	int custNumb;
	int beginBal;
	int totalCharg;
	int totalCredit;
	int allowedLimit;
	int newBal;

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a customer number: ");
	custNumb = input.nextInt();

	System.out.println("Enter a begininning balance: ");
	beginBal = input.nextInt();

	System.out.println("Enter the the charges: ");
	totalCharg = input.nextInt();

	System.out.println("Enter the total credit: ");
	totalCredit = input.nextInt();

	System.out.println("Enter the limit of credit: ");
	allowedLimit = input.nextInt();


	newBal = beginBal+ totalCharg - totalCredit;
	if(newBal> allowedLimit)

		System.out.println("you exceed the limit allowed");

	else
		System.out.printf("your new balance is: %d%n", newBal);




}


}