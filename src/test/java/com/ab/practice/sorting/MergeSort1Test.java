package com.ab.practice.sorting;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MergeSort1Test extends SortingTestBase {
    public MergeSort1Test(int[] input, int[] expected) {
        super(new MergeSort1(), input, expected);
    }
}
