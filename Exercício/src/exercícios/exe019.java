package exercícios;

import java.util.Scanner;

public class exe019 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Insira um número inteiro positivo: ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			int i2 = i*i;
			int i3 = i*i*i;
			
			System.out.print(i+" ");
			System.out.print(i2+" ");
			System.out.println(i3);
			
			//System.out.printf("%d %d %d%n", i,i2,i3);
		}
		
		sc.close();
	}

}
