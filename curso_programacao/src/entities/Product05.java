package entities;

public class Product05 {

	private String name;
	private Double price;

	public Product05() {
	}

	public Product05(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static boolean staticProductPredicate(Product05 p) {
		return p.getPrice() >= 100;

	}

	public boolean nonStaticProductPredicate() {
		return price >= 100;

	}

	public static void staticPriceUpdate(Product05 p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	public void nonStaticPriceUpdate() {
		setPrice(getPrice() * 1.1);
	}

	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}

	public static String staticUpperCaseName(Product05 p) {
		return p.getName().toUpperCase();
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

}
