class SwapNumbers{

    public static void swapNumbers(int num1, int num2){
	
	   System.out.println(" Before Swapping two numbers " + num1 + " " + num2 );
	   num1 = num1 + num2;
	   num2 = num1 - num2;
	   num1 = num1 - num2;
	   
	   System.out.println(" After Swapping two numbers " + num1 + " " + num2 );
	
	}
	
	public static void main(String[] args){
	    
	    int num1 = 10, num2 = 20;
		swapNumbers(num1, num2);
	}

}