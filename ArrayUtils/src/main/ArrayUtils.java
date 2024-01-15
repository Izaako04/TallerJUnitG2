package main;

public class ArrayUtils {

    public int findMax(int[] array) {
        // Check if the array is not empty
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        // Initialize max with the first element of the array
        int max = array[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // Update max if the current element is greater
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}

