package com.ab.practice.dp;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'runningMedian' function below.
     *
     * The function is expected to return a DOUBLE_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    private static MyHeap minHeapRight;
    private static MyHeap maxHeapLeft;
    public static List<Double> runningMedian(List<Integer> a) {
        // Write your code here
        int size = a.size();
        minHeapRight = new MyHeap(size / 2 + 1);
        maxHeapLeft = new MyHeap(size / 2 + 1, true);

        List<Double> res = new ArrayList<>();

        for (int i : a) {
            int left = maxHeapLeft.peek();

            if (left >= i) {
                maxHeapLeft.add(i);
            } else {
                minHeapRight.add(i);
            }

            if (maxHeapLeft.currentSize() - minHeapRight.currentSize() > 1) {
                minHeapRight.add(maxHeapLeft.remove());
            } else if (minHeapRight.currentSize() - maxHeapLeft.currentSize() > 0) {
                maxHeapLeft.add(minHeapRight.remove());
            }

            if (maxHeapLeft.currentSize() == minHeapRight.currentSize()) {
                double med = (maxHeapLeft.peek() + minHeapRight.peek()) / 2.0;
                res.add(med);
            } else {
                res.add(maxHeapLeft.peek() * 1.0);
            }
            maxHeapLeft.print();
            minHeapRight.print();
        }

        return res;
    }

}

class MyHeap {
    private int[] heap;
    private int size;
    private boolean isMax = false;

    public MyHeap(int capacity) {
        this(capacity, false);
    }

    public MyHeap(int capacity, boolean isMax) {
        this.heap = new int[capacity];
        this.size = 0;
        this.isMax = isMax;
    }

    public void add(int a) {
        this.heap[size] = a;
        heapifyUp(size);
        size++;
    }

    public int remove() {
        int value = this.heap[0];
        this.heap[0] = this.heap[--size];
        heapifyDown(0);
        return value;
    }

    public int peek() {
        return this.heap[0];
    }

    public int currentSize() {
        return this.size;
    }

    public void print() {
        System.out.println(Arrays.toString(heap));
    }

    private int getLeftChildIndex(int index) {
        return index * 2 + 1;
    }

    private int getRightChildIndex(int index) {
        return index * 2 + 2;
    }

    private int getParentIndex(int index) {
        if ((index & 1) == 0) {
            return index / 2 - 1;
        }
        return (index - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) <= size;
    }

    private boolean hasRightChildIndex(int index) {
        return getRightChildIndex(index) <= size;
    }

    private void swap(int a, int b) {
        int temp = this.heap[a];
        this.heap[a] = this.heap[b];
        this.heap[b] = temp;
    }

    private void heapifyUp(int index) {
        int parent = getParentIndex(index);
        if (parent < 0) {
            return;
        }

        if (isMax) {
            if (this.heap[index] > this.heap[parent]) {
                swap(index, parent);
                heapifyUp(parent);
            }
        } else if (this.heap[index] < this.heap[parent]) {
            swap(index, parent);
            heapifyUp(parent);
        }
    }

    private void heapifyDown(int index) {
        if (!hasLeftChild(index)) return;

        int impactedChild = getLeftChildIndex(index);
        if (hasRightChildIndex(index)) {
            int rightChild = getRightChildIndex(index);
            if (isMax) {
                if (this.heap[rightChild] > this.heap[impactedChild]) {
                    impactedChild = rightChild;
                }
            } else if (this.heap[rightChild] < this.heap[impactedChild]) {
                impactedChild = rightChild;
            }
        }

        if (isMax) {
            if (this.heap[index] < this.heap[impactedChild]) {
                swap(index, impactedChild);
                heapifyDown(impactedChild);
            }
        } else if (this.heap[index] > this.heap[impactedChild]) {
            swap(index, impactedChild);
            heapifyDown(impactedChild);
        }
    }
}

public class RunningMedian {
    public static void main(String[] args) throws IOException {
        List<Integer> a = new ArrayList<>();

        for (int i = 1;i < 11;i++) {
            a.add(i);
        }

        List<Double> result = Result.runningMedian(a);

        for (double d : result) {
            System.out.println(d);
        }
    }
}
