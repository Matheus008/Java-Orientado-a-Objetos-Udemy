package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<Pessoa> list = new ArrayList<>();
				
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			double taxPorcent;
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double outgoingsHealth = sc.nextDouble();
				if(anualIncome < 20000) {
					taxPorcent = 0.15;
				}else {
					taxPorcent = 0.25;
				}
				list.add(new Fisica(name, anualIncome, taxPorcent, outgoingsHealth));
			}else {
				System.out.print("Number of employees: ");
				int numberClerk = sc.nextInt();
				if(numberClerk > 10) {
					taxPorcent = 0.14;
				}else {
					taxPorcent = 0.16;
				}
				list.add(new Juridica(name, anualIncome, taxPorcent, numberClerk));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0;
		for (Pessoa pessoa : list) {
			System.out.println(pessoa.getName()+": $ "+String.format("%.2f", pessoa.CalculationTax()));
			sum += pessoa.CalculationTax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ "+sum);
		
		sc.close();
	}

}
