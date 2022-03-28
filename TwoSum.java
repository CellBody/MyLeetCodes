import java.util.ArrayList; 
public class TwoSum { 
	
	static ArrayList<Integer> solution(int[] arr, int t){ 
		ArrayList<Integer> ans = new ArrayList<Integer>(); 
		int i, j; 
		for(i = 0; i < arr.length - 1; i++) {
			for(j = i+1; j < arr.length; j++) {
				if((arr[i] + arr[j]) == t) {
					ans.add(i); 
					ans.add(j);
				}
			}
		}
		return ans; 
	}
	public static void main(String[] args) {
		int[] ages = {1, 2, 3, 4, 7, 10}; 
		int target = 4; 
		System.out.println(solution(ages, target)); 
	}
} 


