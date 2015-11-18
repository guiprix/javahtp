
import java.util.Scanner;
public class Binary{

	public static void main(String[]args){

		int bin1 =0, bin2 =0, bin3=0, bin4=0;
		int counter = 0;
		Scanner input = new Scanner(System.in);
		while(counter<5){
		System.out.println("Enter a binary number");

		int n = input.nextInt();
		
		 bin1 = n%10;
		
		 bin2 = (n/10)%10;
		

		bin3 =(n/100)%10;
		

		 bin4 = (n/1000);
		

		if(bin1>=0 && bin2 <2){
			if (bin2>=0 && bin2<2){
				if(bin3>=0 && bin3<2){
					if(bin4>=0 && bin4<2){

						counter = 5;

					}

				}


		}


		}else{
			System.out.println("Enter a binary number!");

		}//end of if

		counter++;
		}//end of while

		int dec1 = bin1*1;
		int dec2 = bin2*2;
		int dec3 = bin3*4;
		int dec4 = bin4*8;

		int decimal = dec1+dec2+dec3+dec4;
		System.out.println(decimal);
		
		//int esp = 1;
/*
		for(int i = 0;i<10;i+=2){

			esp = i+i;
			System.out.println(esp);

			
			

		}
*/

		int n2 = 2; 

		int esp =1;

for (int i = 1; i < 11; i++) {	

	 esp = esp * 2;
	System.out.print(esp);

}
System.out.println();

		



	}







}