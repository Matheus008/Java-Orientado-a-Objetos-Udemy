package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class exe032 {

	public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			//tamanho do vetor
			System.out.println("Quantas pessoas voce vai digitar? ");
			int n = sc.nextInt();
			
			//criar vetores
			String[] nome = new String[n];
			int[] idade = new int[n];
			
			for(int i=0;i<nome.length;i++) {
				System.out.println("Dados da "+(i+1)+"a pessoa: ");
				System.out.print("Nome: ");
				nome[i] = sc.next();
				System.out.print("Idade: ");
				idade[i] = sc.nextInt();
			}
			
			int idad = idade[0];
			String nom = nome[0];
			
			for(int i=1;i<nome.length;i++) {
				
				if(idade[i] > idad) {
					idad = idade[i] ;
					nom = nome[i] ;
				}
				
			}
			
			System.out.println("Pessoa mais velha: "+nom);
			
			sc.close();
	}

}
