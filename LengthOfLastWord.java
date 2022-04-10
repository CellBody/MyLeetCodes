import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
/*
 * https://leetcode.com/problems/length-of-last-word/
 */
 
public class LengthOfLastWord {  
	
	static public int lengthOfLastWord(String s) {
		List<String> ans = new ArrayList<>();
		String[] arr = s.split("\s+"); 
		for(String b : arr) {
			if(b == "") {
				continue;
			}
			ans.add(b);
		}
		return ans.get(ans.size()-1).length();
		
			
    }
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("        fly   me to     the   moon"));
		System.out.println(lengthOfLastWord("Hello World"));
		System.out.println(lengthOfLastWord("luffy is still joyboy"));
	}

}
