public class HourlyTest{

	public static void main(String[] args){

		HourlyEmployee hrEm = new HourlyEmployee("mark","ronson","4455777",
			25, 3.5);

		System.out.printf("name is %s\n", hrEm.getFirstName());
		System.out.printf("surname is %s\n", hrEm.getLastName());
		System.out.printf("ssn is %s\n", hrEm.getSocialSecurityNumber());
		System.out.printf("hrs of work %s\n",hrEm.getHours() );
		System.out.printf("wage is  %s\n", hrEm.getWage());
		System.out.printf("earnings is %s\n", hrEm.earnings());

		System.out.println("------------------calling to String method");

		System.out.printf("%s", hrEm);

	}

}