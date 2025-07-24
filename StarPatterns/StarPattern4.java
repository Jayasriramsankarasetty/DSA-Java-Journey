

public class StarPattern4 {
	public static void main(String[] args){
	
		pattern4(5);


	}
	
	static void pattern4(int n){
		for (int i=1;i<=n;i++){
			for (int col = 1;col<=i;col++){
				System.out.print(col);
			}
			System.out.println();
		}
	
	}
}