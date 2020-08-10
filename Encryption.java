package co.standup;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your four digit number: ");
		int digit = input.nextInt();
		
		// separating each digit of the input
		
		if(digit >= 1000 && digit <10000) {
			int firstNum = digit/1000;
			int firstRem = digit % 1000;
			
			int secNum = firstRem/100;
			int secRem = firstRem % 100;
			
			int thirdNum = secRem/10;
			int thirdRem = secRem %  10;
			
			int fourthNum = thirdRem;
			
			//adding 7 to each digit and finding the modulo 
			int newFirst = (firstNum + 7) % 10;
			int newSec = (secNum +7) % 10;
			int newThird = (thirdNum +7) % 10;
			int newFourth = (fourthNum +7) % 10;
			System.out.println("value b4 swap 1: " +newFirst);
			System.out.println("value b4 swap 2: " +newSec);
			System.out.println("value b4 swap 3: " +newThird);
			System.out.println("value b4 swap 1: " +newFourth);
			System.out.println("===============================================");
			//swapping each num by 2 places 
			int tempNum = newFirst;
			newFirst = newThird;
			newThird = tempNum;
			
			tempNum = newSec;
			newSec = newFourth;
			newFourth = tempNum;
			
			System.out.printf(""+newFirst+""+newSec+""+newThird+""+newFourth);
			
		}else {
			System.out.println("you are mad");
		}

	}

}
