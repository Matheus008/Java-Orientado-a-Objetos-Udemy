package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.ImportedProduct;
import entitie.Product;
import entitie.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>(); 
		
		System.out.print("Enter the number of products: ");
		Integer n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #"+(i+1)+" data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			Character productType = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(productType == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, customsFee));
			}else if(productType == 'u') {
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name, price, manufactureDate));
			}else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product pr : list) {
			System.out.println(pr.toString());
		}
		
		sc.close();
	}

}
