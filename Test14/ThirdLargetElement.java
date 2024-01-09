class ThirdLargetElement{


    public static void main(String[] args){
	
	    int numbers[] = {10, 5, 8, 2, 7, 3};
		
		int findThirdLarget = findThirdLargest(numbers);
		System.out.println(" The Third Largest Elemnt is: " + findThirdLarget);
	}

    public static int findThirdLargest(int numbers[]){
	    if(numbers.length < 3){
		    throw new IllegalArgumentException(" Arrays should have atleast 3 elements " );
		}
		
		int first = numbers[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int i = 1; i < numbers.length ; i++){
		    int current = numbers[i];
			
			if(current > first){
			    third = second;
				second = first;
				first = current;
			}else if(current > second) {
			    third = second;
				second = current;
			} else if(current > third){
			   third = current;
			}
		}
		
		return third;
	}

}