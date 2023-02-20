package entites;

public class Products {
	private String products;
	private double price;
	
	public Products(String products,double price) {
		this.products = products;
		this.price = price;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
