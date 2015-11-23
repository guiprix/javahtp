
import java.util.Scanner;
public class CalSale{

	public static void main (String[]args){

		double price1 = 2.98;
		double price2 = 4.50;
		double price3 = 9.98;
		double price4 = 4.49;
		double price5 = 6.87;
		int counter =1;
		double total = 0;

		Scanner input = new Scanner(System.in);
		while(counter <= 2){
		System.out.println("Emter two numbers: ");
		System.out.println("product number between 1 and 5: ");
		int prodNum = input.nextInt();
		System.out.println("quantity  sold: ");
		int quantity = input.nextInt();
		//counter ++;
		//while(counter<5){

			switch(prodNum){
				case 1:
				total += (price1*quantity);
				//System.out.printf("total in switch 1: %f%n",total);

				break;

				case 2:
				total += (price2* quantity);
				//System.out.printf("total in switch 2: %f%n",total);
				break;

				case 3:
				total += (price3* quantity);
				break;

				case 4:
				total +=(price4*quantity);
				break;

				case 5:
				total +=(price5*quantity);
				break;

			}//end of switch

			counter++;
			

	}//end of while

	System.out.printf("Total is: %.2f%n: ",total);


	}//end of main
}//end of class