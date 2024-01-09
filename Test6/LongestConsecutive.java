import java.util.HashSet;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int result = 0;
        for (int num : nums) {
            if (set.contains(num - 1)) {
                continue;
            }

            int count = 1;
            int up = num + 1;
            while (set.contains(up)) {
                set.remove(up);
                up++;
                count++;
            }

            result = Math.max(result, count);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of the Longest contiguous subsequence is " + longestConsecutive(arr));
    }
}
