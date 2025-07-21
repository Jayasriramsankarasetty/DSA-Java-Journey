import java.util.*;

public class CGPACal {
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		int numofsub = s.nextInt();
		int sum = 0;
		for (int i=0;i<numofsub;i++){
			int grade = s.nextInt();
			sum += grade;
		}
		int avg = sum/numofsub;
		System.out.println(avg);
	}
}