/*
    Given an array,
    har index i par 0 se i tak ka sum store karo.

    Example:

    arr = [2, 4, 6, 8]
    prefix = [2, 6, 12, 20]


        STEP 1: APPROACH (yeh sabse important hai)
        Khud se question poochho:
        👉 Index i ka answer kis par depend karta hai?
        👉 prefix[i] = arr[0] + arr[1] + ... + arr[i]

        Matlab:

        prefix[i-1] already sab kuch janta hai

        bas arr[i] add karna hai

        📌 Observation

        Current index ka answer = previous index ka answer + current value

        💥 Pattern mil gaya → PREFIX

        PREFIX

        🧩 STEP 2: TEMPLATE IDENTIFY

        Prefix ka fixed template:

        prefix[0] = arr[0];
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }


*/







package Prefix;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String [] args){

        int arr[] = {2, 4, 6, 8};;
        int n = arr.length;
        int prefix [] = new int[n];
        prefix[0] = arr[0];

        for(int i = 1 ; i < n ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
         System.out.println(Arrays.toString(prefix));
    }
    
}
