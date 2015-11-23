public class Factorial{
	public static void main(String[]args){

		long fact = 1;

		for (int i = 1;i<=20;i++){

			fact*=i;
			System.out.printf("Factorial of %d\t%d%n", i, fact);

		}//end of for
		//System.out.println(fact);
	}
}