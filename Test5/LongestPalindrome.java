class LongestPalindrome{

     public static String longestPalindrome(String str){
	 
	 int n = str.length();
	 boolean dp[][] = new boolean[n][n];
	 int maxlength = 1;
	 int start = 0;
	 
	 
	  // Mark all substrings of length 1 as palindromes
	 for(int i=0; i<n; i++){
	 dp[i][i] = true;
	 }
	 
	  // Check for substrings of length 2
	 for(int i=0; i<n-1; i++){
	    if(str.charAt(i) == str.charAt(i+1)){
		   dp[i][i+1] = true;
		   start = i;
		   maxlength = 2;
		}
	 }
	  // Check for substrings of length greater than 2
	 for(int len=3; len <=n; len++){
	 
	   for(int i=0; i<n-len +1 ; i++){
	   int j = i + len - 1;
	   
	   if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1]){
	   dp[i][j] = true;
	   
	   if(len > maxlength){
	   start = i;
	   maxlength = len;
	   
	   
	   }
	   }
	 }
	 }
	 return str.substring(start, start + maxlength);
	 
	 }
	 public static void main(String args[]){
	 
	 String str = "mamlength";
	 String findResult = longestPalindrome(str);
	 System.out.println("longest Lapindrpme is : " + findResult);
	 
	 }

}