import java.util.List;
import java.util.ArrayList;
public class Palindrome { 
  	 	 static public boolean isPalindrome(int x) {
		 List<Long> ans = new ArrayList<Long>();
		 long r;  long q = 1; int i = 1; long y = (long)x; long z = (long)x;  
		 double total = 0;
		 if(x < 0) {
			 return false; 
		 }
		 do {
		 q = z / 10; 
		 r = z % 10;  
		 z = q;
		 ans.add(r);  
		 }while(q != 0);  
		 int len = ans.size(); 
		 for(Long j : ans) {
			 total += j * Math.pow(10, len-i);
			 i++;
		 }
		 
		 Long result = (long)total; 
		 if(result == y) {
			 return true;
		 }
		 return false; 
	 }

	 public static void main(String[] args) { 
		 System.out.println(isPalindrome(10)); 
		 System.out.println(isPalindrome(2147483647));
		 System.out.println(isPalindrome(121));
		 System.out.println(isPalindrome(-121));
	 }
}
