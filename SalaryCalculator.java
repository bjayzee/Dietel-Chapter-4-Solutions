
package co.standup;

import java.util.Scanner;

public class SalaryCalculator {
	
	

	public static void main(String[] args) {
	 Scanner raz = new Scanner(System.in);
	 System.out.println("Please Enter HourlyRate:  ");
	 double hourlyRate = raz.nextDouble();
	 double grossPay = 0;
	 double grossPayOver = 0;
	 
	 System.out.println("Please Enter HoursWorked: ");
	 double hoursWorked = raz.nextDouble();
	 
	 if(hoursWorked <= 40) {
	 grossPay = hourlyRate * hoursWorked;
	 }
	 else if(hoursWorked > 40) {
		 grossPay = hourlyRate * 40;
	 }
	 
	 
	 if(hoursWorked > 40) { 
	 double rateOverWorked = 1.5 * hourlyRate;
	 
	 double overTime = hoursWorked - 40;
	 grossPayOver = rateOverWorked * overTime;
	 }

	 double fullPay =  grossPay + grossPayOver;
	 
	 System.out.println("Your Full Pay for the week is: " + fullPay);
	 
	 
	   
	 
	 

	}

}
