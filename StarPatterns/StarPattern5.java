

public class StarPattern5 {
	public static void main(String[] args){
	
		pattern5(5);


	}
	
	static void pattern5(int n){
		for (int i=0;i<2*n;i++){
			int total = i > n ? 2*n-i : i;
			for (int col = 0;col<total;col++){
				System.out.print("*");

			}
			System.out.println();
		}
	}
}