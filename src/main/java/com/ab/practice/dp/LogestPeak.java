package com.ab.practice.dp;

public class LogestPeak {
    public static int longestPeak(int[] array) {
        // Write your code here.
        int longestPeak = 0;
        int i = 1;
        while (i < array.length - 1) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                // Found peak.
                int lIndex = i - 2;
                int rIndex = i + 2;

                // Left side
                while (lIndex >= 0 && array[lIndex] < array[lIndex + 1]) {
                    lIndex--;
                }

                // Right side
                while (rIndex < array.length && array[rIndex - 1] > array[rIndex]) {
                    rIndex++;
                }

                longestPeak = Math.max(longestPeak, rIndex - lIndex - 1);
                i = rIndex - 1;
            } else {
                i++;
            }
        }

        return longestPeak;
    }

    public static void main(String[] args) {
        int[] case1 = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(LogestPeak.longestPeak(case1));
    }
}
