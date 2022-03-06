package com.ab.practice.sorting;

import java.util.Arrays;

public class MergeSort1 implements SortInterface {
    public int[] sort(int[] array) {
        if (array == null || array.length <= 1) return array;

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(sort(left), sort(right));
    }

    private int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int lIndex = 0;
        int rIndex = 0;
        int resIndex = 0;

        while (lIndex < left.length && rIndex < right.length) {
            if (left[lIndex] < right[rIndex]) {
                res[resIndex++] = left[lIndex++];
            } else {
                res[resIndex++] = right[rIndex++];
            }
        }

        while (lIndex < left.length) {
            res[resIndex++] = left[lIndex++];
        }

        while (rIndex < right.length) {
            res[resIndex++] = right[rIndex++];
        }

        return res;
    }

    public String name() {
        return "Merge Sort 1";
    }

    @Override
    public String timeComplexity() {
        return "Time Complexity: O(nlog(n))";
    }

    @Override
    public String spaceComplexity() {
        return "Space Complexity: O(nlog(n))";
    }
}
