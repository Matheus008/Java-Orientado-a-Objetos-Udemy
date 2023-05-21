package lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product05;
import util.ProductPredicate;

public class PRedicate {

	public static void main(String[] args) {

		List<Product05> list = new ArrayList<>();

		list.add(new Product05("Tv", 900.00));
		list.add(new Product05("Mouse", 50.00));
		list.add(new Product05("Tablet", 350.50));
		list.add(new Product05("HD Case", 80.90));

		double min = 100.0;
		
		Predicate<Product05> pred = p -> p.getPrice() >= min;
		
		//list.removeIf(new ProductPredicate());
		//list.removeIf(Product05::staticProductPredicate);
		//list.removeIf(Product05::nonStaticProductPredicate);
		//list.removeIf(pred);
		list.removeIf(p -> p.getPrice() >= min);

		for (Product05 p : list) {
			System.out.println(p);
		}

	}

}
