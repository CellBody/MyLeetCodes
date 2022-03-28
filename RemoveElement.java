class RemoveElement {
	/*
	 * You are not allowed to create another array object
	 * Here, I used a Two Pointer Approach 
	 */
   static public int removeElement(int[] nums, int val) {
    	int k = 0;
    	int len = nums.length - 1; 
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == val) {
        		for(int j = len; j > i; j--) {
        			if(nums[j] != val) {
        				int t = nums[j];
        				nums[j] = nums[i]; 
        				nums[i] = t; 
        				break;
        			}
        		}
        	}
        }
        	for(int m : nums) {
        		if(m != val)
        			k += 1; 
        	}
        	for(int n : nums) {
        	   	System.out.print(n);
        	}
        return k;
    }
    public static void main(String[] args) {
    	int[] A = {3, 2, 2, 3}; 
    	int[] B = {0,1,2,2,3,0,4,2};
    	System.out.println(removeElement(A, 2));
      System.out.println(removeElement(B, 2));
    }
}
