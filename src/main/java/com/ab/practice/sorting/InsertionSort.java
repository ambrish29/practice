package com.ab.practice.sorting;

public class InsertionSort implements SortInterface {
    public int[] sort(int[] array) {
        if (array == null || array.length <= 1) return array;

        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i;
            while (j > 0) {
                if (element < array[j - 1]) {
                    array[j] = array[j - 1];
                } else {
                    break;
                }
                j--;
            }
            array[j] = element;
        }
        return array;
    }

    public String name() {
        return "Bubble Sort";
    }

    @Override
    public String timeComplexity() {
        return "Time Complexity: O(n2)";
    }

    @Override
    public String spaceComplexity() {
        return "Space Complexity: O(1)";
    }
}
