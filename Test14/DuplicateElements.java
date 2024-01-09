class DuplicateElements{

    public static void main(String args[]){
	    int numbers[] = {2, 4, 6, 8, 4, 6, 10, 10};
	    
		printDuplicateElemnts(numbers, 0);
	
	}

    public static void printDuplicateElemnts(int numbers[], int index){
	
	    if(index == numbers.length){
		   return;
		}
		
		int currentElemnt = numbers[index];
		
		//check if the current element is a duplicate 
		if(isDuplicate(numbers, currentElemnt, index + 1)){		
		    System.out.print(currentElemnt + " ");		
		}
		
		//Recursively call the method for the next index
		printDuplicateElemnts(numbers, index + 1	);
	
	}

   

    public static boolean isDuplicate(int numbers[], int element, int index){
   
        if(index == numbers.length){
	     return false;
	    }
	  
	    //check if the element at the current index is a duplicate
	    if(numbers[index] == element){
	     return true;
	    }
	  
	    //Recursively call the method for the next index
	    return isDuplicate(numbers, element, index + 1);
        }

}