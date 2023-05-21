package util;

import java.util.function.Consumer;

import entities.Product05;

public class PriceUpdate implements Consumer<Product05> {

	@Override
	public void accept(Product05 p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}