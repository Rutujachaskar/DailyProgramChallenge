package com.daily.programming.challenge;

import java.util.*;

public class Day11 {
    public static List<String> permutation(String s) {
        Set<String> result = new HashSet<>(); 
        backtrack("", s, result);
        return new ArrayList<>(result); 
    }

    private static void backtrack(String prefix, String remaining, Set<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix); 
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char ch = remaining.charAt(i);
            String next = remaining.substring(0, i) + remaining.substring(i + 1);
            backtrack(prefix + ch, next, result);
        }
    }

    public static void main(String[] args) {
        System.out.println(permutation("abc"));  
        System.out.println(permutation("aab")); 
        System.out.println(permutation("aaa"));  
        System.out.println(permutation("a"));   
        System.out.println(permutation("abcd").size()); 
    }
}
