public class HourlyEmployee extends Employee{

	private double hours;
	private double wage;

	public HourlyEmployee(String first, String last, String ssn, 
		double hrs, double wage){
		super(first, last, ssn);
		setHours(hrs);
		setWage(wage);
	}


	
	public double getWage(){
		return wage;
	}
	public void setHours(double hrs){
		//System.out.println("SETTING HOURS");
		//hours = hrs;
		
		if(hrs>= 0 && hrs<=168){
			hours = hrs;
		//System.out.printf("HOURS %f", hrs);
		}else{
			throw new IllegalArgumentException(
				"Hours must be between 0 and 168");
		}
		
		//System.out.println(hrs);
	}
	public double getHours(){
		return hours;
	}

	public void setWage(double wage){
		if (wage>=0)
			this.wage = wage;
		else 
			throw new IllegalArgumentException(
				"wage must be >= 0");

	}
	public double earnings(){
		double hrs40;
		double over40;
		//System.out.println("dentrto earnings");
		if(hours <=40){
			//System.out.println("dentro < 40hrs");
			hrs40 =  wage * hours;
			//System.out.printf("wage %.2f - hours %.2f", wage, hours);
			return hrs40;
		}else{
			over40 = (wage *1.5) * (hours - 40) ;
		}

		return ((wage*40) + over40);
	}
	@Override
	public String toString(){
		return String.format("%s%s%s\n%s%s\n", super.toString(),
		 "Hours worked ", getHours(),"Earning ", earnings());
	}

}