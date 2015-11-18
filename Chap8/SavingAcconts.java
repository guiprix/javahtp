
import java.util.Scanner;

public class SavingAcconts{


private static double annualInterestRate=2;

private double savingBalance;//amount currently on deposit
private double interest;
 
 //constructor
public SavingAcconts(int savingBalance){
 	this.savingBalance = savingBalance;

 }


 public void setBalance(double savingBalance){
 	this.savingBalance= savingBalance;

 }

 public double getSavingBalance(){

 	return this.savingBalance;
 }

//Scanner input = new Scanner(System.in);


public void calculateMonthlyInterest(){

	interest = this.savingBalance * annualInterestRate/12;
	savingBalance+= interest;

}

public static void modifyInterestRate(double newInterest){


annualInterestRate = newInterest;

 }

 public void savingAccountsToString(){
 	System.out.println(savingBalance);

 }

}