public class CountNoZeros {
	public static void main(String[] args){
		System.out.println(CountZeros(302040507,0));
	}
	static int CountZeros(int n,int count){
		if(n == 0){
			return count;
		}
		int rem = n%10;
		if(rem==0){
			count = count+1;
		}
		return CountZeros(n/10,count);
	}

}