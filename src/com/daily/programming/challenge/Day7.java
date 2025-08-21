package com.daily.programming.challenge;
import java.util.*;
public class Day7 {
	
	public static int trappedRainwater(int heights[]) {
		int n=heights.length;
		int trappedWater=0;
		int leftmax[]=new int[heights.length];
		int rightmax[]=new int[heights.length];
		leftmax[0]=heights[0];
		for(int i=1;i<n;i++) {
			leftmax[i]=Math.max(leftmax[i-1],heights[i]);
		}
		rightmax[n-1]=heights[n-1];
		for(int i=n-2;i>=0;i--) {
			rightmax[i]=Math.max(rightmax[i+1], heights[i]);
		}
		for(int i=0;i<n;i++) {
			trappedWater+=Math.min(leftmax[i], rightmax[i])-heights[i];
		}
		return trappedWater;
	}

	public static void main(String[] args) {
		System.out.println("Enter the length of bars to trap water: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int heights[]=new int[n];
		System.out.println("Enter bar heights: ");
		for(int i=0;i<n;i++) {
			heights[i]=sc.nextInt();
		}
		
		System.out.println("The trapped rainwater is : ");
		System.out.println(trappedRainwater(heights));
		

	}

}
