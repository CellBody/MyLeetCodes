/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/ 
 */
public class RemoveDuplicatesFromSortedArray { 
	static public int removeDuplicates(int[] nums) { 
		int result = 0; int dup = 777; 
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] == dup) {continue;}
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					nums[j] = dup; 
				}
			}
		}
		for(int a : nums) {if(a != dup) {result += 1;}}
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
		int[] A = {0,0,0,1,1,1,2,2,3,3,4}; 
    int[] B = {1, 1, 2};
		System.out.println(removeDuplicates(A));  // returns 5, which is the number distinct elements in this integer array
		System.out.println(removeDuplicates(B));  // returns 2, which is the number of distinct elements in this integer array
		
	}
}
