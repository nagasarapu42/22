class ReverseArray{


    public static void main(String args[]){
	    int numbers[] = {1 ,2 , 3, 4, 5};
		
		printArrayInReverse(numbers);
	}


    public static void printArrayInReverse(int numbers[]){
	    printReverseArrayHelper(numbers, numbers.length - 1);
	
	}

    public static void printReverseArrayHelper(int numbers[], int index){
	
	    if(index < 0){
		   return;
		}
		
		System.out.print(numbers[index] + " ");
		
		printReverseArrayHelper(numbers, index - 1);
		
	}

}