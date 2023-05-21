package util;

import java.util.function.Predicate;

import entities.Product05;

public class ProductPredicate implements Predicate<Product05>{
	
	@Override
	public boolean test(Product05 p) {
		return p.getPrice() >= 100.0;
	}
	
}
