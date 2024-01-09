class RemoveDuplicates{

    public static int removeDuplicates(int nums[]){
	    int n = nums.length;
		int j = 0;
		
		for(int i = 0; i < n ; i++){
		
		    if(i < n - 1 && nums[i] == nums[i + 1]){
		        continue;    
		    }
			nums[j++] = nums[i];
		}
		
	return j;	
	
	}
	
	public static void main(String args[]){
	
	    int arr[] = {10, 20, 30, 40, 40};
		int removeDuplicates = removeDuplicates(arr);
		System.out.println(" After removing duplicate elements the array length is: " + removeDuplicates);
		System.out.print(" Array = ");
		for(int i = 0; i < removeDuplicates ; i++){
		    System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}