   public class Reverse {
   
   
       public static void reverseArray(int arr[], int n){
	   
	      int left = 0;
           int right = n - 1;

           while (left < right) {
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;

               left++;
               right--;
           }

           System.out.println("Reversed array: ");
           for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
           }
	      
	   }
	   
	   
       public static void main(String[] args) {
           int[] arr = {4, 5, 1, 2};
           int n = arr.length;

           reverseArray(arr, n);
       }
   }
