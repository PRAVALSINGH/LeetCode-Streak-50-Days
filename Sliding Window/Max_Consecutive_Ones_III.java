import java.util.*;

public class  Max_Consecutive_Ones_III {

    public static int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroCount++;
            }

            

            while (zeroCount > k) {

                
                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
                
            }

            int windowSize = right - left + 1;
            maxLen = Math.max(maxLen, windowSize);

            
        }

        return maxLen;
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        int[] nums = {0,1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println("\n🎯 FINAL ANSWER = " +
            longestOnes(nums, k));
    }
}