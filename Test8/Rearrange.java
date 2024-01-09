import java.util.*;
class Rearrange{

   public static void rearrange(int[] arr) {
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> neg = new ArrayList<>();
    for (int i : arr) {
        if (i >= 0)
            pos.add(i);
        else
            neg.add(i);
    }

    int index = 0, i = 0, j = 0;
    while (i < pos.size() && j < neg.size()) {
        if (index % 2 == 0) {
            arr[index] = neg.get(j);
            j++;
        } else {
            arr[index] = pos.get(i);
            i++;
        }
        index++;
    }

    while (i < pos.size()) {
        arr[index] = pos.get(i);
        i++;
        index++;
    }

    while (j < neg.size()) {
        arr[index] = neg.get(j);
        j++;
        index++;
    }
}

   
   public static void main(String[] args){
   
    int arr[] = {1, 2, 3, -4, -1, 4};
	int arr1[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
	rearrange(arr);
	rearrange(arr1);
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(arr1));
   
   }


}