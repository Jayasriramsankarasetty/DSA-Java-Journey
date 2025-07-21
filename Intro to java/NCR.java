import java.util.*;

public class NCR {
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int fact =1;
		int fact2 = 1;
		int fact3=1;
		for (int i=1;i<=n;i++){
			fact = fact*i;
		}
		for (int j=1;j<=r;j++){
			fact2 = fact2*j;
		}
		int dif =n-r;
		for (int k=1;k<=dif;k++){
			fact3 = fact3*k;
		}
		int ncr = fact/(fact2*fact3);
		System.out.println(ncr);
	}
}