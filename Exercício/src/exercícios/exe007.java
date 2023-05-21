package exercícios;

import java.util.Scanner;

public class exe007 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double pontox,pontoy;
		
		System.out.println("Digite o ponto x");
		pontox = sc.nextDouble();
		
		System.out.println("Digite o ponto y");
		pontoy = sc.nextDouble();
		
		if(pontox == 0 && pontoy == 0) {
			System.out.println("Origem");
		}else if (pontox == 0) {
			System.out.println("eixo y");
		}else if (pontoy == 0) {
			System.out.println("eixo x");
		}else if (pontox > 0 && pontoy > 0) {
			System.out.println("Q1");
		}else if (pontox < 0 && pontoy > 0) {
			System.out.println("Q2");
		}else if (pontox < 0 && pontoy < 0) {
			System.out.println("Q3");
		}else {
			System.out.println("Q4");
		}
		
		
		sc.close();

	}

}
