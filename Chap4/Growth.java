public class Growth{


	public static void main(String [] args){


		//growth rate per annum
		double rate  = 1.1;
		double population = 7.3;
		double yearPop= population * rate;
		double increase = yearPop - population;
		double newPop  = population;

		System.out.println("YEAR,  PUPULATION,  INCREASE");
		for(int i = 2016;i <=2091;i++){
		
		
		//yearPop = population* rate;
		
		 
		
		System.out.printf("%d    %.3f       %.3f%n",i,newPop,increase);
		newPop += 0.730;
		//System.out.println(newPop);
		

	}//end of column YEAR






	}

}