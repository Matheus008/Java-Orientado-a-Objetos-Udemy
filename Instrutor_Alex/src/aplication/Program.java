package aplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> courseA = new ArrayList<>();
		List<Integer> courseB = new ArrayList<>();
		List<Integer> courseC = new ArrayList<>();
		
		Set<Integer> total = new HashSet<>();
		
		System.out.print("How many students for course A?");
		Integer course = sc.nextInt();
		
		for (int i = 0; i < course; i++) {
			
			int code = sc.nextInt();
			courseA.add(code);
			
		}
		
		total.addAll(courseA);
		
		System.out.print("How many students for course B?");
		course = sc.nextInt();
		
		for (int i = 0; i < course; i++) {
			
			int code = sc.nextInt();
			courseB.add(code);
			
		}
		
		total.addAll(courseB);
		
		System.out.print("How many students for course C?");
		course = sc.nextInt();
		
		for (int i = 0; i < course; i++) {
			
			int code = sc.nextInt();
			courseC.add(code);
			
		}
		
		total.addAll(courseC);
		
		System.out.println("Total students: " + total.size());
		
		
		sc.close();
	}

}
/*
-------------------------------------------------------------------------------------------
outra forma de fazer
	
public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			b.add(number);
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			c.add(number);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());

		sc.close();
	}
}
	*/