package exercícios;

import java.util.Scanner;

public class exe001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num01 = sc.nextInt();
		int num02 = sc.nextInt();
		int som01 = num01 + num02;
		
		int num03 = sc.nextInt();
		int num04 = sc.nextInt();
		int som02 = num03 + num04;
		
		int num05 = sc.nextInt();
		int num06 = sc.nextInt();
		int som03 = num05 + num06;
		
		System.out.println("Soma dos números 1 e 2: "+ som01);
		System.out.println("Soma dos números 3 e 4: "+ som02);
		System.out.println("Soma dos números 5 e 6: "+ som03);
		
		sc.close();
	}

}
