public class Leetcode3577Medium {
    public static int countPermutations(int[] complexity) {
        int count=0;
        for(int i=1;i<complexity.length;i++){
            for(int j=0;j<i;j++){
                if(j<i && complexity[j]<complexity[i]){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
       
        int[] complexity = {1,2,3};
        System.out.println(countPermutations(complexity));
    }
}
