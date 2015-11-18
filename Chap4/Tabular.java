


public class Tabular{
	
/*
(Tabular Output) Write a Java application that uses looping to print the following table of
values:

N 10*N 100*N 1000*N
1  10  100  1000
2  20  200  2000
3  30  300  3000
4  40  400  4000
5  50  500  5000
*/
public static void main(String[]args){


	//complex try

/*
int column =0;
int n = 1;
int row = 0;
int s = 1;

System.out.println("N  N*10 N*100 N*1000");
while(column <= 4){

	System.out.printf("%d", n);
	System.out.print(" ");
	row = 0;
	s = n*10;
	while(row < 3){
		
		System.out.printf("%d",s);
		System.out.print("  ");
		//System.out.println(" ");
		row++;
		s *=10;
	}
	//s++;
	System.out.println(" ");
	n++;
	column++;

	}
*/

	//SECOND WAY

	System.out.println("N\tN*10\tN*100\tN*1000");
	int n = 1;

	while(n <=5){


		System.out.printf("%d\t%d\t%d\t%d\n", n, n*10,n*100,n*1000);

		n++;



	}



   

 











}

}