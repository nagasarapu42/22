class BinarySearch{

public static void  binarysearch(int arr[], int numberToSearch){

int low = 0; 
int high = arr.length - 1;

while(low <= high){
int middleIndex = (low + high) / 2;
int middleNumber = arr[middleIndex];

if(numberToSearch == middleNumber){
System.out.println(middleIndex);

}

}
System.out.println("not founded");

}

public static void main(String[] args){
int arr[] = {10, 30, 20, 40};

int numberToSearch = 40;
binarysearch(arr, numberToSearch);

}


}