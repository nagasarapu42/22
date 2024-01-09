   import java.util.PriorityQueue;

    class SmallestElemnet {
	
	   public static void findSamllestValue(int arr[], int K){
	   
	   PriorityQueue<Integer> minHeap = new PriorityQueue<>();

           for (int num : arr) {
               minHeap.add(num);
           }

           int kthSmallest = 0;
           for (int i = 0; i < K; i++) {
               kthSmallest = minHeap.poll();
           }

           System.out.println("K'th smallest element is: " + kthSmallest);
	   
	   
	   
	   }
       public static void main(String[] args) {
           int[] arr = {7, 10, 4, 3, 20, 15};
           int K = 4;
           findSamllestValue(arr, K);
           
       }
   }
