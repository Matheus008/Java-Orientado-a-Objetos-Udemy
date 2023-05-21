package lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product05;
import util.UpperCaseName;

public class FUnction {

	public static void main(String[] args) {

		List<Product05> list = new ArrayList<>();

		list.add(new Product05("Tv", 900.00));
		list.add(new Product05("Mouse", 50.00));
		list.add(new Product05("Tablet", 350.50));
		list.add(new Product05("HD Case", 80.90));
		
		Function<Product05, String> func = p -> p.getName().toUpperCase();
		
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product05::staticUpperCaseName).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product05::nonStaticUpperCaseName).collect(Collectors.toList());
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		names.forEach(System.out::println);
	}
}
