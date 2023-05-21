package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class exe025 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos números você quer digitar? ");
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for(int i=0;i<num.length;i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();
		}
		
		System.out.print("Valores = ");
		
		double sum = 0;
		
		for(int i=0;i<num.length;i++) {
			sum += num[i];
	    	System.out.printf("%d ",num[i]);

		}
		
		double media = sum / n;
		
		System.out.println("\nSoma = "+sum);
		System.out.println("Média = "+media);
		
		sc.close();
	}

}
