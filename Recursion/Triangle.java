public class Triangle {
	public static void main(String[] args){
	
		triangle1(4,0);

	}
	static void  triangle(int n){
			if(n==0){
				return;
			}
			for(int i=0;i<n;i++){
				System.out.print("* ");
			}
			System.out.println();
			triangle(n-1);
	}
	static void  triangle1(int row,int col){
			if(row==0){
				return;
			}
			if (col < row){
				System.out.print("*");
				triangle1(row,col+1);
			}else{
				System.out.println();
				triangle1(row-1,0);
			}
	}
	
}