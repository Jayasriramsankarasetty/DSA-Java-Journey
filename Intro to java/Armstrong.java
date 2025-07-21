import java.util.*;

public class Armstrong {
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int org = n;
		int num =n;
		int count=0;
		while(n>0){
			int digit = n%10;
			count++;
			n = n/10;
		}
		double sum=0;
		for (int i=0;num>0;i++){
			int temp = num%10;
			sum += (int)Math.pow(temp, count);
			num=num/10;
		}
		System.out.println(count);
		if (sum == org){
			System.out.println(org+" is Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}