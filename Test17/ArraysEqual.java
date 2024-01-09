import java.util.*;

class ArraysEqual{

    public static boolean checkArraysEqual(int arr1[], int arr2[]){
	
	    boolean result = Arrays.equals(arr1, arr2);
		
		return result;
	}
	
	public static void main(String args[]){
	
	    int arr1[] = {2, 3, 4};
		int arr2[] = {2, 3, 4};
		 		 
		boolean arraysOrEqualOrNot = checkArraysEqual(arr1, arr2);
		if(arraysOrEqualOrNot == true){
		   System.out.println( " Both are equal: " + arraysOrEqualOrNot );
		}
		else{
		   System.out.println(" Both are not equal " );
		}
	}

}