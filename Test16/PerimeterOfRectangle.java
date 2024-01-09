class PerimeterOfRectangle{

    public static float printPerimeter(float length, float breadth){

        float perimeter = 2 * (length + breadth);
		
		return perimeter;
    }	
	
	public static void main(String args[]){
	   float l = 2.5f;
	   float b = 3.5f;
	   
	   System.out.println(printPerimeter(l, b));
	
	}

}