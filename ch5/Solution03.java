package BitManipulation;

public class Solution03 {
	public static int longestSequence(int n){
		if (n==-1){
			return 32;
		}
		int searchFor=0;
		int [] sequences={0,0,0};
		int maxSequence=1;
		for(int i=0;i<32;i++){ 
			if((n&1)!=searchFor){
				if(searchFor==1){//
					maxSequence=Math.max(maxSequence, getMaxSequence(sequences));
				}
				searchFor=n&1;
				shift(sequences);
			}
			sequences[0]++;
			n=n>>>1;
		}
		if (searchFor==0){
			shift(sequences);		
		}
		return Math.max(maxSequence, getMaxSequence(sequences));
	}

	public static int getMaxSequence(int[] sequences){
		if(sequences[1]==1){
			return sequences[0]+sequences[2]+1;
		}else if (sequences[1]==0){
			return Math.max(sequences[0],sequences[2]);
		}else{
			return Math.max(sequences[0],sequences[2])+1;
		}
	}

	public static void shift(int[]sequences){
		sequences[2]=sequences[1];
		sequences[1]=sequences[0];
		sequences[0]=0;
	}

	public static void main(String args[]){
		int n1=11;
		System.out.println("n:"+Integer.toBinaryString(n1));
		System.out.println(longestSequence(n1));
		}
}
