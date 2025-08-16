package com.daily.programming.challenge;

import java.util.Scanner;

public class Day2 {

    public static int findMissingNumber(int[] arr) {
        int i = 0;
        int n = arr.length + 1;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < n && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // missing number
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n; // no mismatch
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (n-1): ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements (distinct numbers from 1 to n): ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = findMissingNumber(arr);
        System.out.println("Missing number: " + missing);

    }
}
