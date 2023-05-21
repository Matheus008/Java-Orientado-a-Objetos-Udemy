package lambda;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product05;

public class comparator {

	public static void main(String[] args) {

		List<Product05> list = new ArrayList<>();

		list.add(new Product05("TV", 900.00));
		list.add(new Product05("Notebook", 1200.00));
		list.add(new Product05("Tablet", 450.00));
		
		// list.sort(new MyComparator());
		
		/*Comparator<Product05> comp = new Comparator<Product05>() {
			@Override
			public int compare(Product05 p1, Product05 p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};*/
		
		/*Comparator<Product05> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};*/
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product05 p : list) {
			System.out.println(p);
		}
	}
}
