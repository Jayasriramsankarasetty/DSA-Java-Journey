import java.util.*;
public class StarPattern8 {
	public static void main(String[] args){
	
		pattern8(4);


	}
	
	static void pattern8(int n){
		int org = n;
		n = 2*n;
		for (int i=0;i<=n;i++){
			for(int s=1;s<3;s++){
				System.out.print(" ");

			}
			for (int col = 0;col<=n;col++){
				int index= org - Math.min(Math.min(i,col),Math.min(n-i,n-col));
				System.out.print(index);

			}
			System.out.println();
		}
	}
}