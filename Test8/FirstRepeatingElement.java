import java.util.*;
class FirstRepeatingElement{

  static int firstRepeating(int arr[], int n){
   
    HashMap<Integer, Integer>myMap = new HashMap<Integer, Integer>();
	int min_index = -1;
	
	for(int i = n - 1; i >= 0; i--){
	   if(myMap.containsKey(arr[i])){
	   min_index = i;
	}
	else{
	    myMap.put(arr[i], i);
	}
  }
  
  return (min_index != -1) ? arr[min_index] : -1;
  
  }
  
  public static void main(String args[]){
  
  int arr[] = {1, 2, 3, 4, 5 , 6, 5, 3, 2};
  int n = arr.length;
  
  int firstRepeatedElement = firstRepeating(arr, n);
  System.out.println(firstRepeatedElement);
  
  }

}