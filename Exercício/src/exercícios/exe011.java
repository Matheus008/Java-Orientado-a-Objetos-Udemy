package exercícios;

import java.util.Scanner;

public class exe011 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de x:");
		int x = sc.nextInt();
		System.out.println("Digite o valor de y");
		int y = sc.nextInt();
		
		while (x != 0 || y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
				
				System.out.println("Digite o valor de x:");
				 x = sc.nextInt();
				System.out.println("Digite o valor de y");
				 y = sc.nextInt();
				
			}else if (x < 0 && y > 0) {
				System.out.println("Segundo");
				
				System.out.println("Digite o valor de x:");
				 x = sc.nextInt();
				System.out.println("Digite o valor de y");
				 y = sc.nextInt();
				 
			}else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
				
				System.out.println("Digite o valor de x:");
				 x = sc.nextInt();
				System.out.println("Digite o valor de y");
				 y = sc.nextInt();
				
			}else if (x > 0 && y < 0) {
				System.out.println("Quarto");
				
				System.out.println("Digite o valor de x:");
				 x = sc.nextInt();
				System.out.println("Digite o valor de y");
				 y = sc.nextInt();
			}
			
		}
		sc.close();
	}

}
