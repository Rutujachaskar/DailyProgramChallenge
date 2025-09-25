package com.daily.programming.challenge;

public class HeapSort {
	public static void heapify(int i, int arr[],int size) {
		int left=2*i+1;
		int right=2*i+2;
		int maxIdx=i;
		
		if(left<size && arr[left]>arr[maxIdx]) {
			maxIdx=left;
		}
		if(right<size && arr[right]>arr[maxIdx]) {
			maxIdx=right;
		}
		if(maxIdx!=i) {
			int temp=arr[i];
			arr[i]=arr[maxIdx];
			arr[maxIdx]=temp;
			
			heapify(maxIdx,arr,size);
		}
		
	}
	public static void heapSort(int arr[]) {
		int n=arr.length;
		//build max heap
		for(int i=n/2;i>=0;i--) {
			heapify(i,arr,n);
		}
		
		//push largest at end - swap first and last
		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			heapify(0,arr,i);
		}
		
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,3};
		heapSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}
		

}
}
