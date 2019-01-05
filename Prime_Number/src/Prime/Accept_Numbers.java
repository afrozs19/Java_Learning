package Prime;

import java.util.Scanner;

public class Accept_Numbers {
	
	static int primeflag = 0;
	
	public static void AcceptNumber(int accept_oprtyp, Scanner input) {
	
		switch (accept_oprtyp) {
		
			case 1:
		
				System.out.println("Enter one Number for PrimeCheck ");
				int accept_number = input.nextInt();
				
				if(accept_number == 1 || accept_number == 2 ) {
				NoPrimeCheck(accept_number);
				}
				else {
					PrimeCheck(accept_number);
				}
				break;
				
			case 2:
			
				System.out.println("Enter Start point for the Prime Check range");
				int start_point = input.nextInt();
				
				System.out.println("Enter End point for the Prime Check range");
				int end_point = input.nextInt();
				
				for (int i = start_point; i <= end_point; i++) {
									
					if(i == 1 || i == 2 ) {
						NoPrimeCheck(i);
					}
					else {
						PrimeCheck(i);
					}
				}
				
				break;
				
			default:
				
				System.out.println("You've selected invalid operation");
		}
	
	
	}
	
	private static void NoPrimeCheck(int accept_number) {
		
		if(accept_number == 1) {
			
			System.out.println(accept_number +" is neither a prime nor a composite number");
			
		}
		else {
			//Condition to check if the accepted number is 2
			if(accept_number == 2) {	
				
				System.out.println(accept_number +" is a prime number");
				
			}
		}				
	}
	
	private static void PrimeCheck(int accept_number) {
		
		for(int i=2; i < (accept_number/2); i++) {
			
			if(accept_number % i == 0) {
				primeflag = 1;
				break;
				
			}			
		}
		
		if(primeflag == 1) {
		
			System.out.println(accept_number +" is not a prime number");
			primeflag = 0;
			
		}
		else {
			
			System.out.println(accept_number +" is a primenumber");
			
		}		
	}
}
