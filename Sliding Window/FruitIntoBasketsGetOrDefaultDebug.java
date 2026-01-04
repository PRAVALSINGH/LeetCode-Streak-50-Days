import java.util.*;

public class FruitIntoBasketsGetOrDefaultDebug {

    public static int totalFruit(int[] fruits) {

        int left = 0;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {

            System.out.println("\n➡️ Right = " + right + 
                               ", Current Fruit = " + fruits[right]);

            // 👇 getOrDefault ko alag variable me rakha
            int currentCount = map.getOrDefault(fruits[right], 0);

            System.out.println("getOrDefault(" + fruits[right] + 
                               ", 0) = " + currentCount);

            // 👇 ab +1 karke map me daal rahe hain
            map.put(fruits[right], currentCount + 1);

            System.out.println("After +1 → Map: " + map);

            // Shrinking window
            while (map.size() > 2) {

                System.out.println("❌ Map size > 2");

                int leftFruit = fruits[left];
                int leftCount = map.get(leftFruit);

                System.out.println("Left Fruit = " + leftFruit +
                                   ", Current Count = " + leftCount);

                map.put(leftFruit, leftCount - 1);
                System.out.println("After -1 → Map: " + map);

                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                    System.out.println("Count 0 ho gaya → Removed " + leftFruit);
                }

                left++;
                System.out.println("Left moved to " + left);
            }

            int windowSize = right - left + 1;
            maxLen = Math.max(maxLen, windowSize);

            System.out.println("✅ Window [" + left + ", " + right + 
                               "] Size = " + windowSize);
        }

        return maxLen;
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        int[] fruits = {1, 2, 3, 2, 2};

        int result = totalFruit(fruits);

        System.out.println("\n🎯 FINAL ANSWER = " + result);
    }
}
