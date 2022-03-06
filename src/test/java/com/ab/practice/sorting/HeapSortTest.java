package com.ab.practice.sorting;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class HeapSortTest extends SortingTestBase {
    public HeapSortTest(int[] input, int[] expected) {
        super(new HeapSort(), input, expected);
    }
}
