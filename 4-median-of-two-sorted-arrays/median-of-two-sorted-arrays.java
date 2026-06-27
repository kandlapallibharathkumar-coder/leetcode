import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;// calculating the lengths of both arrays
        int m = nums2.length;

        // Merge the arrays into a single sorted array.
        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i];
        }

        // Sort the merged array.
        Arrays.sort(merged);

        // Calculate the total number of elements in the merged array.
        int totallength = merged.length;

        if (totallength % 2 == 1) {
            // If the total number of elements is odd, return the middle element as the median.
            return (double) merged[totallength / 2];
        } else {
            // If the total number of elements is even,
            // calculate the average of the two middle elements as the median.
            int middle1 = merged[totallength / 2 - 1];
            int middle2 = merged[totallength / 2];
            return ((double) middle1 + (double) middle2) / 2.0;// This prints the value if the total number of elements is even
        }
    }
}