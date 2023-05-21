package exercícios;


import java.util.Locale;
import java.util.Scanner;

public class exe028 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for(int i=0;i<num.length;i++) {
			System.out.print("\nDigite um número: ");
			num[i] = sc.nextInt();
		}
		
		int maior = num[0];
		int posmaior = 0;
		
		for(int i=1;i<num.length;i++) {
			if(num[i] > maior) {
				maior = num[i];
				posmaior = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = \n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
		
		sc.close();
	}

}
