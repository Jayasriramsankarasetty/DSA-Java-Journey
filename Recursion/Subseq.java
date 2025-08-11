import java.util.*;

public class Subseq {
	public static void main(String[] args){
		int[] arr = {1,2,3};
		List<List<Integer>> ans = subset(arr);
		for(List<Integer> list:ans){
			System.out.println(list);
		}
	}
	static void subseq(String p, String up){
		if (up.isEmpty()){
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		subseq(p+ch,up.substring(1));
		subseq(p, up.substring(1));
	}
	static ArrayList<String> subseqRet(String p,String up){
		if (up.isEmpty()){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		ArrayList<String> left = subseqRet(p+ch,up.substring(1));
		ArrayList<String> right = subseqRet(p,up.substring(1));
		left.addAll(right);
		return left;
	}
	static List<List<Integer>> subset(int[] arr){
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		for(int num:arr){
			int n = outer.size();
			for(int i=0;i<n;i++){
				List<Integer> internal = new ArrayList<>(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}
		return outer;
	}
}

