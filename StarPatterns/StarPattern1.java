

public class StarPattern1 {
	public static void main(String[] args){
	
		pattern1(4);


	}
	
	static void pattern1(int n){
		for (int i=1;i<=n;i++){
			for (int col = 1;col<=i;col++){
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}