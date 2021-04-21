import java.util.Scanner;
public class RotateImage {
        
    
    
    public static void rotate(int [][] matrix){
    	
    	
    	//transposing matrix
    	for(int i = 0; i < matrix.length; i++){
    		for(int j = i; j < matrix[0].length; j++){
    			//swapping
    			int temp = matrix[i][j];
    			matrix[i][j] = matrix[j][i];
    			matrix[j][i] = temp;
    		}
    	}
    	
    	//Flipping the matrix along y-axis
    	for(int i = 0; i < matrix.length; i++){
    		for(int j= 0; j < matrix[0].length/2; j++){
    			//swapping
    			int temp = matrix[i][j];
    			matrix[i][j] = matrix[i][matrix[0].length-j-1];
    			matrix[i][matrix[0].length-j-1] = temp;
    		}
    	}
    	
    }
    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter row length: ");
    	int m = s.nextInt();
    	System.out.print("Enter column length: ");
    	int n = s.nextInt();
    	int matrix[][] = new int[m][n];
    	System.out.println ("Enter elements of matrix: ");
    	for(int i = 0; i < m; i++){
    		for(int j = 0; j < n; j++){
    			matrix[i][j] = s.nextInt();
    		}
    	}
    	
    	rotate(matrix);
    	System.out.println ("Rotated array: ");
    	for(int i = 0; i < m; i++){
    		for(int j = 0; j < n; j++){
    			System.out.print(matrix[i][j]+" ");
    		}
    		System.out.println ();
    	}
    	
        
    }
}
