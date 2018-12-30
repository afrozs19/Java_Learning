import java.util.Scanner;

public class pwd_validation {
	
	public static final int password_length = 8;
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Password should be of 8 characters \n" +
							"Password should contain only characters & letters \n" +
							"Password should contain atleast 2 numbers \n"
				);
		
		String s = input.nextLine();
		
		if(isValid_password(s)) {
			
			System.out.println("\n System Password is Valid " +s);
			
		}
		else {
			
			System.out.println("\n System Password is not Valid " +s);
			
		}
	}
	
	public static boolean isValid_password(String password) {
		
		if(password.length() < password_length) return false;
			
			int char_count = 0;
			int num_count = 0;
			
			for(int i = 0; i < password.length();i++) {
				
				char ch = password.charAt(i);
				
				if(is_numeric(ch)) {
					
					num_count++;
					
				}
				else if(is_letter(ch)) {
					
					char_count++;
					
				}
				else {
					
					return false;
					
				}	
			}
		
		
		return(char_count >= 2 && num_count >= 2);
		
	}
	
	public static boolean is_letter(char ch) {
		
		ch = Character.toUpperCase(ch);
		return(ch >= 'A' && ch <= 'Z');
	}
	
	public static boolean is_numeric(char ch) {
		
		return(ch >= '0' && ch <= '9');
	}

}
