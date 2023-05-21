package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class exe034 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double somaNotas = 0;
		double mediaNotas = 0;
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] nota01 = new double[n];
		double[] nota02 = new double[n];
		
		for(int i=0;i<nome.length;i++) {
			System.out.println("Digite o nome, primeira e segunda nota do "+(i+1)+"o aluno");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota01[i] = sc.nextDouble();
			nota02[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(int i=0;i<nome.length; i++) {
			somaNotas = nota01[i]+nota02[i];
			mediaNotas = somaNotas/2;
			
			if(mediaNotas >= 6) {
				System.out.println(nome[i]);
			}
			
		}
		
		sc.close();
	}

}
