/*
 * https://leetcode.com/problems/implement-strstr/
 */
public class ImplementStrStr {
	
	static public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        int result = -1; 
        int i = 0; 
        for(int j = 0; j < haystack.length(); j++){
             if(needle.charAt(i) == haystack.charAt(j)){
                    return j; 
                }         
            }
        
        return result; 
    }
	
	public static void main(String[] args) {
		String H = "hello"; 
		String N = "ll"; 
		System.out.println(strStr(H, N));
		String H1 = "aaaaa";
		String N1 = "bba"; 
		System.out.println(strStr(H1, N1));
		String H2 = "Executive"; 
		String N2 = ""; 
		System.out.println(strStr(H2, N2));
	}
}
