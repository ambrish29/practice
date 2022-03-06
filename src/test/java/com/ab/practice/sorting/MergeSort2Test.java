package com.ab.practice.sorting;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MergeSort2Test extends SortingTestBase {
    public MergeSort2Test(int[] input, int[] expected) {
        super(new MergeSort2(), input, expected);
    }
}
