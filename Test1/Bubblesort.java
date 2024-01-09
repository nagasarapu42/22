class Bubblesort{

public static void bubblesort(int arr[]){

int arraysize = arr.length;
for(int i=0; i<arraysize-1; i++){
for(int j=0; j<arraysize-i-1; j++){
if(arr[j] > arr[j+1]){
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}
}
}
public static void main(String args[]){
int arr[]= {10, 20, 50, 40};
bubblesort(arr);
for(int i : arr){
System.out.print(i + " ");
}
}
}