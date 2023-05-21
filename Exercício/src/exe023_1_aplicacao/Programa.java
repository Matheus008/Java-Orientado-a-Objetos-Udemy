package exe023_1_aplicacao;

import java.util.Locale;
import java.util.Scanner;

import exe023_2_entidade.Conversor;

public class Programa {


	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � o valor do d�lar?");
		double valorDoDolar = sc.nextDouble();
		
		System.out.println("Quantos d�lares voc� deseja comprar?");
		double quantidadeDeDolares = sc.nextDouble();
		
		double totalEmReais = Conversor.Calcular(valorDoDolar, quantidadeDeDolares);
		
		System.out.printf("Total a apgar em Reais: %.2f%n", totalEmReais);
		
		sc.close();
	}

}
