/*

arr = [5, 3, 8, 6, 2]
prefixMax = [5, 5, 8, 8, 8]


*/


package Prefix;

import java.util.Arrays;

public class PrefixMax {

    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 6, 2};
        int n = arr.length;
        int prefix [] = new int[n];
        prefix[0] = arr[0];

        for(int i = 1 ; i < n ; i++){
            prefix[i] = Math.max(prefix[i-1],arr[i]);
        }

         System.out.println(Arrays.toString(prefix));

    }
    
}
