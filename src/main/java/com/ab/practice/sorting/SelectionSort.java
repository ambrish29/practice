package com.ab.practice.sorting;

public class SelectionSort implements SortInterface {
    public int[] sort(int[] array) {
        if (array == null || array.length <= 1) return array;

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    public String name() {
        return "Selection Sort";
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
