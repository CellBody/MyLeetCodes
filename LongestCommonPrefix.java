public class RomanToInteger {
	    static public int romanToInt(String s) {
	        int total = 0; 
	        int[] numbers = new int[s.length()]; 
	        int[] solution = new int[s.length()]; 
	        for(int i = 0; i < s.length(); i++){
	            switch(s.charAt(i)){
	                case 'I': 
	                    numbers[i] = 1;
	                    break; 
	                case 'V': 
	                    numbers[i] = 5; 
	                    break; 
	                case 'X': 
	                    numbers[i] = 10; 
	                    break; 
	                case 'L': 
	                    numbers[i] = 50; 
	                    break; 
	                case 'C': 
	                    numbers[i] = 100;
	                    break; 
	                case 'D': 
	                    numbers[i] = 500;
	                    break; 
	                case 'M': 
	                    numbers[i] = 1000;
	                    break;
	            }
	        }
	        for(int i = 0; i < numbers.length; i++){
	        	if(i == numbers.length-1){
	        		solution[i] = numbers[i];
	        	}else {
	        		if((numbers[i] == 1) && (numbers[i+1] == 5 || numbers[i+1] == 10)){
	                solution[i] = -1; 
	            }else if((numbers[i] == 10) && (numbers[i+1] == 50 || numbers[i+ 1] == 100)){
	                solution[i] = -10;
	            }else if((numbers[i] == 100) && (numbers[i+1] == 500 || numbers[i+1] == 1000)){
	                solution[i] = -100; 
	            }else{
	                solution[i] = numbers[i]; 
	            }
	        }
	        }
	        for(int x : solution){
	            total += x;
	        }
	        return total; 
	    }

	    public static void main(String[] args) {
	    	System.out.println(romanToInt("III"));
	    	System.out.println(romanToInt("LVIII"));
	    	System.out.println(romanToInt("MCMXCIV"));
	    	
	    }
	}
