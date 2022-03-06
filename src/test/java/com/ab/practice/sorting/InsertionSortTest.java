package com.ab.practice.sorting;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class InsertionSortTest extends SortingTestBase {
    public InsertionSortTest(int[] input, int[] expected) {
        super(new InsertionSort(), input, expected);
    }
}
