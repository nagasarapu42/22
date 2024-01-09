public class MaximumProductSubarray {
    public static int maxProduct(int[] arr) {
        int n = arr.length;
        int maxEndingHere = 1;
        int minEndingHere = 1;
        int maxSoFar = 1;
        int start = 0;
        int end = 0;
        int maxStart = 0;
        int maxEnd = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                maxEndingHere = maxEndingHere * arr[i];
                minEndingHere = Math.min(minEndingHere * arr[i], 1);
            } else if (arr[i] == 0) {
                maxEndingHere = 1;
                minEndingHere = 1;
                start = i + 1;
            } else {
                int temp = maxEndingHere;
                maxEndingHere = Math.max(minEndingHere * arr[i], 1);
                minEndingHere = temp * arr[i];
            }
            
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                maxStart = start;
                maxEnd = i;
            }
        }
        
        System.out.print("The subarray with maximum product: ");
        for (int i = maxStart; i <= maxEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        return maxSoFar;
    }
    
    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
        int result = maxProduct(arr);
        System.out.println("The product of the maximum product subarray: " + result);
    }
}
