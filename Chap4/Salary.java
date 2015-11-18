import java.util.Scanner;

public class Salary{
	
public static void main(String [] args){

/*
(Salary Calculator) Develop a Java application that determines the gross pay for each of
three employees. The company pays straight time for the first 40 hours worked by each employee
and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
number of hours worked last week and their hourly rates. Your program should input this information
for each employee, then determine and display the employee’s gross pay. Use class Scanner to
input the data.


*/
Scanner input = new Scanner(System.in);
int workHrs;
//double bonusHrs;// = regularHrs*0.5;
double grossPay = 0;
double overHrRate;
int employee = 1;
int  hrRate;


while(employee<= 3){
	

System.out.printf("Insert the regular hours for Employee %d: ", employee);
workHrs = input.nextInt();


//System.out.printf("Insert the bounus hours for employee %d: ", employee);
//bonusHrs = input.nextInt();


System.out.printf("Insert the hours rate for Employee %d: ", employee);
hrRate = input.nextInt();

if(workHrs<=40){
	grossPay = hrRate*(workHrs);
}else if(workHrs> 40){
	overHrRate = hrRate * 1.5;
	grossPay = (workHrs -40) * overHrRate + (40 * hrRate);
}

System.out.printf("Employ %d gross pay is: %.2f \n",employee, grossPay);



employee++;


}



}









}