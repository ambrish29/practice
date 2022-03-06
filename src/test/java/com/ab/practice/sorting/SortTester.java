package com.ab.practice.sorting;

import java.util.Arrays;

public class SortTester {
    private static final int[] CASE_1 = new int[]{2, 5, 1, 4, 8, 9, 3, 6, 7, 10};
    private static final int[] CASE_2 = new int[0];
    private static final int[] CASE_3 = new int[]{1};
    private static final int[] CASE_4 = new int[]{2, 5, 1, 4, 8, 9, 3, 6, 7, 10, 4, 5, 7};
    private static final int[] CASE_5 = null;
    private static final int[] CASE_6 = new int[]{1, 2, 3, 4, 5};


    public static void main(String[] args) {
//        SortTester.sortExecutor(new BubbleSort());
//        SortTester.sortExecutor(new SelectionSort());
//        SortTester.sortExecutor(new InsertionSort());
        SortTester.sortExecutor(new QuickSort());
//        SortTester.sortExecutor(new MergeSort1());
//        SortTester.sortExecutor(new MergeSort2());
//        SortTester.sortExecutor(new HeapSort());
    }

    private static void sortExecutor(SortInterface si) {
        System.out.println(si.name());
        System.out.println(si.timeComplexity());
        System.out.println(si.spaceComplexity());
        System.out.println(Arrays.toString(si.sort(CASE_1.clone())));
        System.out.println(Arrays.toString(si.sort(CASE_2.clone())));
        System.out.println(Arrays.toString(si.sort(CASE_3.clone())));
        System.out.println(Arrays.toString(si.sort(CASE_4.clone())));
        System.out.println(Arrays.toString(si.sort(CASE_5)));
        System.out.println(Arrays.toString(si.sort(CASE_6.clone())));
    }
}
