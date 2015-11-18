

public class InvoiceTest{

public static void main(String []args){

	//String number, String description, int quantity, double priceItem
	Invoice invoice1 = new Invoice("1", "bread pieces", 50, 15);
	Invoice invoice2 = new Invoice("2", "olive oi kens", -12, 50);
	Invoice invoice3 = new Invoice("3", "cheese stagionato", 6, 150);

	//calling invoice 1 number
	System.out.println("Calling number of inovice 1");
	String number = invoice1.getNumber();
	System.out.printf("The invoce number is: %s\n", number);
	
	System.out.println("Calling number of inovice 1");
	String description = invoice1.getDescription();
	System.out.printf("The invoice contains: %s\n", description);

	System.out.println("Calling price per item of inovice 2");
	double priceperItem = invoice2.getPriceItem();
	System.out.printf("Price per olive kens is: %.2f\n", priceperItem);


	System.out.println("Calling the invoice 1 amount ");
	double amount = invoice2.getInvoiceAmount();
	System.out.printf("THe amount for invoice 1 is: %.2f\n", amount);



	System.out.println("\n");

	System.out.println("Calling number of inovice 1\n");
	System.out.println("Calling number of inovice 1\n");

	System.out.println("Calling number of inovice 1\n");
	System.out.println("Calling number of inovice 1\n");



}



}