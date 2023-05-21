package lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product05;
import util.ProductService;

public class Funcao_Recebe_Funcao_Como_Parametro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product05> list = new ArrayList<>();

		list.add(new Product05("Tv", 900.00));
		list.add(new Product05("Mouse", 50.00));
		list.add(new Product05("Tablet", 350.50));
		list.add(new Product05("HD Case", 80.90));

		ProductService ps = new ProductService();
		
		//double sum = ps.filteredSum(list);
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');		
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
	}

}
