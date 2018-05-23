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
public class MatrixTest {


	
	void Test(){
		
		Matrix matrix = new Matrix();
	
		int[] array = { 1,2,3,4,5,6,7,8,9 };					// test array
		
		int[][] myMatrix = matrix.toMatrix(array , 3,3);					// using toMatrix function
		System.out.print("| ");
		for(int i = 0; i < 3; ++i){								// formatted printout to check for correct matrix
			
			for(int j= 0 ; j< 3; ++j){
				System.out.print( myMatrix[i][j] + " |");
			}
			if(i != 2)
				System.out.print("\n|");
		}
		
		System.out.println("\n\n-------------------------\n");	// used as a printout break line
		
		
		int[] tempArray = matrix.toArray(myMatrix);					// passing generated matrix into toArray function
		
		for(int i = 0 ; i < tempArray.length ; ++i){
			System.out.print(tempArray[i] + ", ");
		}
		
		
		
	}
	
	public static void main(String[] args){
		
		MatrixTest matrixtest = new MatrixTest();						// creating matrix object
		
		matrixtest.Test();								// using MatrixTest to test functions
	}
}
