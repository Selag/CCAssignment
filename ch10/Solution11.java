package SortingAndSearch;

public class Solution11 {
	public static void sortPeakValley(int[] a){
		for(int i=1; i<a.length-1;i+=2){
			int peak=maxValue(a, i-1, i, i+1);
			if(i!=peak){
				swap(a, i, peak);
			}
		}
		for(int j=0; j<a.length;j++){
			System.out.print(a[j]+" ");
		}
	}
	public static int maxValue(int[]a, int b, int c, int d){ //Get the peak's location
		if(b<0 || b>=a.length){
			return -1;
		}
		if(c<0 || c>=a.length){
			return -1;
		}
		if(d<0 || d>=a.length){
			return -1;
		}
		int max=Math.max(a[b], Math.max(a[c], a[d]));
		if(a[b]==max){
			return b;
		}else if(a[c]==max){
			return c;
		}else{
			return d;
		}
	}
	public static void swap(int[]a, int left, int right){ //Put the peak into the right location
		int temp=a[left];
		a[left]=a[right];
		a[right]=temp;
	}
	public static void main(String args[]){
		int a[]={5,3,1,2,3};
		sortPeakValley(a);
	}
}
