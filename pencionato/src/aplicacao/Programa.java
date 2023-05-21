package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String email;
		int quarto = -1;
		
		//pegar a quantidade de pessoas q vão alugar um quarto
		System.out.print("Quantas pessoas vão alugar um quarto? ");
		int quantidade = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[10];
		
		for(int i=0;i<quantidade;i++) {
			
			System.out.println("Alugar #"+(i+1));
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Quarto: ");
			quarto = sc.nextInt();	
			System.out.println();
			
			while(quarto >= 9) {
				
				System.out.println("NÚMERO DE QUARTO INVÁLIDO");
				System.out.println();
				System.out.println("Alugar #"+(i+1));
				System.out.print("Nome: ");
				sc.nextLine();
				nome = sc.nextLine();
				System.out.print("Email: ");
				email = sc.nextLine();
				System.out.print("Quarto: ");
				quarto = sc.nextInt();
				System.out.println();
			}
			while (pessoa[quarto] != null) {
				
				System.out.println("QUARTO OCUPADO!!");
				System.out.println();
				System.out.println("Alugar #"+(i+1));
				System.out.print("Nome: ");
				sc.nextLine();
				nome = sc.nextLine();
				System.out.print("Email: ");
				email = sc.nextLine();
				System.out.print("Quarto: ");
				quarto = sc.nextInt();
				System.out.println();
			}
			pessoa[quarto] = new Pessoa(nome, email, quarto);
		}
		
		System.out.println("Quarto(s) ocupados:");
		
		for(int i=0;i<pessoa.length;i++) {
			if(pessoa[i] != null) {
				System.out.println(pessoa[i].getQuarto()+": "+pessoa[i].getNome()+", "+pessoa[i].getEmail());
			}
		}
		
		sc.close();
	}

}
