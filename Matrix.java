/**
 * Name: Schenck, Eric
 * Homework: 1
 * Due: May 22, 2018
 * Course CS40801-sp18
 * 
 * Description: 
 * 			Implement a java matrix class that will provide two operations, and a test
 * 			1.) array to matrix size NxM where the array and N and M are parameters to a function
 * 			2.) matrix size NxM to an array were the matrix is given as parameter to a function
 * 			3.) Implement a MatrixTest to check out the Matrix Class 
 * 
 * 
 */

public class Matrix {
	
	// java will provide a default constructor
	
	/**
	 * toMatrix function to convert an array into a matrix size MxN column wise
	 * @param array given array can be any size
	 * @param m	column 
	 * @param n row 
	 * @return null if incorrect dimensions, or filled matrix if correct dimensions
	 */
	int[][] toMatrix(int[] array, int m, int n){
		
		int arrayIterator;
		int[][] matrix = new int[m][n];
		
		if(array.length == ( m * n )){				// checking dimensions to make sure will fit
			
			arrayIterator = 0;
			for(int j = 0; j < n; ++j){
				for(int i = 0; i < m; ++i){
					
					matrix[i][j] = array[arrayIterator++];		//loading matrix column wise
					
				}
			}
		}else{										// incorrect dimensions to fill entire array properly 
			System.out.println("Sorry those Dimensions just don't work with that array size...");
			matrix = null;							// no values will be stored in MxN matrix
		}
		
		return matrix;	
	}
	
	/**
	 * converts matrix coloumn wise into an array. 
	 * @param matrix
	 * @return array
	 */
	int[] toArray(int[][] matrix){
		
		int arrayIterator;
		int m = matrix.length;						// getting column length 
		int n = matrix[0].length;					// getting row length
	
		int arrayLength = m * n;					// getting total number of elements needed in array
		
		int[] array = new int[arrayLength];			// creating array 
		arrayIterator = 0;
		for(int j = 0; j < n ; ++j){
			for(int i = 0; i < m; ++i){
				
				array[arrayIterator++] = matrix[i][j]; 	//filling array 
			}
		}
		
		
		return array;
		
	}
	

}
