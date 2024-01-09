class Factorial{

//Using recursive function to calculate factorialOfNumber
  public static long factorialRecursion(int n){
  
     if( n <= 1){
	 
	   return 1;
	   
	}
	
  return n * factorialRecursion(n - 1);
  
  }
  
  public static void main(String args[]){
  
  int n = 6;
  
  long factorialOfNumber = factorialRecursion(n);
  
  System.out.println(factorialOfNumber);
  }

}