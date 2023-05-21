package lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product05;

public class COnsumer {

	public static void main(String[] args) {

		List<Product05> list = new ArrayList<>();

		list.add(new Product05("Tv", 900.00));
		list.add(new Product05("Mouse", 50.00));
		list.add(new Product05("Tablet", 350.50));
		list.add(new Product05("HD Case", 80.90));

		double factor = 1.1;
		
		Consumer<Product05> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};
		
		//list.forEach(new PriceUpdate());
		//list.forEach(Product05::staticPriceUpdate);
		//list.forEach(Product05::nonStaticPriceUpdate);
		//list.forEach(cons);
		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);

	}

}
