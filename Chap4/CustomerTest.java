import java.util.Scanner;


public class CustomerTest{
	

public static void main(String [] args){

int account;
int startBalance;
int totalCharges;
int totalCredits;
int creditLimit;
int newBalance;

Scanner input = new Scanner(System.in);

System.out.println("Enter an account: ");
account = input.nextInt();


System.out.println("Enter a start balance: ");
startBalance = input.nextInt();

System.out.println("Enter a credit limit: ");
creditLimit = input.nextInt();

System.out.println("Enter the item charged this month: ");
totalCharges = input.nextInt();

System.out.println("Enter the total ctedits of this month: ");
totalCredits = input.nextInt();

//calculating a new balance
newBalance = startBalance + totalCharges - totalCredits;

if (newBalance<creditLimit){
	System.out.println("You exceed the monthliy limit!");
}else{
	System.out.printf("Your new balnce is %d\n", newBalance);
}










	
}

}