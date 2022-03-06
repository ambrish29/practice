package com.ab.practice.sorting;

import java.util.Arrays;

public class MergeSort2 implements SortInterface {
    public int[] sort(int[] array) {
        if (array == null || array.length <= 1) return array;

        performMerge(array, 0, array.length);

        return array;
    }

    private void performMerge(int[] array, int start, int end) {
        if (end - start <= 1) return;

        int mid = (start + end) / 2;
        performMerge(array, start, mid);
        performMerge(array, mid, end);

        merge(array, start, mid, end);
    }

    private void merge(int[] array, int start, int mid, int end) {
        int[] left = Arrays.copyOfRange(array, start, mid);
        int[] right = Arrays.copyOfRange(array, mid, end);

        int lIndex = 0;
        int rIndex = 0;
        int resIndex = start;

        while (lIndex < left.length && rIndex < right.length) {
            if (left[lIndex] <= right[rIndex]) {
                array[resIndex++] = left[lIndex++];
            } else {
                array[resIndex++] = right[rIndex++];
            }
        }

        while (lIndex < left.length) {
            array[resIndex++] = left[lIndex++];
        }

        while (rIndex < right.length) {
            array[resIndex++] = right[rIndex++];
        }
    }

    public String name() {
        return "Merge Sort 2";
    }

    @Override
    public String timeComplexity() {
        return "Time Complexity: O(nlog(n))";
    }

    @Override
    public String spaceComplexity() {
        return "Space Complexity: O(n)";
    }
}
