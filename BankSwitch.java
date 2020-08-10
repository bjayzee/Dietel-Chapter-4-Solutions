package co.standup;

import java.util.Scanner;

public class BankSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount: ");
		double amount = input.nextDouble();
		
		System.out.println("Enter Account type: ");
		String accountType = input.next().toUpperCase();
		
		switch(accountType) {
		
		case "A":
			double interest = amount * 0.015;
			System.out.print("The interest is:" +interest);
			break;
		
		case "B":
			double interest1 = amount * 0.02;
			System.out.print("The interest is:" +interest1);
			break;
			
		case "C":
			double interest2 = amount * 0.015;
			System.out.print("The interest is:" +interest2);
			break;
			
		case "X":
			double interest3 = amount * 0.05;
			System.out.print("The interest is:" +interest3);
			break;
		}
		
	}

}
