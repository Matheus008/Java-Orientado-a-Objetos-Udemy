package generics_set_map;

import java.util.Set;
import java.util.TreeSet;

import entities.Product03;

public class Treeset {

	public static void main(String[] args) {
		Set<Product03> set = new TreeSet<>();
		
		set.add(new Product03("TV", 900.0));
		set.add(new Product03("Notebook", 1200.0));
		set.add(new Product03("Tablet", 400.0));
		
		for (Product03 p : set) {
			System.out.println(p);
		}
	}

}
