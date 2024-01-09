class MissingNumber{


public static int findMissingNumber(int arr[], int n){
     int total = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) { // changed from n to arr.length
            total -= arr[i];
        }
        return total;


}


public static void main(String[] args){

  int arr[] = {1, 2, 4, 6, 3, 7, 8 };
  int N = 8; 
  System.out.println(findMissingNumber(arr, N));

}

}