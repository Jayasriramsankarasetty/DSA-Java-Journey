import java.util.*;

public class FibonacciSeries {
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		int sum= 0;
		for (int i=0; i<n;i++){
			sum += a;
			int temp =a+b;
			a=b;
			b=temp;
		}
		System.out.println(sum);
	}
}