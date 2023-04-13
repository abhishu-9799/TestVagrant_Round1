
public class Product {
	
	String name;
	double unitPrice;
	double gst;
	int quantity;
	
	public Product(String name, double unitPrice, double gst,int quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.gst = gst;
		this.quantity = quantity;
	}
	
	public double getPrice() {
		double total = unitPrice*quantity*(1+gst/100);
		if(unitPrice >= 500) {
			total *= 0.95;   //Applied 5% discount
		}
		return total;
	}
	
	public double getGstAmount() {
		return unitPrice*gst/100*quantity;
	}

}
