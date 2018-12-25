import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int number, temp, result = 0, remainder;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number to validate with Armstrong rules");
		
		number = scan.nextInt();
		
		temp = number;
		
		while(number !=0) {
		
		remainder = number % 10;
		result = result + (remainder * remainder * remainder);
		number = (number/10);
		
		}
		
		if(result == temp) {
			
			System.out.println(temp +" is an Armstrong number");
		}
		
		else {
			
			System.out.println(temp +" is not an Armstrong number");
		}
	}

}
