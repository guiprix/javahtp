public class Chap711{


public static void main(String[]args){


	int[] counts = new int[10];
	for(int i = 0; i<counts.length;i++){

		counts[i]= 0;
		System.out.printf("array: %d %n",counts[i]);
		++counts[i];
		System.out.printf("array +1: %d%n",counts[i]);
	}

}



}