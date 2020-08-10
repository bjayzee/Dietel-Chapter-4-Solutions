package co.standup;

import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter num");
          int num = input.nextInt();
          int modu = 0;
          int temp = 0;
        while(num > 0) {
        	if(num >= 10000 || num <= 99999) {
        		modu = num % 10;
        		temp = temp * 10 + modu;
        		num = num / 10;
           }
        }
	         System.out.println( temp);
	   

                 if(temp == num) {
	        System.out.println("print num is palindrom");
     } 
	   
             
        	      System.out.println("print num is palindrom");
     }   
}
	


