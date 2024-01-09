import java.util.*;

class MergeIntervals{

public static int[][] merge(int[][] intervals){

  Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
  
  List<int[]> merged = new ArrayList<>();
  for(int[] interval : intervals){
     if(merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
	 
	   merged.add(interval);
	 }else{
	   merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
	 }
  
  }
  
  return merged.toArray(new int[merged.size()][]);

}

public static void main(String args[]){

   int[][] intervals = {{1,3}, {2, 6}, {8, 10}, {15, 18}};
   
   int[][] mergedIntervals = merge(intervals);
   
   System.out.println(" The merged Intervals are: " + Arrays.deepToString(mergedIntervals));

}

}