public class Triangle{

	public static void main(String[]args){
		//1st FIGURE
		for(int row = 1;row<=10;row++){
			//System.out.print("*");
			//System.out.print(" ");
			//System.out.println();
			for(int column=1;column<=row;column++){
				//System.out.print("*");
				System.out.print("*");
				//System.out.print("*");
				//System.out.println();
			}
			//System.out.println("#");
			//System.out.print("*");
			System.out.println();
			//System.out.print("*");

		}//end first figure


		System.out.println();

		//2ndFIGURE
		for(int row = 10;row>=1;row--){

			for(int column = 1;column<=row;column++){

				System.out.print("*");
			}
		System.out.println();

		}//end of 2nd figure

System.out.println();
	
	for(int row = 1;row<=10;row++){
		//System.out.print("^");
		//System.out.println();
		//System.out.print("$");
		for(int spa = 1;spa<row;spa++){
			System.out.print(" ");
		}
		for(int astx = 10;astx>=row;astx--){
			System.out.print("*");

		}
		System.out.println();

	}

		System.out.println();
		System.out.println();
		int astx = 1;
		//4th figure
		for(int row = 10;row >=1;row--){
			//System.out.printf("i = %d",i);
			//System.out.println();
			//System.out.printf("i = %d",i)
			for(int spc = 1;spc<row;spc++){
				System.out.print(" ");

			}
			for( astx = 10;astx>=row;astx--){
				System.out.print("*");
				
			}

			//System.out.printf(" j = %d",j);
			System.out.println();

		}

		System.out.println();	


	}//end of main

}

/*

* ********** ********** *
** ********* ********* **
*** ******** ******** ***
**** ******* ******* ****
***** ****** ****** *****
****** ***** ***** ******
******* **** **** *******
******** *** *** ********
********* ** ** *********
********** * * **********
*/