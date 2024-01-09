class TrianglePatteren{

public static void trianglePattern(){
int i ,j;
for(i=1;i<=5;i++) {

			for(j=1;j<=i;j++) {
			
				System.out.print(j * i+ " ");
				
			}
					
			System.out.println();
		}
	}


public static void main(String args[]){

trianglePattern();
}

}