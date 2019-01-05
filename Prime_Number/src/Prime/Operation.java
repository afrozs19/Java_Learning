package Prime;
import java.util.Scanner;
import Prime.Accept_Numbers;;

public class Operation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the inder for type of operation you want to proceed with from below: \n"
							+ "1. Single Number check \n" 
							+ "2. Check for the range \n"			
						);
		int accept_oprtyp = input.nextInt();
		
		Accept_Numbers.AcceptNumber(accept_oprtyp, input);
			
	}

}
	