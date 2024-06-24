package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Validator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int userAccountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountName = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char openingDeposit = sc.next().charAt(0);
		
		double startingBalance = 0;
		
		if(openingDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			startingBalance = sc.nextDouble();
		}
		
		Validator validator = new Validator(userAccountNumber, accountName, startingBalance);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(validator);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		validator.depositAmount(depositValue);
		
		System.out.println("Updated account data:");
		System.out.println(validator);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		validator.amountToWithdraw(withdrawValue);
		
		System.out.println("Updated account data:");
		System.out.println(validator);
		
		sc.close();
	}

}
