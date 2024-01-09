class OccurenceOfCharacters{

   public static void frequecyOfCaharacters(String input){
   
       int[] freq = new int[input.length()];

   for (int i = 0; i < input.length(); i++) {
       for (int j = i + 1; j < input.length(); j++) {
           if (input.charAt(i) == input.charAt(j)) {
               freq[j]++;
           }
       }
   }

   System.out.println("Characters and their corresponding frequencies:");
   for (int i = 0; i < input.length(); i++) {
       if (freq[i] != -1) {
           System.out.println(input.charAt(i) + "-" + (freq[i] + 1));
           freq[i] = -1;
       }
   }
   
   }
   
   public static void main(String args[]){
   
      String input = "s i v a s a n k a r r e d d i";
	  frequecyOfCaharacters(input);
   
   
   }



}