package vetor_e_lista;
import java.util.Locale;
import java.util.Scanner;

import entities.Vetores02Programa;

public class Vetores02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		Vetores02Programa[] vect = new Vetores02Programa[n];
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Vetores02Programa(name, price);
		}
		
		double sum = 0.0;
		
		for(int i=0;i<vect.length;i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum/vect.length;
		
		System.out.println(avg);
		
		sc.close();
	}

}
