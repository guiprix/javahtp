import java.util.Scanner;
public class TriangleRight{

	public static void main(String[]args){


		Scanner input = new Scanner(System.in);
		int counter = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int largest = 0;

		while(counter< 3){

			System.out.println("enter first nunber");
			a  = input.nextInt();

			System.out.println("enter second number");
			b = input.nextInt();

			System.out.println("enter third number");
			c = input.nextInt();

			if (a==0 || b ==0 || c == 0){

				System.out.println("you enter a zero number");

			}else{

				counter = 3;
			}
			counter++;
		}// end of while

		if(a>b&&a>c){

				largest=a;
				if(b*b+c*c == a*a){
					System.out.println("thisi is a right triangle");
				}else{

					System.out.println("not a right triangle");
				}

		}else if(b>c && b>a){
				largest = b;
				if(a*a+c*c == b*b){
					System.out.println("thisi is a right triangle");
				}else{

					System.out.println("not a right triangle");
				}


		}else {
				largest =c;
				if(b*b+a*a == c*c){
					System.out.println("thisi is a right triangle");
				}else{

					System.out.println("not a right triangle");
				}
		}
			
		
		System.out.println(largest);
		//if(a!=largest && b!=largest){

		//}


		//10,24,26 
		





	}//end of main








}