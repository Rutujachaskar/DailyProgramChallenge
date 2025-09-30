package com.daily.programming.challenge;

import java.util.*;

public class Union_Intersection {

	public static void main(String[] args) {
		int arr1[]= {4,5,2,1};
		int arr2[]= {1,2,3,4,4};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		System.out.println("Union "+ set.size());
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		set.clear();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		int count=0;
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
				count++;
				System.out.print(arr2[i]);
				set.remove(arr2[i]);
			}
		}
		System.out.println();
		System.out.println("Intersection "+count);
		

	}

}
