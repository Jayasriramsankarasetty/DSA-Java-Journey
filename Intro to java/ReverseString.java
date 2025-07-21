import java.util.*;

public class ReverseString {
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		String str = s.nextLine();
		StringBuilder newstr = new StringBuilder();
		for (int i=str.length()-1;i>=0;i--){
			char alpha = str.charAt(i);
			newstr.append(Character.toLowerCase(alpha));
		}
		System.out.println(newstr.toString());
	}
}