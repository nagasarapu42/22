class SwapTwoNumbers{

    public static void swapNumbers(int a, int b, int c){
	
	     int temp; 
		 
		temp = a;
		a = b;
		b = c;
		c = temp;
		
	  System.out.println(" After swapping : ");
		 System.out.println(a + " " + b + " " + c);
	
	}
	
	
	public static void main(String args[]){
	
	    int a = 10, b = 20, c = 30;
		
		swapNumbers(a, b, c);
	 
	   
	}

  

}