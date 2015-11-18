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
		
		int swap =digit3*1000+digit4*100+digit1*10+digit2;
		System.out.println(swap);

	}


}