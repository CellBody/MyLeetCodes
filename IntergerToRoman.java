/*
 *https://leetcode.com/problems/integer-to-roman/submissions/ 
 */
public class IntegerToRoman { 
	
	static public String intToRoman(int num) {
        String result = ""; 
       
		if(num >= 1000) {
			int q = 1; 
			int M, C, T, R, U;
			while(q != 0) {
				q = num / 1000; 
				M = q; 
				R = num % 1000;  
				q = R; 
				C = q / 100; 
				R = q % 100; 
				q = R;  
				T = q / 10; 
				R = q % 10; 
				q = R; 
				U = q % 10;
				q = q / 10; 
				System.out.println(M + " " + C + " " + T + " " + U);
				if(M == 1) {
					result += "M"; 
				}else if(M == 2) {
					result += "MM";
				}else if(M == 3){
					result += "MMM"; 
				}
				if(C == 1) {
					result += "C";
				}else if(C == 2) {
					result += "CC";
				}else if(C == 3) {
					result += "CCC";
				}else if(C == 4){
					result += "CD";
				}else if(C == 5) {
					result += "D";
				}else if(C == 6) {
					result += "DC";
				}else if(C == 7) {
					result += "DCC";
				}else if(C == 8) {
					result += "DCCC";
				}else if (C == 9) {
					result += "CM";
				}
				
				if (T == 1) {
					result += "X";
				}else if(T == 2) {
					result += "XX";
				}else if (T == 3) {
					result += "XXX";
				}else if (T == 4) {
					result += "XL";
				}else if(T == 5) {
					result += "L";
				}else if(T == 6) {
					result += "LX";
				}else if(T == 7) {
					result += "LXX";
				}else if(T == 8) {
					result += "LXXX";
				}else if (T == 9){
					result += "XC";
				}
				
				if(U == 1){
					result += "I";
				}else if(U == 2) {
					result += "II";
				}else if(U == 3){
					result += "III";
				}else if (U == 4) {
					result += "IV";
				}else if(U == 5){
					result += "V";
				}else if(U == 6) {
					result += "VI";
				}else if(U == 7) {
					result += "VII";
				}else if (U == 8) {
					result += "VIII";
				}else if(U == 9){
					result += "IX";
				}
			
			}
		}else if(num >= 100 && num < 1000) {
			int q = 1; 
			int C, T, U, R;
			while(q != 0) {
				C = num / 100; 
				R = num % 100; 
				q = R; 
				T = q / 10; 
				R = q % 10;
				q = R / 10; 
				U = R; 
				System.out.println(C + " " + T + " " + U);
				if(C == 1) {
					result += "C";
				}else if(C == 2) {
					result += "CC";
				}else if(C == 3) {
					result += "CCC";
				}else if(C == 4){
					result += "CD";
				}else if(C == 5) {
					result += "D";
				}else if(C == 6) {
					result += "DC";
				}else if(C == 7) {
					result += "DCC";
				}else if(C == 8) {
					result += "DCCC";
				}else if (C == 9) {
					result += "CM";
				}
				
				if (T == 1) {
					result += "X";
				}else if(T == 2) {
					result += "XX";
				}else if (T == 3) {
					result += "XXX";
				}else if (T == 4) {
					result += "XL";
				}else if(T == 5) {
					result += "L";
				}else if(T == 6) {
					result += "LX";
				}else if(T == 7) {
					result += "LXX";
				}else if(T == 8) {
					result += "LXXX";
				}else if (T == 9){
					result += "XC";
				}
				
				if(U == 1){
					result += "I";
				}else if(U == 2) {
					result += "II";
				}else if(U == 3){
					result += "III";
				}else if (U == 4) {
					result += "IV";
				}else if(U == 5){
					result += "V";
				}else if(U == 6) {
					result += "VI";
				}else if(U == 7) {
					result += "VII";
				}else if (U == 8) {
					result += "VIII";
				}else if (U == 9){
					result += "IX";
				}
			}
		}else if(num > 10 && num < 100) {
			int q = 1; 
			int T, U, R; 
			while(q != 0) {
				T = num / 10; 
				R =  num % 10; 
				U = R; 
				q = U/10;
				System.out.println(T + " " + U);
				if (T == 1) {
					result += "X";
				}else if(T == 2) {
					result += "XX";
				}else if (T == 3) {
					result += "XXX";
				}else if (T == 4) {
					result += "XL";
				}else if(T == 5) {
					result += "L";
				}else if(T == 6) {
					result += "LX";
				}else if(T == 7) {
					result += "LXX";
				}else if(T == 8) {
					result += "LXXX";
				}else if (T == 9){
					result += "XC";
				}else {
					result += "C";
				}
				
				if(U == 1){
					result += "I";
				}else if(U == 2) {
					result += "II";
				}else if(U == 3){
					result += "III";
				}else if (U == 4) {
					result += "IV";
				}else if(U == 5){
					result += "V";
				}else if(U == 6) {
					result += "VI";
				}else if(U == 7) {
					result += "VII";
				}else if (U == 8) {
					result += "VIII";
				}else if(U == 9){
					result += "IX";
				}
				
			}	
		}else{
			int U = num;
			System.out.println(U);
			if(U == 1){
				result += "I";
			}else if(U == 2) {
				result += "II";
			}else if(U == 3){
				result += "III";
			}else if (U == 4) {
				result += "IV";
			}else if(U == 5){
				result += "V";
			}else if(U == 6) {
				result += "VI";
			}else if(U == 7) {
				result += "VII";
			}else if (U == 8) {
				result += "VIII";
			}else if (U == 9){
				result += "IX";
			}else {
				result += "X";
			}
			
		}
		
		
		return result; 
    }
	public static void main(String[] args) {
		int num1 = 3000;   	//MMDV
		int num2 = 3999;   	//MMCMXXXV
		int num3 = 854;   	// DCCCLIV 
		int num4 = 58;		// LVIII
		int num5 = 10;    //X
		int num6 = 120;   //CXX
		int num7 = 1000; //X
		System.out.println(intToRoman(num1));
		System.out.println(intToRoman(num2));
		System.out.println(intToRoman(num3));
		System.out.println(intToRoman(num4));
		System.out.println(intToRoman(num5));
		System.out.println(intToRoman(num6));
		System.out.println(intToRoman(num7));
		
	}
}
