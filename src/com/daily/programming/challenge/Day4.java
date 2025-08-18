package com.daily.programming.challenge;

import java.util.*;

public class Day4 {
    private static int nextGap(int gap) {
        return (gap <= 1) ? 0 : (gap / 2) + (gap % 2);
    }

    public static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int gap = m + n;

        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            int i, j;

            for (i = 0; i + gap < m; i++)
                if (arr1[i] > arr1[i + gap]) swap(arr1, i, arr1, i + gap);

            for (j = (gap > m ? gap - m : 0); i < m && j < n; i++, j++)
                if (arr1[i] > arr2[j]) swap(arr1, i, arr2, j);

            for (j = 0; j + gap < n; j++)
                if (arr2[j] > arr2[j + gap]) swap(arr2, j, arr2, j + gap);
        }
    }

    private static void swap(int[] a1, int i, int[] a2, int j) {
        int temp = a1[i]; a1[i] = a2[j]; a2[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        merge(arr1, arr2);

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
