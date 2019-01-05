import java.util.Scanner;

public class Check_0_1 {

	public static void main(String[] args) {
		
		double number1, number2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		number1 = in.nextDouble();
		
		System.out.println("Enter the Second number");
		number2 = in.nextDouble();
		
		if(number1 > 0.00 && number1 < 1.00 && number2 > 0.00 && number2 < 1.00) {
			
			System.out.println(number1 + " & " + number2 + " are greater than 0 & less than 1");
			
		}
		
		else
			System.out.println("The numbers are invalid");

	}

}
