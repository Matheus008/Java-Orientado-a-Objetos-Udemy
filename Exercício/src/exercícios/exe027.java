package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class exe027 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		int[] num = new int[n];
		int numPar=0;
		
		for (int i=0; i<num.length;i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();
		}
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i] % 2 == 0) {
				System.out.printf("%d ",num[i]);
				numPar++;
			}
		}
		
	    System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", numPar);

		
		sc.close();
	}

}
