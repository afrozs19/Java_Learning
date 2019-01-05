import java.util.Scanner;

public class replacing_rows_columns {

	public static void main(String[] args) {
		
		int[][] Matrix = new int[2][3]; 
		int[][] NewMatrix = new int[3][2];
		
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<3; j++) {
				
				System.out.println("Enter number at " + i + "," + j + " position in matrix");
				
				Matrix[i][j] = in.nextInt();
				NewMatrix[j][i] = Matrix[i][j];
				
			}
			
		}
		
		System.out.println("Below is the original Matrix");
		before_transform(Matrix);
		
		System.out.println("After matrix Transformation");		
		after_transform(NewMatrix);
		
	}
	
	private static void before_transform(int[][] Matrix) {
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<3; j++) {
				
				System.out.print(Matrix[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		
	}
	
	
	private static void after_transform(int[][] NewMatrix) {
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<2; j++) {
				
				System.out.print(NewMatrix[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}


}
