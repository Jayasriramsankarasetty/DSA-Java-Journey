public class Ntol {
	public static void main(String[] args){
		fun(1,10);
	}
	static void fun(int s,int n){
		if(s==n){
			System.out.println(s);
			return;
		}
		System.out.println(s);
		fun(s+1,n);
	}
}