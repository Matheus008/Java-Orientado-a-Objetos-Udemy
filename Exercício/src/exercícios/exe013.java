package exerc�cios;

import java.util.Scanner;

public class exe013 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um n�mero");
		int x= sc.nextInt();

		for(int i=1; i<=x;i++) {
			if(i %2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
