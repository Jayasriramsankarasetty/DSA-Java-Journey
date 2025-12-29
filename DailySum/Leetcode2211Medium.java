// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Leetcode2211Medium {
    public static void main(String[] args) {
        String s = "LLRLRLLSLRLLSLSSSS";
        System.out.println(countCollisions(s));
    }
// class Solution {
    public static int countCollisions(String directions) {
        Stack<Character> road = new Stack<>();
        int col = 0;
        for(int i=0;i<directions.length();i++){
            if(road.isEmpty()){
                road.push(directions.charAt(i));
                continue;
            }
            if(road.peek()== 'R' && directions.charAt(i)=='L'){
                col = col + 2;
                road.pop();
            }
            else if(road.peek()== 'R' && directions.charAt(i)=='S'){
                col = col+1;
                
            }
            else if(road.peek()== 'L' && directions.charAt(i-1)=='S' && (i!=0)){
                col = col+1;
                road.pop();
            }
            else if(road.peek()=='S' && directions.charAt(i)=='L'){
                col = col+1;

            }
            else{
                road.push(directions.charAt(i));
            }


        }
        return col;
    }
}