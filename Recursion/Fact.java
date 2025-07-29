public class Fact {
	public static void main(String[] args){
		System.out.println(fact2(6));
	}
	static void fact(int n,int ans){ 		// Method1
		if(n==1){
			System.out.println(ans);
			return;
		}
		ans = ans*n;
		fact(n-1,ans);
	}
	static int fact2(int n){				//Method 2
		if(n==1){  
			return 1;
		}
		return n * fact2(n-1);
	}
}