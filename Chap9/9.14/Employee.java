public class Employee{

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	public Employee(String first, String last ,String ssn){

		firstName = first;
		lastName  = last;
		socialSecurityNumber = ssn;

	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}

	@Override
	public String toString(){

		return String.format("\n%s%s\n%s%s\n%s%s\n", "First name is ", getFirstName(),
		 "Last name is ", getLastName(),"Ssn is: ", getSocialSecurityNumber());
	}

}


