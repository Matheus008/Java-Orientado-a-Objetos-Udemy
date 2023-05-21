package map;
import java.util.HashMap;
import java.util.Map;

import entities.Product04;

public class map02 {

	public static void main(String[] args) {
		
		Map<Product04, Double> stock = new HashMap<>();
		
		Product04 p1 = new Product04("Tv", 900.0);
		Product04 p2 = new Product04("Notebook", 1200.0);
		Product04 p3 = new Product04("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product04 ps = new Product04("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
