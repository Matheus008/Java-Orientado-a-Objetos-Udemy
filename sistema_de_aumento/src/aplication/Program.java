package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entitie.Employe;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employe> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Employee #"+(i+1)+":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employe emp = new Employe(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Employe emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		//Integer pos = position(list, idSalary);
		
		if(emp/*pos*/ == null) {
			System.out.println("This id does not exist");
		}else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			//list.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List employee");
		
		for(Employe e : list) {
			System.out.println(e);
		}
		
		
		sc.close();
	}
	
	public static Integer position(List<Employe> list,int id) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId() == id) {
				return i;
			}	
		}
		return null;
	}
	
}
