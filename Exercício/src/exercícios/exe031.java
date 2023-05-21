package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class exe031 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//tamanho do vetor
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		//criar vetor
		int[] num = new int[n];
		
		for(int i=0;i<num.length;i++) {
			System.out.println("Digite um numero: ");
			num[i] = sc.nextInt();
		}
		
		//criar variaveis de soma e quantidade de numeros pares
		double soma = 0;
		int quantidadeDeNumerosPares =0;
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i] %2 == 0) {
				soma =soma + num[i];
				quantidadeDeNumerosPares++;
			}
			
		}
		
		//System.out.println(soma);
		//System.out.println(quantidadeDeNumerosPares);
		
		

		
		if(quantidadeDeNumerosPares != 0) {
			//calcular media
			double media = soma/quantidadeDeNumerosPares;
			System.out.printf("Media dos pares = %.1f",media);
		}else {
			System.out.print("\nNenhum número par");
		}
		
		sc.close();
	}

}
