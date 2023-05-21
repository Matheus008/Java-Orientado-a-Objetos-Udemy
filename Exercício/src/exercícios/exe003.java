package exercícios;

import java.util.Scanner;

public class exe003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero % 2 != 0) {
			System.out.println("Impar");
		}else {
			System.out.println("par");
		}
		sc.close();
	}

}
