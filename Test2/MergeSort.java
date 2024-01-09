import java.util.*;
class MergeSort{
public static void mergesort(int arr[], int arr1[]){
	int x = arr.length;
		int y = arr1.length;

		for (int i = 0; i < x; i++) {
			if (arr[i] > arr1[0]) {
				int temp = arr[i];
				arr[i] = arr1[0];
				arr1[0] = temp;

				int first = arr1[0];
				int k;

				for (k = 1; k < y && arr1[k] < first; k++) {
					arr1[k - 1] = arr1[k];
				}
				arr1[k - 1] = first;
			}
		}

}
public static void main(String[] args) {

		int x[] = { 1, 4, 7, 10, 8 };
		int y[] = { 2, 9, 3 };
		mergesort(x, y);

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
	}

}