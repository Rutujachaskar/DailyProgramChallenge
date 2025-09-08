package com.daily.programming.challenge;

public class RemoveDuplicates {
	public static int removeduplicate(int nums[]) {
		int i=0;
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]<nums[j]) {
				i++;
			}
		}
		return i;
	}

	public static void main(String args[]) {
		int nums[]= {0,1,1,1,2,2,3};
		System.out.println(removeduplicate(nums));
		

}}
