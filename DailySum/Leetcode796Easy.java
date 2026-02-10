class Leetcode796Easy {
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        for(int i=0;i<s.length();i++){
            StringBuilder str = new StringBuilder("");
            if(str.equals(goal)){
                return true;
            }
            str.append(s.substring(i,s.length()));
            str.append(s.substring(0,i));
        }
        return false;
    }
    public static void main(String[] args) {
        // Leetcode796Easy leetcode796Easy = new Leetcode796Easy();
        System.out.println(rotateString("abcde","cdeab"));
    }
}