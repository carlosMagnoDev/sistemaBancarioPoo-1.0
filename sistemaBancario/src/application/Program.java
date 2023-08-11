package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Account account = null;
		
		System.out.println("welcome to bank system!\n");
		System.out.println("please input your name and password to register");
		
		System.out.print("Enter account number:");
		int number = input.nextInt();
		
		System.out.print("Enter account holder:");
		input.nextLine();
		String holder = input.nextLine();
		
		System.out.print("\nIs thre na initial deposit (y/n)? ");
		char confirm = input.next().charAt(0);
		
		if (confirm == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = input.nextDouble();
			account = new Account(number, holder, initialDeposit);
			
		} else if (confirm == 'n') {			
			account = new Account(number, holder);
		}

		System.out.println("\nAccount data:\n" + account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = input.nextDouble();
		
		account.deposit(depositValue);
		System.out.println("Updated account data:\n" + account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = input.nextDouble();
		
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:\n" + account);

		
		
		input.close();
	}
}
