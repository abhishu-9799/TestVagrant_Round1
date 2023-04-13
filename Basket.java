import java.util.ArrayList;

public class Basket {
	
	ArrayList<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public Product getProductWithMaxGst() {
		double maxGst = 0;
		Product maxGstProduct = null;
		for(Product product : products) {
			double gstAmount = product.getGstAmount();
			if(gstAmount > maxGst) {
				maxGst = gstAmount;
				maxGstProduct = product;
			}
		}
		return maxGstProduct;
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		for(Product product : products) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}

}
