import java.util.*;
public class Functions {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int add(int a, int b,int c) {
        return (a + b + c)/3;
    }
    public static boolean palindrome(int n){
        int num = 0;
        int org = n;
        while(n>0){
            int temp = n%10;
            num = num*10+temp;
            n/=10;
        }
        return num==org;
    }
    public static void main(String[] args) {
        float n = 121.456f;
        int m = -100;
        int a = 12345;
        System.out.println(SumOfDigits(a));
        // System.out.println(palindrome(n));
    }
    public static int SumOfDigits(int n){
        int sum = 0;
        int org = n;
        while(n>0){
            int temp = n%10;
            sum += temp;
            n/=10;
        }
        return sum;
    }


}