package aplicação;

import java.util.Locale;
import java.util.Scanner;

import util.Calcular;

public class Programa {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Raio: ");
		double raio = sc.nextDouble();
		
		double c = Calcular.circunferencia(raio);
		
		double v = Calcular.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("Volume: %.2f%n",Calcular.PI);


		
		sc.close();
	}
	
}
