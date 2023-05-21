package entities;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Leitura do x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Leitura do y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC)/ 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p- xC));
		
		 p = (yA + yB + yC)/ 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p- yC));
		
		System.out.printf("햞ea do triangulo x: %.4f%n",areaX);
		System.out.printf("햞ea do triangulo y: %.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.println("햞ea: X");
		}else {
			System.out.println("햞ea: Y");
		}
		
		sc.close();
	}

}
