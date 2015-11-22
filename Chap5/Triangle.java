public class Triangle{

	public static void main(String[]args){
		//1st FIGURE
		for(int i = 1;i<=10;i++){
			//System.out.print("*");
			//System.out.print(" ");
			//System.out.println();
			for(int k=1;k<=i;k++){
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
		for(int i = 10;i>=1;i--){

			for(int k = 1;k<=i;k++){

				System.out.print("*");
			}
		System.out.println();

		}//end of 2nd figure

System.out.println();
	
	for(int i = 1;i<=10;i++){
		//System.out.print("^");
		System.out.println();
		//System.out.print("$");
		for(int k = 1;k<i;k++){
			System.out.print(" ");
		}
		for(int j = 10;j>=i;j--){
			System.out.print("*");

		}
		//System.out.println();

	}

		System.out.println();
		System.out.println();
		int j = 1;
		//4th figure
		for(int i = 10;i >=1;i--){
			//System.out.printf("i = %d",i);
			System.out.println();
			//System.out.printf("i = %d",i)
			for(int k = 1;k<i;k++){
				System.out.print(" ");

			}
			for( j = 10;j>=i;j--){
				System.out.print("*");
				
			}

			//System.out.printf(" j = %d",j);


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