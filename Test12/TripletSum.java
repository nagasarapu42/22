import java.util.*;
class TripletSum{

   public static boolean findTriplet(int arr[], int target){
   
      int n = arr.length;
	  Arrays.sort(arr);
      
	  for(int i = 0; i < n - 2; i++){
	  
	     int j = i + 1;
		 int k = n - 1;
		 
		 while(j < k){
		    int sum = arr[i] + arr[j] + arr[k];
			
			if(sum == target){
			  System.out.println(arr[i]+ " , " + arr[j] + " , " + arr[k]);
			  return true;
			
			}
			else if(sum < target)
			   j++;
			else
			   k--;
			   
		 }
	  
	  }
	  
	  return false;
   }   
   
   public static void main(String[] args){
   int arr[] = {12, 3, 4, 1, 6, 9};
   int sum = 24;
   boolean findTriplet = findTriplet(arr, sum);
   if(!findTriplet){
   
		System.out.println(" No Triplet Found ");
   }
   
   }

}