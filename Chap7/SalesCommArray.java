import java.util.Scanner;

public class SalesCommArray{


public static void main(String[] args){


Scanner input = new Scanner(System.in);
int salary = 0;
int[] frequency = new int[11];
int sale;
int range;

for(int counter = 1; counter<frequency.length;counter++){
	
	frequency[counter]=0;
	//++frequency[1 + range ];
	//System.out.println(frequency[counter]);
	}
/*
	if (counter ==10){

		System.out.printf("%d$ and over: ", counter*100);
	}else{

		System.out.printf("$%d--$%d: ",(counter)*100, (counter)*100+99 );
	}

	*/
	System.out.println("Enter a sales: ");
	sale= input.nextInt();
	salary = (int)(sale*0.09) +200;
	System.out.printf("salary calculated is: %d%n", salary);
	range = (int)salary/100;
	System.out.printf("range salary is: %d%n",range);

	if (range >9){

		range = 10;
	}else{
		++frequency[range];
	}

	for(int stars = 2;stars<frequency.length ;stars++){
		 
		 if(stars ==10){

		 	System.out.println("$1000 and over: ");
		 } else{
		 System.out.printf("$%d--$%d: %d", stars * 100, (stars*100)+99,frequency[stars]);
		}
		 System.out.println("");

		 }

		//System.out.print(frequency[stars]);

	}//end of main
	//System.out.println("");



}





//end of main






