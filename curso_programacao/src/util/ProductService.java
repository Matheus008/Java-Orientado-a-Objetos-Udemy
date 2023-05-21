package util;

import java.util.List;
import java.util.function.Predicate;

import entities.Product05;

public class ProductService {
	
	public double filteredSum(List<Product05> list, Predicate<Product05> criteria) {
		double sum = 0.0;
		
		/*for (Product05 p : list) {
			if (p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}*/
		
		for (Product05 p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
	
}
