import java.util.*;
class FindPairs{

//Using HashMap to store the count of elements and their complements
  public static void printPairs(int[] arr, int sum) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if ((arr[i] + arr[j]) == sum) {
                System.out.println("The pair is : (" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}

public static void main(String[] args) {
    int[] arr = {1, 5, 7, -1, 5};
    int sum = 6;
    printPairs(arr, sum);
}

}