public class Date {

/*Create a class called Date that includes three instance variables—a month (type
int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
variables and assumes that the values provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.
*/

private int month;
private int day;
private int year;

public Date(int month, int day, int year){

	this.month = month;
	this.day = day;
	this.year = year;
}

public void setDay(int day){
	day = day;
}
public void setMonth(int month){

	month = month;
}
public void setYear(int year){
	year = year;
}


public void displayDate(){
	System.out.printf("the date is: %s/%s/%s\n", month, day, year);


}





}