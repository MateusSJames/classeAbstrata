package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));
		
		double sum = 0.0;
		for(Account c : list) {
			sum += c.getBalance();
		}
		System.out.printf("Total balance: R$ %.2f%n", sum);
		
		for(Account c : list) {
			c.deposit(10.0);
			System.out.printf("Update Balance for Account %d: R$ %.2f%n", c.getNumber(), c.getBalance());
		}
		
	}
	
}



