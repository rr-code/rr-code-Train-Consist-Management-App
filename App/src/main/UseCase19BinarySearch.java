package main;

import java.util.Arrays;

public class UseCase19BinarySearch {

    public static boolean binarySearch(String[] arr, String key) {

        // Ensure array is sorted
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) {
                return true; // found
            }
            else if (cmp < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogies = {
                "BG309","BG101","BG550","BG205","BG412"
        };

        String key = "BG205";

        boolean found = binarySearch(bogies, key);

        System.out.println("Bogie Found: " + found);
    }
}
