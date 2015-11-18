


public class Invoice{

	//number (type String), a part description (type String), a quantity of the
	//item being purchased (type int) and a price per item (double).

	private String number;
	private String description;
	private int quantity;
	private double priceItem;
	double amount;
/*
Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.

*/

//constructor
	public Invoice(String number, String description, int quantity, double priceItem){
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.priceItem = priceItem;

	}

	public void setNumber (String number){
		number = number;
	}

	public void setDescription(String description){
		description = description;
	}
	public void setQuantity (int quantity){
		quantity = quantity;
	}
	public void setPriceItem(double priceItem){
		priceItem = priceItem;
	}
	public String getNumber(){
		return number;
	}
	public String getDescription(){
		return description;
	}
	public int getQuantity (){
		return quantity;
	}
	public double getPriceItem(){
		return priceItem;
	}

	/*In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
multiplies the quantity by the price per item), then returns the amount as a double value. If the
quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
0.0. Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities.
		*/
	public double getInvoiceAmount(){
		if (quantity >0 && priceItem >0){// && priceItem>0){
			 amount = quantity* priceItem;
		
		}else{
			amount = 0;
		}
		return amount;
	}







}