package com.daily.programming.challenge;

public class Day14 {
	public static void mergeSorted(int n1[],int n2[],int m,int n) {
		int x=m+n-1;
		int i=m-1;
		int j=n-1;
		while(i>=0 && j>=0) {
			if(n1[i]>n2[j]) {
				n1[x]=n1[i];
				x--;
				i--;
			}else {
				n1[x]=n2[j];
				x--;
				j--;
			}
		}
		while(j>=0) {
			n1[x]=n2[j];
			x--;
			j--;
		}
		for (int k=0;k<n1.length;k++) {
			System.out.println(n1[k]+" ");
		}
		
	}
	public static void main(String args[]) {
		int n1[]= {1,2,3,0,0,0};
		int n2[]= {2,5,6};
		int m=3;
		int n=3;
		mergeSorted(n1,n2,m,n);
	}

}
