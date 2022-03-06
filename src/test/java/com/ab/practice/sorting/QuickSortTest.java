package com.ab.practice.sorting;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class QuickSortTest extends SortingTestBase {
    public QuickSortTest(int[] input, int[] expected) {
        super(new QuickSort(), input, expected);
    }
}
