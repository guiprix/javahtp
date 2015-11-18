import java.util.Scanner;
public class Factorial1{

	public static void main(String[]args){
		double e = 1;
		int fact = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter thre number of terms to calculate:");
		int n = input.nextInt();
		System.out.println();
		fact = n;
		for (int k = 1;k<=n;k++){


			fact = k;
			//e += 1/fact


		
			for(int i = 1;i<k;i++){

				fact = fact*i;


				//System.out.println(fact);
			}

			e +=  1.0/fact;

			
			//System.out.println(fact);
			
		}
		//e+=1;

		System.out.printf("the value of costant e is: %.4f%n",e);
			//or (int i = 1;i<n;i++){
			//	fact1 = fact1*i;
			//}
		//0.16+0.5+1

	//}//ext loop

//System.out.println(fact);



	}

}