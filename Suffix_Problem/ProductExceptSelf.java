package Suffix_Problem;

import java.util.*;

public class ProductExceptSelf {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];

        // PREFIX PRODUCT
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i];
        }

        // SUFFIX PRODUCT
        suffix[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i];
        }

        // COMBINE
        for(int i = 0; i < n; i++) {
            if(i == 0)
                ans[i] = suffix[i + 1];
            else if(i == n - 1)
                ans[i] = prefix[i - 1];
            else
                ans[i] = prefix[i - 1] * suffix[i + 1];
        }

        System.out.println(Arrays.toString(ans));
    }
}

