package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class exe029 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Tamanho dos vetores
		System.out.print("Quantos valores vai ter o vetor? ");
		int n = sc.nextInt();
		//criando os vetores
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorSoma = new int[n];
		//pegar valores do vetor A
		System.out.println("Digite os valores do vetor A: ");
		
		for(int i=0;i<vetorA.length;i++) {
			vetorA[i] = sc.nextInt();
		}
		//pegar valores do vetor B
		System.out.println("Digite os valores do vetor B: ");

		
		for(int i=0;i<vetorB.length;i++) {
			vetorB[i] = sc.nextInt();
		}
		//mostrar a soma dos vetores A e B
		System.out.println("VETOR RESULTANTE: ");
		
		for(int i=0;i<vetorSoma.length;i++) {
			vetorSoma[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorSoma[i]);
		}
		
		sc.close();
	}

}
