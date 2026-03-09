class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        if (arr == null || arr.length < 3) {
            return false;
        }

        for (int i = 0; i < arr.length - 2; i++) {
            // Corrected squaring: arr[i] * arr[i]
            if ((arr[i] * arr[i] + arr[i + 1] * arr[i + 1]) == (arr[i + 2] * arr[i + 2])) {
                return true;
            }
        }
        return false; // If no triplet found
    }
}
