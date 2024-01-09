import java.util.*;

class TextJustification{

   public static List<String> fullyJustify(String words[], int maxWidth){
      List<String> lines = new ArrayList<>();
	  int currWidth = 0;
	  int startIdx = 0;
	  
	  for(int i=0; i<words.length; i++){
	      if(currWidth + words[i].length() + (i - startIdx) > maxWidth){
		     
		    int numWords = i - startIdx;
			int totalSpaces = maxWidth - currWidth;
			int extraSpaces = 0;
			
			if(numWords > 1){
			   
			   totalSpaces -= numWords - 1;
			   extraSpaces = totalSpaces % (numWords - 1);
			   totalSpaces /= numWords - 1;
			
			
			}
			
			StringBuilder line = new StringBuilder();
			
			for(int j = startIdx ; j < i; j++){
			
			   line.append(words[j]);
			   
			   if(j < i - 1){
			     int spaces = totalSpaces + (extraSpaces-- > 0 ? 1 : 0);
				 line.append(" ".repeat(spaces));
			   
			   }
			}
			
			if(line.length() < maxWidth){
			   line.append(" ".repeat(maxWidth - line.length()));
			}
			
			lines.add(line.toString());
			
			startIdx = i;
		    currWidth = 0;
		  }
		  
		  currWidth += words[i].length();
		  
		  if(i > startIdx){
		  
		     currWidth++;//Account for the space between words
		  
		  }
	  
	  }
	  
	  //Process the last line
	  StringBuilder lastline = new StringBuilder();
	  
	  for(int i=startIdx ; i<words.length; i++){
	    lastline.append(words[i]);
		
		if(i < words.length - 1) {
		   lastline.append(" ");
		}
	  
	  }
	  
	  if(lastline.length() < maxWidth){
	      lastline.append(" ".repeat(maxWidth - lastline.length()));
	  }
      
      lines.add(lastline.toString());	  
	  
	  return lines;

}   


public static void main(String args[]){

  String words[] = {"This", "is", "an", "example", "of", "text", "justfication."};
  int maxWidth = 16;

  List<String> formattedlines = fullyJustify(words, maxWidth);
  
  for(String line : formattedlines){
    System.out.print(line + " ");
  }
}

}