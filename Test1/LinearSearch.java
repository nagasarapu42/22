class LinearSearch{
public static void linearSearch(int arr[], int target){

for(int i=0; i<arr.length-1; i++){
if(arr[i] + arr[i+1] == target){
System.out.print("the elements are " + arr[i] + " " + arr[i+1]);
}
}
}

public static void main(String[] args){
int arr[] = {10, 20, 30, 40, 50};
int target = 50;
linearSearch(arr, target);
}
}