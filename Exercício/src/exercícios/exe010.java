package exercícios;

import java.util.Scanner;

public class exe010 {

	public static void main(String[] args) {
		
		System.out.println("Digite a senha com 4 números: ");
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha inválida");
			
			System.out.println("Digite novamente:");
			
			senha = sc.nextInt(); 
			
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
		
	}

}
