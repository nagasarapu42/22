class RotatedArray{

  public static void rotateArray(int arr[]){
  
  int lastelement = arr[arr.length - 1];
  
  //shift elements to the right side by one position
  for(int i = arr.length - 1; i > 0; i--){
    arr[i] = arr[i - 1];
  
  
  }
   arr[0] = lastelement;
  
  }
  
  public static void main(String args[]){
   
   int arr[] = {1, 2, 3, 4, 5};
   System.out.println(" Original Array: " );
   for(int num : arr){
   
     System.out.print(num + " ");
    }
   rotateArray(arr);

   System.out.println();
   System.out.println("after rotating array : ");
   for(int num : arr){

      System.out.print(num + " ");

   }	  
  
  
  }

}