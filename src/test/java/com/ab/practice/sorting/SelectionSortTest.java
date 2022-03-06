package com.ab.practice.sorting;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SelectionSortTest extends SortingTestBase {
    public SelectionSortTest(int[] input, int[] expected) {
        super(new SelectionSort(), input, expected);
    }
}
