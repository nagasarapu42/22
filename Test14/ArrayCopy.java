class ArrayCopy{


   public static void main(String[] args){
      int[] originalArray = {1, 2, 3};
      int[] newArray = new int[originalArray.length];

      copyArray(originalArray, newArray);

      System.out.println(" Original Array: ");
      printArray(originalArray);
      System.out.println(" New Array: ");
      printArray(newArray);	  
   
   }


   public static void copyArray(int source[], int destination[]){
   
      if(source.length != destination.length){
	  
	     throw new IllegalArgumentException(" Arrays must have same length");
	  
	  }
	  
	  for(int i = 0; i < source.length; i++){
	  
	     destination[i] = source[i];
	  
	  }
   
   }

   public static void printArray(int arr[]){
      for(int i = 0; i < arr.length; i++){
	    System.out.print(arr[i] + " ");
	  
	  }
	  System.out.println();
   
   }

}