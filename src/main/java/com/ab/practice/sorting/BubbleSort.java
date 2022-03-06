package com.ab.practice.sorting;

// Time = O(n2), Space = O(1)
public class BubbleSort implements SortInterface {
    public int[] sort(int[] array) {
        if (array == null || array.length <= 1) return array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    swap(array, i, j);
                }
            }
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
