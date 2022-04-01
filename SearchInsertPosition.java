/*
 * Input: nums = [1, 2, 3, 5, 6, 7, 8], target = 5
 * Output: 4
 * This is a binary search algorithm runtime O(logn)
 */
public class SearchInsertPosition { 
	static public int searchInsert(int[] nums, int target) {
        int low = 0; 
        int high = nums.length-1; 
        while(low <= high) {
        	int mid = (low + high)/2; 
        	int val = nums[mid]; 
        	if (val == target) {
        		return mid; 
        	}
        	if(val > target) {
        		high = mid-1;
        	}else {
        		low = mid + 1;
        	}
        }
        for(int i = 0; i < nums.length; i++) {
        	if(target < nums[i]) {
        		return i; 
        	}
        }                   
        return nums.length; 
    }
	
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 5, 6, 7, 8};
		int t1= 5; int t2 = 7; int t3 = 9;
		System.out.println(searchInsert(A, t1));
		System.out.println(searchInsert(A, t2));
		System.out.println(searchInsert(A, t3));
	}

}
