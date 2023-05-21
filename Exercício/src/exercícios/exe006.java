package exercícios;

import java.util.Scanner;

public class exe006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo,quantidade;
		double total = 0;
		
		System.out.println("Bem vindo a lanchonete");
		System.out.println("Código		Especificação	Preço");
		System.out.println("1		Cachorro quente	R$4.00");
		System.out.println("2		X-Salada	R$4.50");
		System.out.println("3		X-Bacon		R$5.00");
		System.out.println("4		Torrada Simples	R$2.00");
		System.out.println("5		Refrigerante	R$1.50");
		System.out.println("Escolha um produto: ");
		codigo = sc.nextInt();
		
		System.out.println("Quantidade:");
		
		quantidade = sc.nextInt();
		
		if(codigo == 1) {
			total = 4 * quantidade;
		}else if (codigo == 2) {
			total = 4.5 * quantidade;
		}else if (codigo == 3) {
			total = 5 * quantidade;
		}else if(codigo == 4) {
			total = 2 * quantidade;
		}else if (codigo == 5) {
			total = 1.5 * quantidade;
		}else {
			System.out.println("Código inválido");
		}
		
		System.out.printf("O seu valor total foi: R$%.2f%n",total);
		
		sc.close();
	}

}
