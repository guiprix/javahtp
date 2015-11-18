import java.util.Scanner;

public class Crypt1 {

	public static void main(String[]args){


		Scanner input = new Scanner(System.in);
		System.out.println("Enter an encripted number: ");
		int n = input.nextInt();


		int digit1 = ((n/1000)%10);//0	
		int digit2 = ((n/100)%10);//1
		int digit3 = ((n/10)%10);//8
		int digit4 = (n%10);//9

		System.out.println(digit1);
		System.out.println(digit2);
		System.out.println(digit3);
		System.out.println(digit4);
		
		int swap =digit3*1000+digit4*100+digit1*10+digit2;//8901
		System.out.println(swap);

		int orig1 = (digit3 -7 +10)%10;
		int orig2 = (digit4 -7 +10)%10;
		int orig3 = (digit1 -7 + 10)%10;
		int orig4 = (digit2 -7 + 10)%10;
		System.out.println(orig1);
		System.out.println(orig2);
		System.out.println(orig3);
		System.out.println(orig4);


		/*
		( 6 + 7 ) % 10 is 3

To get back again, do this
( 3 - 7 + 10 ) % 10 is 6

Adding the modulus value prevents all the implementation 
specific weirdness that can result with doing modulus on a negative value. 
*/





	}


}