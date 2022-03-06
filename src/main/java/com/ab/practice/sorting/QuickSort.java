package com.ab.practice.sorting;

public class QuickSort implements SortInterface {
    public int[] sort(int[] array) {
        if (array == null || array.length < 2) return array;

        sort(array, 0,array.length - 1);

        return array;
    }

    public void sort(int[] arr, int low, int high){
        if(low < high) {
            int p = partition(arr, low, high);
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
    }

    private int partition(int[] arr, int low, int high){
        int p = low;
        for(int j = low + 1; j <= high; j++)
            if(arr[j] < arr[low])
                swap(arr, ++p, j);

        swap(arr, low, p);
        return p;
    }

    public String name() {
        return "Quick Sort";
    }

    @Override
    public String timeComplexity() {
        return "Time Complexity: O(nlog(n))";
    }

    @Override
    public String spaceComplexity() {
        return "Space Complexity: O(log(n))";
    }
}
