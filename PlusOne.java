/*
 * https://leetcode.com/problems/plus-one/
 */
import java.util.Arrays;

public class PlusOne {
	
	static public int[] plusOne(int[] digits) {
		int k = digits.length - 1; 	digits[k] = digits[k] + 1; 
		for(int j = k; j >= 0; j--) {
				if(digits[j] == 10) {
					digits[j] = 0; 
					if(j==0) {
						break;
					}
					digits[j-1] = digits[j-1]+1;
				}			
			}
		if(digits[0] == 0) {
			int[] R = new int[digits.length+1]; 
			for(int i = 0; i < digits.length; i++) {
				if(i == 0) {
					R[i] = 1;
				}else{
					R[i] = 0;
				}
			}
			return R;
		}			
		return digits; 		
	}
	public static void main(String[] args) {
		int[] A = {2, 3, 4, 9, 9, 9, 9, 9, 9, 9};
		int[] B = {9};
		int[] C = {4, 3, 2, 1};
		int[] D = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		System.out.println(Arrays.toString(plusOne(A)));
		System.out.println(Arrays.toString(plusOne(B)));
		System.out.println(Arrays.toString(plusOne(C)));
		System.out.println(Arrays.toString(plusOne(D)));
	}

}
