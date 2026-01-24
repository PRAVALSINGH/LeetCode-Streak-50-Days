import java.util.*;

public class NextGreaterElementDebug {

    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        // Step 1: Default answer = -1
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>(); // stack stores INDEX

        System.out.println("Initial Array: " + Arrays.toString(arr));
        System.out.println("------------------------------------------------");

        // Step 2: Traverse array
        for (int i = 0; i < n; i++) {

            System.out.println("\nCurrent index: " + i + ", value: " + arr[i]);

            // Step 3: Pop smaller elements
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {

                int idx = st.pop();
                ans[idx] = arr[i];

                System.out.println(
                    "  Pop index " + idx +
                    " (value " + arr[idx] + ")" +
                    " -> Next Greater = " + arr[i]
                );
            }

            // Step 4: Push current index
            st.push(i);
            System.out.println("  Push index " + i + " into stack");

            // Debug stack content
            System.out.print("  Stack (indexes): ");
            System.out.print(st);

            System.out.print(" | Stack (values): [");
            for (int index : st) {
                System.out.print(arr[index] + " ");
            }
            System.out.println("]");
        }

        System.out.println("\n------------------------------------------------");
        System.out.println("Final Answer Array: " + Arrays.toString(ans));

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 25};

        int[] result = nextGreaterElement(arr);

        System.out.println("\nReturned Result: " + Arrays.toString(result));
    }
}
