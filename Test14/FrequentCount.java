class FrequentCount{


    public static void main(String[] args){
      int numbers[] = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
	  
	  int frequency[] = new int[numbers.length];
	  countFrequency(numbers, frequency);
	  
	  System.out.println(" Elements Frequency: ");
      for(int i = 0; i < frequency.length ; i++){
	    if(frequency[i] != -1){
		   System.out.println(numbers[i] + ": "+ frequency[i]); 
		}
	  }
    }

    public static void countFrequency(int numbers[], int frequency[]){
       int counted = -1;
	   
	    for(int i = 0; i < numbers.length; i++){
	       int count = 1;
		    for(int j = i + 1; j < numbers.length; j++){
		       if(numbers[i] == numbers[j]){
			    count++;
			    frequency[j] = counted;
			  
			}
			
		}
		if(frequency[i] != counted){
		    frequency[i] = count;
		}
	}
   
    }
}