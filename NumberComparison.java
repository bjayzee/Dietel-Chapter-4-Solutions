package co.standup;

import java.util.Scanner;

public class NumberComparison {

	public static void main(String[] args) {
		
		Scanner bj = new Scanner(System.in);
		
		System.out.println(" Enter firstNumber:");
		int firstNumber = bj.nextInt();
		
		System.out.println(" Enter secondNumber:");
		int secondNumber = bj.nextInt();
		
		if(firstNumber == secondNumber) {
			System.out.println("Numbers are equal");	
		}

		else 
			if(firstNumber != secondNumber) {
				 
					if(firstNumber > secondNumber) {
						System.out.println("First Number is bigger");		
					}
					else {
						System.out.println("Second Number is bigger");
					}
						
					System.out.println("So Numbers are not equal");
		}
	}

}


			

	
	
