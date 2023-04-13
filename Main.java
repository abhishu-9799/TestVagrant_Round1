
public class Main {

	public static void main(String[] args) {
		
		Basket basket = new Basket();
		basket.addProduct(new Product("Leather wallet",1100,18,1));
		basket.addProduct(new Product("Umbrella",900,12,4));
		basket.addProduct(new Product("Cigarette",200,28,3));
		basket.addProduct(new Product("Honey",100,0,2));
		
		Product maxGstProduct = basket.getProductWithMaxGst();
		System.out.println("The product for which we paid maximum GST Amount is : " + maxGstProduct.name);
		
		double totalPrice = basket.getTotalPrice();
		System.out.println("The total amount to be paid to the shop-keeper is : " + totalPrice);
	}

}
