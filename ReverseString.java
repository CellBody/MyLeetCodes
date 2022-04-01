import java.util.Arrays;

/*
 * https://leetcode.com/problems/reverse-string/ 
 */
/*
 * Write a function that reverses a string. 
 * The input string is given as an array of characters s. 
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * Input: s = ["h","e","l","l","o"]
 * Output s = ["o", "l", "l", "e", "h"]
 */
/*
 * Here, I used a two pointer approach to achieve an array in-place 
 */
public class ReverseString { 
	
	static public void reverseString(char[] s) {
		int k = s.length - 1; 
		for(int i = 0, j = k; j > i; i++, j--) {
			char t = s[j]; 
			s[j] = s[i];
			s[i] = t; 
		}
        System.out.println(Arrays.toString(s)); 
    }
	public static void main(String[] args) { 
		char[] A = {'h','e','l','l','o'}; 
		char[] B = {'H','a','n','n','a','h'};
		reverseString(A);
		reverseString(B);
	}
}
	
