
public class StarPattern2 {
	public static void main(String[] args){
	
		pattern2(4);


	}
	
	static void pattern2(int n){
		for (int i=1;i<=n;i++){
			for (int col = 1;col<=n;col++){
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}