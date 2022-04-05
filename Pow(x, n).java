/*
 * https://leetcode.com/problems/powx-n/
 */
/*
 * I Used Recursion because my solution was flagged as exceeding time limit
 */
public class PowXN { 
	
	static public double myPow(double x, int n) {
		
		if(n == 0){
            return 1; 
        }else if(n == 1){
            return x; 
        }else if(n % 2 == 0){
            return myPow(x*x, n/2);
        }else if((n % 2) == 1){
            return x * myPow(x, n-1); 
        }else {
        	return 1/myPow(x, -n); 
        }
        
    }
    
	public static void main(String[] args) {
		System.out.println(myPow(2.1, 3));
		System.out.println(myPow(2, 10));
		System.out.println(myPow(2, 0));
		System.out.println(myPow(2, -2));
		
		
	}
}
