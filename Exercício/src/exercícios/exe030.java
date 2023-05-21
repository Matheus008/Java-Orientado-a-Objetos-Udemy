package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class exe030 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner(System.in);
		
		//Tamanho do vetor
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		//criar vetor
		double[] num = new double[n];
		//criar variavel que vai somar os vetores
		double soma = 0;
		//pegar os vetores e somar
		for(int i=0;i<num.length;i++) {
			System.out.println("Digite um numero: ");
			num[i] = sc.nextDouble();
			soma += num[i];
		}
		
		//fazer a media do vetor 
		double media = soma/n;
		//mostrar os vetores abaixo da media
		System.out.printf("Media do vetor = %.3f\n",media);
		System.out.println("Elementos abaixo a media: ");
		
		for(int i=0;i<num.length;i++) {
			if(num[i] < media) {
				System.out.println(	num[i]);
			}
		}
		
		
		sc.close();
	}

}
