class MaxProduct{

     public static int findMaxProductArray(int arr[]){
	 
	 
	  int n = arr.length;
        int pre = 1, suff = 1, ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pre == 0)
			pre = 1;
            if (suff == 0) 
			suff = 1;
			//swap the elements and find maximum product subarray
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;



    }
	
	 public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println("The maximum product subarray is: " + findMaxProductArray(arr));
    }

}