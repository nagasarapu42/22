class SquarePattern{

public static void squarepattern(){
int size = 5;
for(int i=1;i<=size;i++){
			for(int j=1;j<=size;j++) {
				if(i ==1 || i == size || j == 1 || j == size -1 ){
				System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
}

public static void main(String[] args){
squarepattern();
}
}