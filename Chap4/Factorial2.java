import java.util.Scanner;
public class Factorial2 {


		public static void main(String[]args){

			Scanner input = new Scanner(System.in);
			System.out.println("enter a number: ");

			int n = input.nextInt();
			int x = input.nextInt();

			int number = 1;
			double e = 1;
			int fact = 1;
			double result = 1.0;

			while(number< n){

				 fact *= number;
				 //x = number* number;
				 result = result*x;

				 e+= result/fact;

				 number++;




			}
			System.out.printf("kostant of number %d is %.2f%n: ",n, e);

		}
}