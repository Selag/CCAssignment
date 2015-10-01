package SortingAndSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution04 {
	public static class Listy{
		public int[]a;
		public Listy(int[]a){
			Arrays.sort(a);
			this.a=a;
		}
		public int elementAt(int index){
			return(a[index]);
		}
	}
	public static int search(Listy list, int value){
		int index=1;
		while(list.elementAt(index)!=-1 && list.elementAt(index)<value){
			index=index*2;
		}
		return binarySearch(list, value, index/2, index);
	}
	public static int binarySearch(Listy list, int value, int low, int high){//dichotomy
		int mid;
	    while(low<=high){
	    	mid=(low+high)/2;
	    	int middle=list.elementAt(mid);
	    	if(value<middle || middle==-1){
	    		high=mid-1;
	    	}else if(value>middle){
	    		low=mid+1;
	    	}else{
	    		return mid;
	    	}
	    }
	    return -1;
	}
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6,7,8,9};
		Listy list=new Listy(a);
		System.out.println(search(list, 1));
	}
}
