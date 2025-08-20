package com.daily.programming.challenge;

public class Day6 {
	public static void subarraysum(int numbers[],int tar) {
		int currsum=0;
		int prefix[]=new int[numbers.length];
		prefix[0]=numbers[0];
		
		for(int i=1;i<prefix.length;i++) {
			prefix[i]=prefix[i-1]+numbers[i];
		}
		
		for(int i=0;i<numbers.length;i++) {
			int start=i;
			for(int j=i;j<numbers.length;j++) {
				int end=j;
				currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
				if(currsum==tar) {
					System.out.print(start+","+end);
				}
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int numbers[]={1, 2, -3, 3, -1, 2};
		int target=0;
		subarraysum(numbers,target);
		

	}
}
