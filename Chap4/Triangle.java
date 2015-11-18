import java.util.Scanner;
public class Triangle{

	public static void main(String[]args){


			Scanner input  = new Scanner(System.in);
			int one = 0;
			int two= 0;
			int three = 0;

			
			while(one==0 || two ==0 || three ==0){

				System.out.println("Enter first number  side of triangle: ");
				 one = input.nextInt();

				System.out.println("Enter second number: ");
				 two = input.nextInt();

				System.out.println("Enter third number: ");
				 three = input.nextInt();


				 	
				

				}//end of while

				 if((one + two) > three && (one + three)> two ){
				 	if((two+three> one)){
				 		System.out.println("this is a trianlge");
				 	}
				 }else{

				 	System.out.println("this is  not a triangle");
				 }



			


			
	}//end of main



}// end of class