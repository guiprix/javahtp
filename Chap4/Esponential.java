public class Esponential{



	public static void main(String[]args){

		int esp = 8;
		int base = 2;
		int result =1;

		int counter = 1;

		while(counter<esp){

			result  = result * base;

			counter+=1;

			System.out.printf("%d alla %d =: %d%n",base,esp,result);
		}
		
	}
}