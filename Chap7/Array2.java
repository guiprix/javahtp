
import java.util.Scanner;

public class Array2{


public static void main(String[] args){

//int[][] t = new int[2][3];

int elements = 0;
/*count all elements
for(int[] row: t){

	for(int col: row){
		elements++;
	}
}
System.out.println(elements);

}

int elelment;
for(int col =0;col<t[1].lenght;col++){}

	element = t[1][col];

}
for(int col = 0;col<t[2].lenght;col++){

	element = t[2][col];

}
*/



//int[][] t = {{0,0},{0,0,0}};
//t[1][0]=0;
int[][] t = new int[2][3];
int value;

Scanner input  = new Scanner(System.in);
for(int row = 0;row<t.length;row++){

	for(int col = 0;col<t[row].length;col++){
		System.out.println("enter a value: ");
		value = input.nextInt();

		t[row][col]=value;
		elements++;
		//System.out.printf("elements: %d", elements);

	}


}

displayArray(t);
getMin(t);
getMax(t);
getTabular(t);



//System.out.printf("element in the arrraY 1st row: %d,%d", t[0][0],t[0][1]);

}//end of Main

public static void getTabular(int [][] array){
 
System.out.println("   0  1  2");
for(int row = 0;row<array.length;row++){
	System.out.print(row + "  ");

	for(int col = 0; col<array[row].length;col++){

		//System.out.printf("column: %d%n;
		System.out.printf("%d  ",array[row][col]);


	}
	System.out.println();
}




}

public static void displayArray(int [][] array){

	for(int [] row: array){


		for(int col: row){

			System.out.printf("array elements: %d%n", col);
		}
	}

}//end of displayArray

public static void getMin(int [][] array){

	int min = array[0][0];

	for(int [] row : array){

		for(int col: row){

			if(col< min){
				min = col;
			}
		}
	}

	System.out.printf("minimo e: %d%n", min);


}//end getMin();

public static void getMax(int [][]array){
	int max = array[0][0];
	for(int [] row: array){

		for(int col: row){
			if(col> max){
				max = col;
			}
		}
	}
System.out.printf("il max e: %d%n", max);
}//end of getMax()

}



