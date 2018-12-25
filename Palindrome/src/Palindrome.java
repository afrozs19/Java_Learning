import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int number, temp_num, remainder, result = 0;
		
		System.out.println("Enter the number for Palindrome check");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		
		temp_num = number;
		
		while (temp_num != 0) {
			
			remainder = temp_num % 10;
			result = (result * 10) + remainder;
			temp_num = temp_num / 10;			
		
		}
		
		if(number == result) {
		
		System.out.println(number +" is a Palindrome number");
		
		}
		
		else {
			
			System.out.println(number +" is not a palindrome number because result check is " +result );
		}

	}

}
