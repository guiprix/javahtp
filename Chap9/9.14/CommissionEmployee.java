public class CommissionEmployee extends Employee{


		//TODO check the set method has diffeent name maparmaeter of counstructor
		// sale instead of sales(constructory)

		private double grossSales;
		private double commissionRate;

		public CommissionEmployee(String first, String last, String ssn, 
			double sales, double rate){

			super(first, last, ssn);
			setGrossSales(sales);
			setCommissionRate(rate);

		}

		public double getGrossSales(){
			return grossSales;
		}

		public void setGrossSales(double sale){

			if(sale >= 0.0)
				grossSales = sale;
			else
				throw new IllegalArgumentException(
					"gross sales must be >= 0.0");
		}
		public double getCommissionRate(){
			return commissionRate;
		}

		public void setCommissionRate(double rate){

			if(rate>0.0 && rate < 1.0){

				commissionRate = rate;
			}
		}
		public double earnings(){
			return commissionRate * grossSales;
		}

		@Override
		public String toString(){
			return String.format("%s%s%s\n%s%s\n", super.toString(),"Gross slaes is ",
				getGrossSales(),"Commission rate is ", getCommissionRate()) ;
				//s\n%s\n%s\n%s\n super.toString());;

		}



}