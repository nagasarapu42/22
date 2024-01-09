public class MinimumJumps {
    public static int findMinimumJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return 0;
        
        if (arr[0] == 0)
            return -1;
        
        int jumps = 1;
        int end = arr[0];
        int farthest = arr[0];
        
        for (int i = 1; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            
            if (i == end) {
                jumps++;
                end = farthest;
            }
            
            if (end >= n - 1)
                return jumps;
            
            if (i == farthest)
                return -1;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        
        int minimumJumps = findMinimumJumps(arr);
        if (minimumJumps != -1)
            System.out.println("Minimum number of jumps to reach the end is: " + minimumJumps);
        else
            System.out.println("It is not possible to reach the end of the array.");
    }
}
