class HalfPyramid{

public static void printPyramid(){
 int rows = 9;
        int midRow = rows / 2;
        int stars = 1;
        int spaces = midRow;
        
        // Upper half of the pattern
        for (int i = 0; i < midRow; i++) {
            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            spaces--;
            stars += 2;
        }
        
        // Middle row of the pattern
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        
        System.out.println();
        spaces++;
        stars -= 2;
        
        // Lower half of the pattern
        for (int i = 0; i < midRow; i++) {
            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            spaces++;
            stars -= 2;
        }
}

public static void main(String args[]){

printPyramid();
}
}