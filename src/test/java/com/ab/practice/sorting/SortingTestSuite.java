package com.ab.practice.sorting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({
        BubbleSortTest.class,
        MergeSort1Test.class,
        MergeSort2Test.class,
        HeapSortTest.class,
        InsertionSortTest.class,
        QuickSortTest.class,
        SelectionSortTest.class
})

public class SortingTestSuite {

}
