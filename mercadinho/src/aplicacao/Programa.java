package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada de produto:");
		System.out.print("Nome:");
		String nome = sc.nextLine();
		System.out.print("Preço:");
		double preco = sc.nextDouble();
		Produto produto = new  Produto(nome, preco);
		
		//atualizar o preço
	//	produto.setName("Computador");
	//	System.out.println("Nome atualizado: " + produto.getName());
	//	produto.setPreco(1200.00);
	//	System.out.println("Preço atualizado: " + produto.getPreco());
		
		System.out.println();
		System.out.println("Produto: "+produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos a serem add no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualizado: "+produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualizado: "+produto);
		
		sc.close();
	}

}
