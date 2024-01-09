class Palindrome{


   public static void main(String[] args){
   
   String word = "shiva";
   boolean text = isPalindromeRecursive(word);
   if(text == true){
   System.out.println(text);
   }
   else{
	   System.out.println("false");
   }
   
   }

   public static boolean isPalindromeRecursive(String text){
    String clean = text.replaceAll("\\s+", "").toLowerCase();
    return recursivePalindrome(clean, 0, clean.length() - 1);
}

private static boolean recursivePalindrome(String text, int forward, int backward) {
    if (forward == backward) {
        return true;
    }
    if ((text.charAt(forward)) != (text.charAt(backward))) {
        return false;
    }
    if (forward < backward + 1) {
        return recursivePalindrome(text, forward + 1, backward - 1);
    }
    return true;
}


}