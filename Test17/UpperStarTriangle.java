class UpperStarTriangle{

   public static void checkUpperStarTriangle(int size){
   
      for (int i = 1; i <= size; i++) {
            // print leading spaces
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) {
            // print leading spaces
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
   
   }
   
   public static void main(String args[]){
      int size = 7;
	  checkUpperStarTriangle(size);
   
   } 

}