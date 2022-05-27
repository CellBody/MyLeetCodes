import java.util.ArrayList;
import java.util.HashSet;

public class ContainsDuplicate {
	/*
	 * https://leetcode.com/problems/contains-duplicate/submissions/ 
   * Easy LeetCode Question
	 */
	 public static boolean containsDuplicate(int[] nums) {
	     HashSet<Integer> result = new HashSet<>();   // Using a HashSet Object. HashSet does not contain duplicates
	     for(int i = 0; i < nums.length; i++) {
	    	 if(result.contains(nums[i])) {
	    		 return true;
	    	 }
	    	 result.add(nums[i]); 	    	 
	     }		 		 
		 return false;
	    }
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 1};
		int[] b = {1, 2, 3, 4}; 
		int[] c = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}; 
		System.out.println(containsDuplicate(a)); // returns true
		System.out.println(containsDuplicate(b));	// returns false
		System.out.println(containsDuplicate(c)); // returns true 
	}

}
