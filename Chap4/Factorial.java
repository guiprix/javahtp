import java.util.Scanner;
public class Factorial{

	public static void main(String[]args){
		int fact = 0;
		int n = -1;

		Scanner input = new Scanner(System.in);
		while(n<0){
		System.out.println("Enter a postitive number: ");
			n = input.nextInt();

	}
	int f = 0;

	if(n == 0){
		fact = 1;

	}else if(n>=1){
		fact = n;
		int s = n;
		//int f = 0;
		//while(s!=0){

			for(int i = 1;i<n;i++){
				


				//fact = 1;
				//System.out.print(fact);

				 fact= fact * i;
				 //System.out.printf("poi%d%n",f);

			}

			



			/*
			int temp = n-1;
			fact *= n * temp ;
			s--;
			n--;
			*/
		//}

		
		
	}
	System.out.printf("factorial of %d is: %d%n", n, fact);

	}

}