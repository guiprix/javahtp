
import java.util.Scanner;

public class Largest1{

public  static  void main(String[]args){

	int largest = 0;
	int secondLargest = 0;
	int counter=0;
	int number;

Scanner input = new Scanner(System.in);

	while(counter < 10){

		System.out.println("Enter a number: ");
		number = input.nextInt();
		++counter;
		if(number> largest){
			largest = number;
		}
		if( number> secondLargest && number < largest){

			secondLargest = number;
		}



	}
	System.out.printf("The largest number is: %d%n", largest);
	System.out.printf("The second largest number is: %d%n",secondLargest);




}




}