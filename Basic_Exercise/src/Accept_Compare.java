import java.util.Scanner;

public class Accept_Compare {

	public static void main(String[] args) {
		
		int[] numberlist = new int[4];
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			
			System.out.println("Enter the number at position " +(i+1));
			numberlist[i] = scan.nextInt();
			
		}
		
		for(int j=0; j<4; j++) {
				
				if(numberlist[0] == numberlist[j]) {
					
					count = count + 1;
					
					if(count == 4) {
						
						System.out.println("The numbers are equal");
						
					}
					
				}				
				else {
					
					System.out.println("The numbers don't match");
					break;
					
				}				
				
			}
			
		}
		
	}
