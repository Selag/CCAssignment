package SortingAndSearch;

import java.util.Arrays;

public class Solution01 {
	public static void merge(int A[], int m, int B[], int n) {
		/* Start from the end of the list, compare the elements in A and B, insert into A accordingly */
        if(A==null || B==null)  
            return;
        
        int resIdx = m+n-1;
        int a = m-1;
        int b = n-1;
        while(a>=0&&b>=0){
            if(A[a]>B[b])
                A[resIdx--] = A[a--];
            else
                A[resIdx--] = B[b--];
        }
        while(b>=0)
            A[resIdx--] = B[b--];
    }
	
	public static void main(String[] args) {
	    int[] a = new int[]{1, 4, 7, 8, 9, 15, -1, -1, -1, -1, -1, -1};
	    int[] b = new int[]{2, 3, 5, 11, 12, 16};
	    int A = 6;
	    int B = 6;
	    merge(a, A, b, B);
	    System.out.println(Arrays.toString(a));
	 }
}
