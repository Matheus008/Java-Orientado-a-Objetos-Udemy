package exe022_1_aplicacao;

import java.util.Locale;
import java.util.Scanner;

import exe022_1_entidade.Estudante;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.println("Nome do aluno: ");
		estudante.nome = sc.next();
		System.out.println("Nota 01:");
		estudante.nota1 = sc.nextDouble();
		System.out.println("Nota 02:");
		estudante.nota2 = sc.nextDouble();
		System.out.println("Nota 03:");
		estudante.nota3 = sc.nextDouble();
		
		System.out.println(estudante);
		
		if(estudante.media() < 60) {
			System.out.println("Reprovado");
			System.out.println("Faltou "+estudante.reprovado()+" pontos");
		}else {
			System.out.println("Aprovado");
		}
		
		sc.close();
	}

}
