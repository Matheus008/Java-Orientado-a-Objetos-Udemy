package exercícios;

import java.util.Scanner;

public class exe005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hI,hF,hD;
		
		System.out.println("Hora de entrada: ");
		hI = sc.nextInt();
		
		System.out.println("Hora de saida: ");
		hF = sc.nextInt();
		
		if(hI < hF) {
			hD = hF-hI;
			
		}else {
			hD = 24 -hI+hF; 
		}
		
		System.out.println("O jogo durou "+hD+" hora(s)");
		
		sc.close();

	}

}
