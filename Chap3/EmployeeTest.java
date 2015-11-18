public class EmployeeTest{

	public static void main(String []args){
/*
 Create two Employee objects and display each object’s
yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.
*/

//String firstName, String lastName, double monthlySalary)
Employee emp1 = new Employee("guidus", "vendra", 45000);
Employee emp2 = new Employee("givoanni", "carli", 35000);

double yearlySalary;

double yearlySalary1= emp1.getSalary() * 12;
System.out.printf(" emp1 yearly salary is: %.2f\n", yearlySalary1);


double yearlySalary2  = emp2.getSalary()*12;
System.out.printf(" emp12yearly salary is: %.2f\n", yearlySalary2);


double bonus1 = emp1.getSalary() * 0.10;
double bonus2 = emp2.getSalary()* 0.10;

//yearlySalary1 = yearlySalary1; //+ bonus1;
//yearlySalary2 = yearlySalary2; //+ bonus2;

System.out.printf("Employee 1 plous bonus is: %.2f\n", yearlySalary1);
System.out.printf("Employee 2 plous bonus is: %.2f\n", yearlySalary2);
System.out.println();
//second way 
//bonus1 = emp1.getSalaryBonus();
System.out.printf("Employee 1 plous bonus is: %.2f ", emp1.getSalaryBonus() + yearlySalary1);




}


}