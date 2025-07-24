
public class StarPattern6 {
	public static void main(String[] args){
	
		pattern6(5);


	}
	
	static void pattern6(int n){
		for (int i=0;i<2*n;i++){
			int total = i > n ? 2*n-i : i;
			int noOfSpaces = n- total;
			for (int s = 0;s<noOfSpaces;s++){
				System.out.print(" ");
			}
			for (int col = 0;col<total;col++){
				System.out.print("* ");

			}
			System.out.println(" ");
		}
	}
}