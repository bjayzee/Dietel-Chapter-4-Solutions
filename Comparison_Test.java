package co.standup;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Comparison_Test {
Scanner bj = new Scanner(System.in);

	@BeforeEach
	void setUp() throws Exception {
	}



	public void Number_test() {
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



