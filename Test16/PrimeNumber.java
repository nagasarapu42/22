class PrimeNumber{

   //Brute-Force Method
   public static boolean isPrime(int number){
	   
	    if(number <= 1){			
		  return false;		
		}   
	    
		for(int i = 2; i < number ; i++){
			if(number % i == 0){
			    return false;	
			}	
		    	
		}	
		
		return true;
   }   
   
   public static void displayPrimeNUmbers(int N){
	   
	   for(int i = 2; i <= N ; i++){
	   if(isPrime(i)){
		  System.out.print(i + " "); 
	   }   
	   }		   
	   
   }
   
   public static void main(String args[]){
   
      int N = 11;
	  System.out.print(" Prime numbers from 1 to " + N + " are : ");
	  displayPrimeNUmbers(N);
   }

}