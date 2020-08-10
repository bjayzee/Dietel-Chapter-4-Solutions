package co.standup;

import java.util.Scanner;

public class OrderComputers{
	
	public static void main(String...args) {
		Scanner screen = new Scanner(System.in);
		
		double software =  65.99;
		double printer = 125.00;
		double screen43cm = 99.99;
		double screen38cm = 75.99;
		double sum = 375.99; 
		
		System.out.println("Make your choice(screen38cm or screen43cm): ");
		String choice = screen.next();
		
		if(choice.equals("screen38")) {
			sum = sum +screen38cm;
		
			System.out.println("enter your choice (printer, Antivirus or both)");
			String choice2 = screen.next();
			if (choice2.equals("both")) {
				sum += 190.99;
			}
			else if(choice2.equals("printer")) {
				sum += printer;
				}
			else if(choice2.equals("antivirus")) {
				sum += software;
			}
		}
		if(choice.equals ("screen43")) {
			sum += screen43cm;
			System.out.println("enter your choice (printer, Antivirus or both)");
			String choice2 = screen.next();
			if (choice2.equals("both")) {
				
				sum += 190.99;
				}
			else if(choice2.equals("printer")) {
				
				sum += printer;
				}
			else if(choice2.equals("antivirus")) {
				sum += software;
				}
		}
		System.out.println(sum);		
					
			}

}