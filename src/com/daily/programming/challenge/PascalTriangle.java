package com.daily.programming.challenge;

public class PascalTriangle {
	public static void printpascal(int arr[][],int n) {
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<=i;j++) {
				if(j==0||i==j) {
					arr[i][j]=1;
				}else {
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=5;
		int arr[][]=new int[n][n];
		printpascal(arr,n);

	}

}
