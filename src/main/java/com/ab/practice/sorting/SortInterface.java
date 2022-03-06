package com.ab.practice.sorting;

public interface SortInterface {
    int[] sort(int[] array);

    String name();

    String timeComplexity();

    String spaceComplexity();

    default void swap(int[] array, int i, int j)  {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
