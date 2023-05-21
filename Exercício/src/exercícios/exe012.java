package exercícios;

import java.util.Scanner;

public class exe012 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("Bem vindo ao porto Márcio");
		System.out.println("código produto");
		System.out.println("1      Álcool");
		System.out.println("2      Gasolina");
		System.out.println("3      Diesel");
		System.out.println("4      fim");
		System.out.println("qual foi a gasolina colocada?");
		
		codigo = sc.nextInt();
		
		while(codigo != 4) {
			
			if (codigo == 1) {
				
				alcool += 1;
				
			}else if (codigo == 2) {
				
				gasolina += 1;
				
			}else if (codigo == 3) {
				
				diesel += 1;
				
			}
			
			codigo = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
		sc.close();
	}

}
