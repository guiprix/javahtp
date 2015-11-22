import java.util.Scanner;
public class Smallest{


	public static void main(String[]args){

		Scanner input = new Scanner(System.in);
		System.out.println("enter a number of integers: ");
		int integers = input.nextInt();
		int smallest =0;
		
		for(int i = 1;i<= integers;i++){

			System.out.println("enter an number: ");
				int n = input.nextInt();

				if(i==1)	
					smallest =n;
				if(n<smallest){
					  smallest = n;
				}
		
				
			}

			System.out.println(smallest);


			

			




		




	}

}