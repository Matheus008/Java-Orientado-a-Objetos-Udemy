package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAcount;
//import entities.BusinessAcount;
import entities.SavingsAccount;

public class heranca_ {

	public static void main(String args[]) {
		
		//Herança e classes abstratas
		
		//Account acc = new Account(1001, "Alex", 1000.0);
		//acc.withdraw(200.0);
		//System.out.println(acc.getBalance());
		//acc.withdraw(50.0);
		
		//Account acc01 = new SavingsAccount(1002,"Maria",1000.0,0.01);
		//acc01.withdraw(50.0);
		//System.out.println(acc.getBalance()+"\n"+acc01.getBalance());
		//acc01.withdraw(200.0);
		//System.out.println(acc01.getBalance());
		
		/*Account acc03 = new BusinessAcount(1003, "Bob", 1000.0, 500.0);
		acc03.withdraw(200);
		System.out.println(acc03.getBalance());
		
		BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAcount acc4 = (BusinessAcount)acc2;
		acc4.Loan(100.0);
		
		// BusinessAcount acc5 = (BusinessAcount)acc3;
		if(acc3 instanceof BusinessAcount) {
			BusinessAcount acc5 = (BusinessAcount)acc3;
			acc5.Loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}*/
		
		
		//Classe abstratas
		// não pode ser instanciada	Account acc1 = new Account(1001,"Alex",1000.0);
		/*Account acc2 = new SavingsAccount(1002,"Maria",1000.0, 0.01);
		Account acc3 = new BusinessAcount(1003,"Bob",1000.0,500.0);*/
		
		/*List <Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001,"Alex",500.0,0.01));
		list.add(new BusinessAcount(1002,"Maria",1000.0,400.0));
		list.add(new SavingsAccount(1004,"Bob",300.0,0.01));
		list.add(new BusinessAcount(1005,"Anna",500.0,500.0));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}*/
		
	}	
}
