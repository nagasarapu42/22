class MaxProduct{

   public static int maxProductSubarray(int arr[]){

    int n = arr.length;
       int prefix = 1, suffix = 1, answer = Integer.MIN_VALUE;

       for(int i=0; i<n; i++){
           if(prefix == 0)
           prefix = 1;
           if(suffix == 0)
           suffix = 1;
           prefix *= arr[i];
           suffix *= arr[n - i - 1];
           answer = Math.max(answer, Math.max(prefix, suffix));

   }
   return answer;
}
public static void main(String[] args){

   int arr[] = {2, 3, -2, 4};
   System.out.println(" The maximum product subarray is: " + maxProductSubarray(arr));

}


}