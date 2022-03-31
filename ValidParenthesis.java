/*
 * https://leetcode.com/problems/valid-parentheses/ 
 */
import java.util.Stack; 

public class ValidParenthesis { 
	/*
	 * Here, I used a stack to store the characters '(', '{' & '[' By looping through 
	 * the string invoking the method charAt(). 
	 * The stack data structure enables me to peek/see 
	 * what item is in the top of the stack. 
   * if the item at the top of the stack is an opening bracket && the charAt(i) of the string is an opening bracket of the same type e.g. '(' & ')'
   * then call the pop() method on the stack. If the stack becomes empty after iterating through the string, then the string contains valid parenthesis!
	 */
	static public boolean isValid(String s) { 
		
		Stack<Character> myBrackets = new Stack<Character>(); 		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
				myBrackets.push(s.charAt(i));
			}else if(s.charAt(i)==')' && !myBrackets.isEmpty() && myBrackets.peek()=='(') {
				myBrackets.pop();
			}else if(s.charAt(i)==']' && !myBrackets.isEmpty() && myBrackets.peek()=='[') {
				myBrackets.pop(); 
			}else if(s.charAt(i)=='}' && !myBrackets.isEmpty() && myBrackets.peek()=='{') {
				myBrackets.pop();
			}else {
				return false; 
			}
		}
		return myBrackets.isEmpty(); 
   }
	public static void main(String[] args) {
		String A = "()[]{}";
		String B = "()"; 
		String C = "(){";
		String D = "({[(}]})";
		String E = "({[()]})"; 
		String F = "(([]){})";
		String G = "(([]){}[])";
		System.out.println(isValid(A));
		System.out.println(isValid(B));
		System.out.println(isValid(C));
		System.out.println(isValid(D));
		System.out.println(isValid(E));
		System.out.println(isValid(F));
		System.out.println(isValid(G));
	}
}
