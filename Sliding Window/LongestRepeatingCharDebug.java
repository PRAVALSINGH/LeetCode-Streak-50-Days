import java.util.*;

public class LongestRepeatingCharDebug {

    public static int characterReplacement(String s, int k) {

        int left = 0;
        int maxLen = 0;
        int maxFreq = 0;

        int[] freq = new int[26];

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch - 'A']++;

            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            System.out.println("\n➡️ Right = " + right + ", Char = " + ch);
            System.out.println("Frequency Array = " + Arrays.toString(freq));
            System.out.println("Max Frequency = " + maxFreq);

            while ((right - left + 1) - maxFreq > k) {

                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;

                System.out.println("❌ Shrinking window, removing " + leftChar);

                left++;
            }

            int windowSize = right - left + 1;
            maxLen = Math.max(maxLen, windowSize);

            System.out.println("✅ Window [" + left + ", " + right + "]");
            System.out.println("Window Size = " + windowSize);
            System.out.println("Max So Far = " + maxLen);
        }

        return maxLen;
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        System.out.println("\n🎯 FINAL ANSWER = " +
            characterReplacement(s, k));
    }
}
