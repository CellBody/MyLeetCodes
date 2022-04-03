/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/ 
 */

public class RemoveDuplicatesFromSortedArray { 
	static public int removeDuplicates(int[] nums) { 
		int result = 0; int dup = 777; 
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] == dup) {continue;}
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {  // replaces the duplicates with the constant 777 which is out of the range of constraints
					nums[j] = dup; 
				}
			}
		}
		for(int a : nums) {if(a != dup) {result += 1;}}  // to compute the number of distinct elements of the array
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i]==dup) {
				for(int j = i+1; j < nums.length; j++) {
					if(nums[j] != nums[i]) {
						int t = nums[j];
						nums[j] = nums[i]; 
						nums[i] = t;
						break;
					}
				}
			}
		}
        return result; 
    }
	public static void main(String[] args) {
		int[] A = {0,0,0,1,1,1,2,2,3,3,4}; int[] B = {1, 1, 2};
		System.out.println(removeDuplicates(A));
		System.out.println(Arrays.toString(A));
		System.out.println(removeDuplicates(B));
		System.out.println(Arrays.toString(B));
		
	}
}
