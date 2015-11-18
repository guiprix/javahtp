import java.util.Scanner;
public class Palindrome{


public static void main(String[]args){

	
	Scanner input = new Scanner(System.in);
	/*
	System.out.println("Enter five digits: ");

	int one = input.nextInt();
	int two = input.nextInt();
	System.out.printf("two is: %d%n",two);
	int three = input.nextInt();
	int four = input.nextInt();
	int five = input.nextInt();
	System.out.printf("five is: %d%n", five);
	//int six = input.nextInt();
	if(input.nextInt()!=0){

		System.out.println("enter only 5 numbers!");
	}
	*/
	int digits  = 0;
	int n = 0;
	
		//while(counter<5){
		
		
		
		while(digits!=5){

			System.out.println("Enter a number of five digits: ");
			 n = input.nextInt();
			if(n /10000>0 && n/10000<10){
				digits = 5;
				//System.out.println("the numb is five digits");
			}else{
				System.out.println("the  numb is not five digits");
			}
		}//end of while


			int five = n%10;

			int one = (n/10000);
			//TODO if one == five is palindrome check TODO

			int four = (n%100)/10;
			int two = 	(n/1000)%10;

			if(five == one && four == two){
				System.out.println("the number is palindrome");
			}else	
				System.out.println("the number is NOT palindrome");


		
		}
		
	}	

	///if (two ==four && one ==five){

	//	System.out.println("this is palindrome");
//}   







