class ArrayMax {

    public static void findmaxArray(int intArray[]){
	 
	int maxNum = intArray[0];

        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Maximum number = " + maxNum);
    }
	
	
	
    public static void main(String[] args) {
        int[] intArray = {5, 10, 20, 15};
		
		findmaxArray(intArray);
	}	

        
}