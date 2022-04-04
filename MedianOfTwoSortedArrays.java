import java.util.Arrays;

public class MedianOfTwoSortedArrays {
	/*
	 * https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/ 
	 */
	static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median = 0.0;
		int m = nums1.length; int n = nums2.length; 
		int nums[]  = new int[m+n]; 
		for(int i = 0; i < m; i++) {
			nums[i] = nums1[i];
		}
		for(int i = m, j = 0; i < m+n; i++, j++) {
			nums[i] = nums2[j];
		}
		Arrays.sort(nums);
		if(nums.length % 2 == 0) {
			median = (nums[(nums.length/2)-1] + nums[nums.length/2])/2.0;
		}else {
			median = nums[nums.length/2];
		}
		
		return median; 
	}
	public static void main(String[] args) {
		 int[] nums1 = {1, 2};
		 int[] nums2 = {3, 4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
