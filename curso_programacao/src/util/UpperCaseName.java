package util;

import java.util.function.Function;

import entities.Product05;

public class UpperCaseName implements Function<Product05, String> {

	@Override
	public String apply(Product05 p) {
		return p.getName().toUpperCase();
	}

}
