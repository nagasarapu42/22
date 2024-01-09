class MinMax {

    public static void findMinMax(int arr[], int n){
		
	int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum element of array: " + min);
        System.out.println("Maximum element of array: " + max);
	
	}
    public static void main(String[] args) {
        int[] arr = {12, 1234, 45, 67, 1};
        int n = arr.length;
        findMinMax(arr, n);
        
    }
}
