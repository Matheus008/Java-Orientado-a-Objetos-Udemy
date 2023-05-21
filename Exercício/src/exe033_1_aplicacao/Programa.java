package exe033_1_aplicacao;

import java.util.Locale;
import java.util.Scanner;

import exe033_2_entidade.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura;
		char sexo;
		int quantidadeDeMulheres = 0;
		int quantidadeDeHomens = 0;
		double menorAltura;
		double maiorAltura;
		double somaAlturaMulher = 0;
		double mediaAlturaMulher = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[n];
		
		for(int i=0;i<pessoa.length;i++) {
			System.out.print("Altura da "+(i+1)+"a pessoa: ");
			altura = sc.nextDouble();
			System.out.print("Genero da "+(i+1)+"a pessoa: ");
			sexo = sc.next().charAt(0);
			pessoa[i] = new Pessoa(altura,sexo);
		}
		menorAltura = pessoa[0].getAltura();
		maiorAltura = pessoa[0].getAltura();
		
		for(int i=0;i<pessoa.length;i++) {
			
			if(pessoa[i].getAltura() > maiorAltura) {
				maiorAltura = pessoa[i].getAltura();
			}else if(pessoa[i].getAltura() < menorAltura) {
				menorAltura = pessoa[i].getAltura();
			}
			
			if(pessoa[i].getSexo() == 'M') {
				quantidadeDeHomens ++;
			}else {
				quantidadeDeMulheres ++;
				somaAlturaMulher += pessoa[i].getAltura();
			}
			
		}
		mediaAlturaMulher = somaAlturaMulher / quantidadeDeMulheres; 
		
		System.out.println("Menor Altura: "+menorAltura);
		System.out.println("Maior Altura: "+maiorAltura);
		System.out.printf("Media da(s) altura(s) da(s) mulhere(s) = %.2f\n",mediaAlturaMulher);
		System.out.println("Número de homen(s) = "+quantidadeDeHomens);
		
		
		
		sc.close();
	}

}
