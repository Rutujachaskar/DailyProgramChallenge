package com.daily.programming.challenge;

import java.util.*;

public class Hashing {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("India", 500);
		hm.put("USA", 200);
		hm.put("Brazil", 50);
		hm.put("Indonesia", 10);
		System.out.println(hm.get("USA"));
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println(hm.keySet());
		
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
		lhm.put("India", 500);
		lhm.put("USA", 200);
		lhm.put("Brazil", 50);
		lhm.put("Indonesia", 10);
		System.out.println(lhm.get("USA"));
		System.out.println(lhm.containsKey("India"));
		System.out.println(lhm);
		
		TreeMap<String,Integer>tm=new TreeMap<>();
		tm.put("India", 500);
		tm.put("USA", 200);
		tm.put("Brazil", 50);
		tm.put("Indonesia", 10);
		System.out.println(tm);

	}

}
