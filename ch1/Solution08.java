package ArraysAndStrings;

import java.util.Arrays;

public class Solution08 {
	public static void setZeroes(int[][] matrix) {
        int colTag = 1;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0)
                colTag = 0;
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j]==0)
                    matrix[i][0] = matrix[0][j] = 0;
            }
        }
        
        for(int i = matrix.length-1; i >= 0; i--){
            for(int j = matrix[0].length-1; j >= 1; j--){
                if(matrix[i][0]==0||matrix[0][j]==0)
                    matrix[i][j]=0;
            }
            if(colTag==0)
                matrix[i][0]=0;
        }
    }
	
	public static void main(String[] args) {
	    int[][] matrix = new int[][]{
	      {0, 1, 1, 1, 0},
	      {1, 0, 1, 0, 1},
	      {1, 1, 1, 1, 1},
	      {1, 0, 1, 1, 1},
	      {1, 1, 1, 1, 1}
	    };
	    System.out.println("Input: ");
	    for (int i = 0; i < matrix.length; i++)	    	
	    	System.out.println(Arrays.toString(matrix[i]));
	    setZeroes(matrix);
	    System.out.println();
	    System.out.println("Output: ");
	    for (int i = 0; i < matrix.length; i++)
	    	System.out.println(Arrays.toString(matrix[i]));
	}
}
