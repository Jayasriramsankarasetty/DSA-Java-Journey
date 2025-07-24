public class StarPattern7 {
	public static void main(String[] args){
	
		pattern7(5);


	}
	
	static void pattern7(int n){
		for (int i=1;i<=n;i++){
			for (int s = 0;s<n-i;s++){
				System.out.print("  ");
			}
			for (int col = i;col>=1;col--){
				System.out.print(col + " ");

			}
			for (int col = 2;col<=i;col++){
				System.out.print(col + " ");

			}

			System.out.println();
		}
	}
}