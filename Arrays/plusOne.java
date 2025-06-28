import java.util.Vector;

class plusOne {
    Vector<Integer> addOne(int[] arr) {
        Vector<Integer> result = new Vector<>();
        int n = arr.length;

        // Start from the end
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                // Copy result to vector and return
                for (int num : arr) {
                    result.add(num);
                }
                return result;
            }
            arr[i] = 0;  // Carry over
        }

        // If all digits were 9 (e.g. 999 → 1000)
        result.add(1);
        for (int i = 0; i < n; i++) {
            result.add(0);
        }
        return result;
    }
}
