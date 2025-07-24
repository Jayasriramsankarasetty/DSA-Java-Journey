
public class StarPattern3 {
	public static void main(String[] args){
	
		pattern3(5);


	}
	
	static void pattern3(int n){
		for (int i=1;i<=n;i++){
			for (int col = n;col>=i;col--){
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}