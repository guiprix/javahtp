public class OddMul{


	public static void main(String[]args){
		int product = 1;
		for(int i =1;i<=15;i++){

			if(i%2 != 0){
				 product *=i;
			}
		}//end of for
		System.out.println(product);


	}//end of main
}