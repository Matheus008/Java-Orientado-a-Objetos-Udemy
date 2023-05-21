package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Qual é o número da conta?");
		 int numeroDaConta = sc.nextInt();
		 
		 System.out.println("Qual é o nome do cliente?");
		 sc.nextLine();
		 String nomeDoCliente = sc.nextLine().toLowerCase();
		 
		 Conta conta = new Conta(numeroDaConta, nomeDoCliente);
		 System.out.println("Deseja efetuar um depósito inicial? (s/n)");
		 char resp = sc.next().charAt(0);
		 
		 double saldo;
		 if(resp == 's' ) {
			 System.out.println("Insira o saldo inicial:");
			 saldo = sc.nextDouble();
			 conta.addSaldo(saldo); 
		 }
		 
		 System.out.println("Conta Bancária:\n" +conta);
		 
		 System.out.println("Deseja efetuar um depósito? (s/n)");
		 char confirmar = sc.next().charAt(0); 
		 
		 char deposito;
		 if(confirmar == 's') {	 
			 do {
				 System.out.println("\nInsira um depósito:");
				 saldo = sc.nextDouble();
				 conta.addSaldo(saldo);
				 System.out.println("\nDeseja efetuar outro depósito? (s/n)");
				 deposito = sc.next().charAt(0);
			 } while (deposito == 's');
		 }
		
		System.out.println(conta);
		
		System.out.println("Deseja efetuar um saque? (s/n)");
		confirmar = sc.next().charAt(0);
		
		if (confirmar == 's') {
			do {
				System.out.println("Fazer saque:");
				saldo = sc.nextDouble();
				conta.removeSaldo(saldo);
				System.out.println("\nDeseja efetuar outro saque? (s/n)");
				deposito = sc.next().charAt(0);
			} while (deposito == 's');
		}
				
		System.out.println(conta);
		
		sc.close();
	}

}
