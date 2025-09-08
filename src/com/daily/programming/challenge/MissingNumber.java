package com.daily.programming.challenge;

public class MissingNumber {
	public static int printmissing(int arr[]) {
		int n_xor=arr.length;
		for(int i=0;i<arr.length;i++) {
			n_xor=n_xor^i;
			n_xor=n_xor^arr[i];
		}
		return n_xor;
	}

	public static void main(String[] args) {
		int arr[]= {3,0,1};
		System.out.println(printmissing(arr));

	}

}
