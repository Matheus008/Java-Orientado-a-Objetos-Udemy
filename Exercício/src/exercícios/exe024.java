package exerc�cios;

import java.util.Locale;
import java.util.Scanner;

public class exe024 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos n�meros voc� vai digitar?");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Digite um n�mero:");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("N�meros negativos:");
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] < 0) {
				System.out.printf("%d\n", numeros[i]);
			}
		}
		sc.close();
	}
}
