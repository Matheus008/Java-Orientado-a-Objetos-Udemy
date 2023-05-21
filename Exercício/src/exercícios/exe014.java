package exercícios;

import java.util.Scanner;

public class exe014 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N;
		int in = 0;
		int out = 0;
		
		System.out.println("Quantidade de números a serem lidos :");
		N = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			System.out.println("Insira um número: ");
			int x= sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in++;
			}else {
				out++;
			}
			
		}
		
		System.out.println(in +" in");
		System.out.println(out +" out");
		
		sc.close();
	}

}
