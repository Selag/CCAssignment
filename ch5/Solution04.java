package BitManipulation;

public class Solution04 {
	/* Get Next:
	 * 2^c0 = 1 << c0
	 * 2^(c1-1) = 1 << (c0 - 1)
	 * next = n + 2^c0 + 2^(c1-1) - 1;
	 *
	 * Get Previous:
	 * 2^c1 = 1 << c1
	 * 2^(c0 - 1) = 1 << (c0 - 1)
	 */
	
	public static int[] count(int n){
		int []count={0,0};
		int c=n;
		while(((c&1)==0)&&(c!=0)){ 
			count[0]++;
			c=c>>1;
		}
		while((c&1)==1){ 
			count[1]++;
			c=c>>1;
		}
		return count; 
	}
	public static int getNextLarge(int n, int[] count){ 
		int res =n;
		if(count[0]+count[1]==31 || count[0]+count[1]==0){
			return -1;
		}
		res=res + (1 << count[0]) + (1 << (count[1]-1)) - 1;
		return res;
	}
	public static int getNextSmall(int n, int[] count){
		int res =n;
	    res =res - (1 << count[1]) - (1 << (count[0]-1)) + 1;
		return res;
	}
	public static void main (String args[]){
		int n=13948;
		System.out.println("Input:"+Integer.toBinaryString(n));
		int [] count=count(n);
		int large=getNextLarge(n, count);
		System.out.println("Larger:"+Integer.toBinaryString(large));
		int small=getNextSmall(n, count);
		System.out.println("Smaller:"+Integer.toBinaryString(small));
	}
}
