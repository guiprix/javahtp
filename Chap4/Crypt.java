import java.util.Scanner;
public class Crypt{

	public static void main(String[]args){


		Scanner input = new Scanner(System.in);
		System.out.println("Enter a four digit number: ");
		int n = input.nextInt();

		int number = 1;
		int newVal = 0;

		int result = 0;
		int  temp = 0;
		int temp2= 0;
		int temp3 = 0;
		int temp4 = 0;

		int dividend = 1000;

		while(number <=4){


			 result = n/dividend;

			 result = result %10;
			 dividend/=10;

			

			 newVal = (result+7)%10;

			//System.out.printf("prima : %d",newVal);


			if(number == 1){
				
				temp = newVal;

			}
			if (number == 2){

				temp2 = newVal;

			}
			if(number ==3){

				temp3 = newVal;
				//newVal = temp;
			}
			if(number ==4){


				temp4 = newVal;
				//newVal =  temp2;
			}


				

		



			//System.out.print(result);
			//System.out.print(" poi ");
			System.out.print(result);
			System.out.print(" ");
			System.out.println(newVal);
			number++;
			//System.out.println(newVal);
		}
		int encripted = temp4*100+temp*10+temp3*1000+temp2;
		System.out.println(encripted);

		System.out.printf("temp %d%n temp2 %d%n temp3 %d%n temp4 %d%n", temp, temp2, temp3, temp4);
		int another;
		another  = temp;
		temp = temp3;
		//temp3 = temp;
		temp3 = another;
		

		//int another1;
		//another1 = temp2;
		//System.out.println(temp2);
		//System.out.println(temp4);
		another = temp2;
		temp2 = temp4;
		//temp4 = another;
		//System.out.println(temp4);
		temp4= another;
		System.out.printf("temp %d%n",temp);
		System.out.printf("temp2 %d%n",temp2);
		System.out.printf("temp3 %d%n",temp3);
		System.out.printf("temp4 %d%n",temp4);
		//int encripted = temp + temp2+ temp3+temp4;

		System.out.printf("encripted number is: %s%s%s%s%n: ", temp,temp2,temp3,temp4);//it's as a string so NOT correct 100%
		

		}
		

	

}