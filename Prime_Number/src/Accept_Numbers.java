
import java.util.Scanner;

public class Accept_Numbers {
	
	public void AcceptNumber() {
	
		
	
	
		switch (accept_oprtyp) {
		
			case 1:
		
				System.out.println("Enter a Value for PrimeCheck ");
				int accept_number = input.nextInt();
	
			case 2:
			
				System.out.println("Enter Start point for the range");
				int start_point = input.nextInt();
				
				System.out.println("Enter End point for the range");
				int end_point = input.nextInt();			
		
		}
	
	
	}

}





int primeacc = 15;
int primeflag = 0;

//Applying condition to check if accepted number is 1

if(primeacc == 1) {
	
	System.out.println(primeacc +" is neither a prime nor a composite number");
	
}
else {
	//Condition to check if the accepted number is 2
	if(primeacc == 2) {	
		
		System.out.println(primeacc +" is a prime number");
		
	}
	else {
		
		//In case of any other condition apply logic for prime check
		
		for(int i=2; i < (primeacc/2); i++) {
			
			if(primeacc % i == 0) {
				primeflag = 1;
				break;
				
			}			
		}
		
		if(primeflag == 1) {
		
			System.out.println(primeacc +" is not a prime number");
			primeflag = 0;
			
		}
		else {
			
			System.out.println(primeacc +" is a primenumber");
			
		}

	}
		
}
		
}

}
