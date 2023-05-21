package exercicio_exemplo;


import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a largura do terreno?");
		double largura = sc.nextDouble();
		
		System.out.println("Qual é o comprimento?");
		double comprimento = sc.nextDouble();
		
		System.out.println("Qual é o preço do metro quadrado?");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Área: %.2f%n", area);
		System.out.printf("Preço: %.2f%n",  preco);
		
		sc.close();
	}

}
