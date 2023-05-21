package exercícios;

import java.util.Scanner;

public class exe004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 , n2, n3;
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
				
		if(n1 > n2) {
			n3 = n1%n2;
			if(n3 != 0) {
				System.out.println("Não são multiplos");
			}else {
				System.out.println("São multiplos");
			}
		}else {
			n3 = n2%n1;
			if (n3 != 0) {
				System.out.println("Não são multiplos");
			}else {
				System.out.println("São multiplos");
			}
		}
		sc.close();
	}

}
