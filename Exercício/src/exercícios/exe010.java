package exerc�cios;

import java.util.Scanner;

public class exe010 {

	public static void main(String[] args) {
		
		System.out.println("Digite a senha com 4 n�meros: ");
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha inv�lida");
			
			System.out.println("Digite novamente:");
			
			senha = sc.nextInt(); 
			
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
		
	}

}
