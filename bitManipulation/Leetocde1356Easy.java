package bitManipulation;

import java.util.Arrays;

public class Leetocde1356Easy {
     public static int[] sortByBits(int[] arr) {
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(boxed, (a, b) -> {
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);
            
            if (bitA == bitB) {
                return a - b;   // sort by value if bit count same
            }
            return bitA - bitB; // sort by bit count
        });
        
        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
}
