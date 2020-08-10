package co.standup;

import java.util.Scanner;

public class SaleCommCal {

	public static void main(String[] args) {
		double salary = 200;
		double itemA = 239.99;
		double itemB = 129.75;
		double itemC = 350.89;
		double itemD = 99.95;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name of sales person: ");
		String nameOfSalesman = input.nextLine();
		
		System.out.println("Enter no item A sold: ");
		int numOfA = input.nextInt();
		
		System.out.println("Enter no item B sold: ");
		int numOfB = input.nextInt();
		
		System.out.println("Enter no item C sold: ");
		int numOfC = input.nextInt();
		
		System.out.println("Enter no item D sold: ");
		int numOfD = input.nextInt();
		
		double valueOfA = numOfA * itemA;
		double valueOfB = numOfB * itemB;
		double valueOfC = numOfC * itemC;
		double valueOfD = numOfD * itemD;
		
		double grossSales = valueOfA + valueOfB + valueOfC + valueOfD;
		double commission = 0.09 * grossSales;
		
		double newSalary = salary + commission;
		
		System.out.printf("%s having made a gross sale of: %.2f%n, with commission of %.2f%n "
				+ "your new salary for the week is: %.2f", nameOfSalesman, grossSales, commission, newSalary);
		

	}

}
