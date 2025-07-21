import java.util.*;

public class Palindrome {
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int original = n;
		int digit = 0;
		int rev = 0;
		while(n>0){
			digit = n%10;
			rev = rev*10+digit;
			n = n/10;
		}
		if (rev == original){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}