class RepeatingElements{

   public static void printRepeating(int arr[], int size){
   
   int count[] = new int[size];
   System.out.print(" Repeating elements are: ");
   
    for(int i = 0; i < size; i++){
      if(count[arr[i]] == 1 ){
	     System.out.print(arr[i] + " ");
	  }else{
	  
	   count[arr[i]]++;
	  }
   
    } 
   }
   
   public static void main(String[] args){
   
   int arr[] = {1, 2, 3, 4 ,3};
   int size = arr.length;
   printRepeating(arr, size);
   
   
   }
}