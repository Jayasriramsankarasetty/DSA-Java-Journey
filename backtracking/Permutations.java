package backtracking;

public class Permutations {
    public static void main(String[] args) {
        Permutation("abc","");
    }
    public static void Permutation(String s,String ans){
        //base
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            String str = s.substring(0,i)+s.substring(i+1);
            Permutation(str,ans+curr);
        }
    }
}

