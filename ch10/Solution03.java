package SortingAndSearch;

public class Solution03 {
	public static int search(int[] nums, int target) {
        //normal case
        //case that has only 0,1,2 elements
        int left = 0, right = nums.length-1;
        while(left<=right){
            int pivot = (left+right)/2;
            if(nums[pivot]==target)
                return pivot;
            //It has to be nums[left]<= rather than < considering there are only two elements in the arr
            if(nums[left]<=nums[pivot]){
                if(target>=nums[left]&&target<nums[pivot]){
                    right=pivot-1;
                }else{
                    left=pivot+1;
                }
            }else{
                if(target>nums[pivot]&&target<=nums[right]){
                    left=pivot+1;
                }else{
                    right=pivot-1;
                }
            }
        }
        return -1;
    }
	
	public static void main(String[] args){
		int[] test= {15,16,19,20,25,1,3,4,5,7,10,14};
		int target = 5;
		System.out.println(search(test, target));
	}
}
