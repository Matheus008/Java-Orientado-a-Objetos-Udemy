package exe021_1_aplicacao;

import java.util.Locale;
import java.util.Scanner;

import exe021_2_entidade.Funcionario;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario  x;
		
		x = new Funcionario();
		
		System.out.println("Informe o nome do Funcionário: ");
		x.nome = sc.next();
		System.out.println("Salário Bruto: ");
		x.salarioBruto = sc.nextDouble();
		System.out.println("Taxa: ");
		x.taxa = sc.nextDouble();
				
		System.out.println(x);
		
		System.out.println("Qual a porcentagem? ");
		double sB = sc.nextDouble();
		x.porcento(sB);
		
		System.out.println("Atualizado: "+x);
		
		sc.close();
		
	}

}
