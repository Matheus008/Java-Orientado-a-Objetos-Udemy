package exercicio_exemplo;


import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � a largura do terreno?");
		double largura = sc.nextDouble();
		
		System.out.println("Qual � o comprimento?");
		double comprimento = sc.nextDouble();
		
		System.out.println("Qual � o pre�o do metro quadrado?");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("�rea: %.2f%n", area);
		System.out.printf("Pre�o: %.2f%n",  preco);
		
		sc.close();
	}

}
