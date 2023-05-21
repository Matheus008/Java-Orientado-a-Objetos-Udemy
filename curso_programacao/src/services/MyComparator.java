package services;

import java.util.Comparator;

import entities.Product05;

public class MyComparator implements Comparator<Product05> {

	@Override
	public int compare(Product05 p1, Product05 p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}