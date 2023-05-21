package exercícios;

import java.util.Scanner;

public class exe008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double numero;
		
		System.out.println("Insira um número: "); 
		numero = sc.nextDouble();
		
		if(numero < 0) {
			System.out.println("fora de intervalo");
		}else if (numero > 0 && numero < 25) {
			System.out.println("Intervalo (0,25)");
		}else if (numero < 50) {
			System.out.println("Intervalo (25,50)");
		}else if (numero < 75) {
			System.out.println("Intevalo (50,75)");
		}else {
			System.out.println("Intervalo (75,100)");
		}
		
		sc.close();
	}

}
