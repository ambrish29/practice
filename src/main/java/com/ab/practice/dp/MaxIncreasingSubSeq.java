package com.ab.practice.dp;

import java.util.*;

public class MaxIncreasingSubSeq {
    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
        // Write your code here.
        int maxSumEndIndex = 0;

        int[] sum = array.clone();
        int[] seq = new int[array.length];
        Arrays.fill(seq, Integer.MIN_VALUE);

        for (int i = 0;i < array.length;i++) {
            int curr = array[i];
            for (int j = 0;j < i;j++) {
                int other = array[j];
                if (curr > other && sum[i] <= sum[j] + curr) {
                    sum[i] = sum[j] + curr;
                    seq[i] = j;
                }
            }

            if (sum[i] >= sum[maxSumEndIndex]) {
                maxSumEndIndex = i;
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());

        res.get(0).add(sum[maxSumEndIndex]);

        while (maxSumEndIndex >= 0) {
            res.get(1).add(0, array[maxSumEndIndex]);
            maxSumEndIndex = seq[maxSumEndIndex];
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(MaxIncreasingSubSeq.maxSumIncreasingSubsequence(new int[] {-1, 0 ,2,3,4,5}));
    }
}
