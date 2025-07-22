class GoalParser {
    public String interpret(String command) {
        StringBuilder t = new StringBuilder("");
        for (int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                t.append('G');
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                t.append('o');
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                t.append("al");
            }
        }
        return t.toString();
    }
}
//1678. Goal Parser Interpretation
//Leetcode-easy