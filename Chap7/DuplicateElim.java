import java.util.Scanner;

public class DuplicateElim{

public static void main(String[]args){
	int arrayCounter = 0;
	int number;
	int counter = 0;
	int[] array = new int[5];
	String arraySrg = "";

	Scanner input = new Scanner(System.in);
	while(counter<5){

	System.out.println("Enter a number between 0 and 100 encluded: ");
	number = input.nextInt();

	for(int i = 0;i<array.length;i++){
		
		if(array[i]==number ){
			System.out.println("the number already exists!");
			return;
	}else if(number > 100 || number <0){

		System.out.println("enter avalid nunber between 0 and 100: ");
		return;
	}

}//for
		
		array[arrayCounter++]= number;
		arraySrg += " "+ number;
		
	
	System.out.println(arraySrg);
	counter++;
}//while
}//main
public static void displayArray(int [] array){


	for(int value: array){
		System.out.printf(" %d", value);
	}
	System.out.println();
}

}//class

/*
	While(counter<5){
	

	if(number > 100 || number <0){

		System.out.println("enter avalid nunber between 0 and 100: ");
		return;
	}else if()



	}

	

}//while
*/


	//}//main


//}//class