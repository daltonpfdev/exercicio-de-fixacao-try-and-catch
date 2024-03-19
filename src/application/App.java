package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Data: ");
		System.out.print("Number: ");
		int numberAccount = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial Balance: ");
		double initialBalance = sc.nextDouble();
		
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(numberAccount, holder, initialBalance, withdrawLimit);
		System.out.println();
		
		System.out.print("Enter amont for withdraw: ");
		double withdraw = sc.nextDouble();
		
		try {
			account.withdraw(withdraw);
			System.out.println(account.toSting());
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
