import java.util.*;
class DescendingOrder{

public static void printArrays(Integer arr[]){

Arrays.sort(arr, Comparator.reverseOrder());
System.out.println(Arrays.toString(arr));

}

public static void main(String args[]){
	
Integer arr[] = {1, 50, 24, 69, 10, 80};
printArrays(arr);

}
}