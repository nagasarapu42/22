//Using indexOf() method

class FindConsonants{


    public static void main(String args[]){
	
	    char ch = 's';
		
		findConsonants(ch);
		
	
	}

    public static void findConsonants(char ch){
	
	  
        String str = "aeiouAEIOU";
        if (str.indexOf(ch) != -1) {
            System.out.println("It is a Vowel.");
        } else {
            System.out.println("It is a Consonant.");
        }
	
	}

}