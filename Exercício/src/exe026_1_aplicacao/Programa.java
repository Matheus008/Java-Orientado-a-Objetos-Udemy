package exe026_1_aplicacao;

import java.util.Locale;
import java.util.Scanner;

import exe026_2_entidade.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		double altura;
		double sumAltura = 0.0;
		double mediaAltura;
		int nMenorDeIdade = 0;
		double percentualMenores;
		
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vec = new Pessoa[n];
		
		for(int i=0;i<vec.length;i++) {
			int  i2 = i+1;
			System.out.println("Dados da "+i2+"a pessoa");
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			vec[i] = new Pessoa(nome, idade, altura);
		}
		
		
		for(int i=0;i<vec.length;i++) {
			
			if (vec[i].getIdade() < 16) {
				nMenorDeIdade ++;
			}
			
			sumAltura += vec[i].getAltura();
		}
		mediaAltura = sumAltura/n;
		
		percentualMenores = ((double)nMenorDeIdade/n)*100;
		
		System.out.printf("Altura média: %.2f\n",mediaAltura);
		System.out.print("Pessoas com menos de 16 anos: "+percentualMenores+" %\n");
		
		for (int i=0 ;i<vec.length;i++) {
			if(vec[i].getIdade() < 16) {
				System.out.println(vec[i].getNome());
			}
			
		}
		
		sc.close();
		
	}

}
