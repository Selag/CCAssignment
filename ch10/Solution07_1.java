package SortingAndSearch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Solution07_1 {
	long IntegerNumber=2^32;
	byte[] bitField =new byte[(int) (IntegerNumber/8)];//Java has the minimum of byte but not bit. 1 byte equals 8 bits.
	
	public int findMissedNumber(String filename) throws FileNotFoundException{
		int UncontainedNumber=0;
		Scanner in=new Scanner(new FileReader(filename));
		while(in.hasNextInt()){
			int n=in.nextInt();
			bitField[n/8]=bitField[n/8]|=1<<(n%8); //Put 1 to the left for 8 bits and do the OR operation to set some bit to be 1.
		}
		for (int i=0;i<bitField.length;i++){
			for(int j=0;j<8;j++){
				if((bitField[i] & (1<<j))==0){//Some bit vector is still 0.	
					UncontainedNumber=i*8+j;
					System.out.println(i*8+j);					
				}
			}
		}
		in.close();
		return UncontainedNumber;
	}
}
