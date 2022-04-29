import java.util.ArrayList; 
import java.util.List;
/*
 * https://leetcode.com/problems/add-binary/
 */

public class AddBinary {
	// a = "1010", b = "1011" 
	  static public String addBinary(String a, String b) {
	
		  List<String> result = new ArrayList<>(); int k = 0;
		  if(a.length() != b.length()) {
			  k = b.length()-a.length(); 
			  if(k < 0) {
				  k = -1 * k;
			  }
		  }
		  String zeros = "";
		  for(int i = 0; i < k; i++) {
			  zeros += "0";
		  }
		  if(a.length() < b.length()) {
			  a = zeros + a; 
		  }else if(b.length() < a.length()){
			  b = zeros + b;
		  }
		  int j = a.length(); int c = 0; 
		  for(int i = j-1; i >= 0; i--) {
			 if(a.charAt(i)=='1' && b.charAt(i)=='1' && c == 0) {
				 result.add("0"); 
				 c = 1; 
			 }else if(((a.charAt(i)=='0' && b.charAt(i)=='1') || (a.charAt(i)=='1' && b.charAt(i)=='0')) && c == 0){
				 result.add("1");
			 }else if(((a.charAt(i)=='0' && b.charAt(i)=='1') || (a.charAt(i)=='1' && b.charAt(i)=='0')) && c == 1){
				 result.add("0");
				 c = 1;
			 }else if(a.charAt(i)=='0' && b.charAt(i)=='0' && c == 1){
				 result.add("1");
				 c = 0;
			 }else if(a.charAt(i)=='0' && b.charAt(i)=='0' && c == 0){
				 result.add("0");
			 }else if(a.charAt(i)=='1' && b.charAt(i)=='1' && c == 1){
				 result.add("1");
				 c = 1;
			 }	
		  }
		  StringBuilder SB = new StringBuilder();
		  for(int i = result.size()-1; i >= 0; i--){
			  SB.append(result.get(i));
		  }
		  if(c == 1) {
			  return "1"+SB.toString();
		  }
		  return SB.toString();
	    }
	  public static void main(String[] args) {
		 System.out.println(addBinary("1111", "1111"));
	  }
}
