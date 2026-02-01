/*
arr = [2, 4, 6, 8]
o/p = [8, 8, 8, 8]


*/

package Suffix_Problem;
import java.util.Arrays;
public class SuffixMax {
    public static void main(String[] args) {
        int  arr[] = {2, 4, 6, 8};
        int n = arr.length;
        int suffixMax[] = new int [n];
         suffixMax[n-1] = arr[n-1];

         for(int i = n -2 ; i >=0 ; i--){
            suffixMax[i] = Math.max(suffixMax[i+1], arr[i]);
         }
         System.out.println(Arrays.toString(suffixMax));
    }
}
