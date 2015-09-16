package ArraysAndStrings;

import java.util.Arrays;

public class Solution07 {
    /* Follow the patterns of the index */
	public static void rotate(int[][] matrix) {
        if(matrix == null || matrix.length==0 || matrix[0].length==0)
            return;
        int layerNum = matrix.length/2;
        for(int layer=0;layer<layerNum;layer++)
        {
            for(int i=layer;i<matrix.length-layer-1;i++)
            {
                int temp = matrix[layer][i];
                matrix[layer][i] = matrix[matrix.length-1-i][layer];
                matrix[matrix.length-1-i][layer] = matrix[matrix.length-1-layer][matrix.length-1-i];
                matrix[matrix.length-1-layer][matrix.length-1-i] = matrix[i][matrix.length-1-layer];
                matrix[i][matrix.length-1-layer] = temp;
            }
        }
    }
	
	public static void main(String[] args) {
	    int[][] arr = new int[][]{
	        {1, 2, 3, 4, 5},
	        {6, 7, 8, 9, 10},
	        {11, 12, 13, 14, 15},
	        {16, 17, 18, 19, 20},
	        {21, 22, 23, 24, 25}
	    };
	    rotate(arr);
	    for (int[] a : arr)
	    	System.out.println(Arrays.toString(a));
	}
}
