package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Matrizees {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cima = 0;
		int baixo = 0;
		int esquerda = 0;
		int direita = 0;
		
		System.out.print("Digite a quandidade de linhas: ");
		int linha = sc.nextInt();
		System.out.print("Digite a quandidade de colunas: ");
		int coluna = sc.nextInt();
		int [][] matriz = new int[linha][coluna];
		
		for(int i=0;i<matriz.length; i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Número que você deseja procurar: ");
		int num = sc.nextInt();
		
		for(int i=0;i<matriz.length; i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(matriz[i][j] == num) {
					System.out.println("Posição "+i+","+j);
					if( j == 0) {
						 direita = j + 1;
						 System.out.println("Direita: "+matriz[i][direita]);
					}else if((j+1) == linha) {
						 esquerda = j - 1;
						 System.out.println("Esquerda: "+matriz[i][esquerda]);
					}else {
						 esquerda = j - 1;
						 direita = j + 1;
						 System.out.println("Esquerda: "+matriz[i][esquerda]);
						 System.out.println("Direita: "+matriz[i][direita]);
					}
					
					if(i == 0) {
						baixo = i + 1;
						System.out.println("Baixo: "+matriz[baixo][j]);
					}else if((i+1) == coluna) {
						cima = i - 1;
						System.out.println("Cima: "+matriz[cima][j]);
					}else {
						cima = i - 1;
						baixo = i + 1;
						System.out.println("Cima: "+matriz[cima][j]);
						System.out.println("Baixo: "+matriz[baixo][j]);
					}
					
					System.out.println("<-------------------------------->");

				}
			}
		}
		
		sc.close();
	}

}
