package com.daily.programming.challenge;

import java.util.Scanner;

public class Day3 {

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (n+1): ");
        int size = sc.nextInt();  

        int[] arr = new int[size]; 
        System.out.println("Enter " + size + " elements (numbers in range [1, " + (size - 1) + "]): ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicate = findDuplicate(arr);
        System.out.println("Duplicate number: " + duplicate);

        sc.close();
    }
}
