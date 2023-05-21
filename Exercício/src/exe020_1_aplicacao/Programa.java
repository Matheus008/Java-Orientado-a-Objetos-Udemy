package exe020_1_aplicacao;

import java.util.Locale;
import java.util.Scanner;

import exe020_2_entidade.retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangulo x;
		
		x = new retangulo();
		
		
		System.out.println("Largura: ");
		x.x = sc.nextDouble();
		
		System.out.println("Comprimento: ");
		x.y = sc.nextDouble();
		
		double areaX = x.area();
		
		System.out.println("Área: "+areaX);
		
		double perimetroX = x.perimetro();
		
		System.out.println("Perimetro: "+perimetroX);
		
		double diagonalX = x.diagonal();
		
		System.out.println("Diagonal: "+diagonalX);
		
		sc.close();
	}

}
