import java.util.ArrayList;
import java.util.List;
/*
 * https://leetcode.com/problems/reverse-integer/submissions/ 
 */
public class ReverseInteger { 
	
	static public int reverse(int x) { 
		int result = 0; 
        int q = x; int r = 0; int y = 0;
        List<Integer> ans = new ArrayList<>();
        while(q != 0){
        	y = q / 10; 
        	r = q % 10; 
            q = y; 
            ans.add(r); 
        }
        System.out.println(ans);
        int j = ans.size() - 1; 
        for(int a : ans) {
        	result += (Math.pow(10, j)) * a;
        	j -= 1;
        }
        if (result <= Math.pow(-2, 31) || result >= Math.pow(2, 31)-1) {
			return 0;
		}
       return result; 
    }
	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
		System.out.println(reverse(1204));
		System.out.println(reverse(1534236469));
		
		
	}
	
}
