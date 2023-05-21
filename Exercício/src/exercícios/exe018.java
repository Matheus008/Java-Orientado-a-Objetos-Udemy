package exercícios;

import java.util.Scanner;

public class exe018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N;i++) {
			
			if(N%i == 0) {
				System.out.println(i);
			}
			
			
		}
		sc.close();
	}

}
