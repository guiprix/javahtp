public class OddInt{

	public static void main(String[]args){

		int sum = 0;
		int count = 1;

		for(count = 1;count<100;count+=2){



			sum+= count;
			//System.out.print(count);
			//System.out.print(" ");

		}

		System.out.println(sum);

	


	double n = 2.5;
	double pow = Math.pow(n,3);

	System.out.println(pow);

	int i = 1;

	while(i<=20){

		
			System.out.print(i);
			if(i%5 ==0)
				System.out.println();
			else
				System.out.print('\t');

			i++;
			

		}


	for(i =1; i<=20;i++){

		System.out.print(i);
		if(i%5 == 0)
			System.out.println();
		else
			System.out.print('\t');
	}
	


}//end of main



}