package exercícios;

import java.util.Scanner;

public class exe016 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de pares de números a serem lidos:");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println("Numerador: ");
			int num = sc.nextInt();
			System.out.println("Denominador: ");
			int dem = sc.nextInt();
			
			if(dem == 0) {
				System.out.println("Divisão imposível");
			}else{
				
				double resultado = (double) num / dem;
				
				System.out.printf("%.1f%n",resultado);
				
			}
			
		}
		
		sc.close();
		
	}

}
