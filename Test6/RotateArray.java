public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        
		//using recursion method
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
			//swap the elements for reversing
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        System.out.println("Rotated Array: " + java.util.Arrays.toString(arr));
    }
}