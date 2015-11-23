import java.util.Scanner;

public class Bars{


	public static void main(String[]args){

		Scanner input = new Scanner(System.in);
		int n = 0;
		int counter = 0;
		int stars1=0;
		int stars2 = 0;
		int stars3= 0;
		int stars4 = 0;
		int value = 0;

		while(counter!=5){
		System.out.println("Enter five number between 1 adn tricet");
		 n = input.nextInt();
		 
		 if (n<1 || n>30){
		 	System.out.println("enter a cislo betwwen 1 and 30");
		 }else
		 	
		if(counter ==0){

			 stars1 = n;
			 System.out.print(stars1);
		}
		if(counter ==1){
			 stars2 = n;
			 System.out.print(stars2);
		}
		if(counter ==2)
			stars3 = n;
		if(counter == 3)
			stars4 = n;
	
		counter++;
			
	}//end of while
for(int counter = 1;counter<5;counter++){
	switch(counter){

		case 1:
		 value = stars1;
		break;

		case 2:
		value = stars2;
		break;

		case 3:
		value = stars3;
		break;

		case 4:
		value = stars4;
		break;

	}
}
for(int i ==1;i<value;i++){

	System.out.print("*");
}
System.out.println();

/*	int counter2 = 0;
	int counter3 = 0;
	int counter4 = 0;
	int counter5 = 0;

	while(counter2<=stars1){
		System.out.print("*");
		counter2++;

	}
	System.out.println();
	while(counter3<= stars2){

		System.out.print("*");
		counter3++;
	}
	System.out.println();
	while(counter4<= stars3){
		System.out.print("*");
		counter4++;
	}
	System.out.println();
	while(counter5 <= stars4){
		System.out.print("*");
		counter5++;
	}
	*/
}
}