import java.util.Scanner;

public class Occurrences {
    private static int binarySearchFirstPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int firstPosition = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                firstPosition = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return firstPosition;
    }

    private static int binarySearchLastPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int lastPosition = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                lastPosition = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return lastPosition;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to count occurrences: ");
        int target = scanner.nextInt();
        scanner.close();

        int firstPosition = binarySearchFirstPosition(arr, target);
        int lastPosition = binarySearchLastPosition(arr, target);
        int count = lastPosition - firstPosition + 1;

        if (firstPosition != -1 && lastPosition != -1) {
            System.out.println("Count: " + count);
        } else {
            System.out.println("Count: 0");
        }
    }
}
