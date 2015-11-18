import java.util.Scanner;

public class SalesCommission{

public static void main(String[]args){
	
Scanner input = new Scanner(System.in);
double salary;
double grossSale;
/*
1 239.99
2 129.75
3 99.95
4 350.89
*/

double item1 = 239.99;
double item2 = 129.75;
double item3 = 99.95;
double item4 = 350.00;
int product=0;
/*
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each
*/
while(product < 4){
	product++;
System.out.println("Choose :1, 2, 3, 4: ");
grossSale = input.nextInt();
if(grossSale== 1){

salary = grossSale* (item1 *9)/100;

}else if(grossSale==2){

salary = 200 + (item2 *9)/100;

}else if(grossSale==3){
	salary = 200 + (item3 *9)/100;

}else {

	salary = 200 + (item4 *9)/100;

}



System.out.printf(" the earning is : %.2f\n", salary);

}


}

}