/*
 * https://leetcode.com/problems/implement-strstr/ 
 */
public class ImplementStrStr {
	
	static public int strStr(String haystack, String needle) {
  
		int j = needle.length(); int i; 
    
		if (needle.length() > haystack.length()) {return -1;}
		if (needle.length()==0) {return 0;}
		for(i = 0; i < j; i++) {
			if(j > haystack.length()) {
				return -1;
        }
			if(haystack.substring(i, j).equals(needle)) {
				break;
			 }
			j++;
		}
		return i;
 }
	
	public static void main(String[] args) {
		String H = "hello"; String N = "ll";  
		String H1 = "aaaaa"; String N1 = "bba";
		String H2 = "abc"; String N2 = "c";
		System.out.println(strStr(H, N));
		System.out.println(strStr(H1, N1));
		System.out.println(strStr(H2, N2));
	}
}
