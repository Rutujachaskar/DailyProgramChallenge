package com.daily.programming.challenge;

import java.util.*;

public class Day10 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int num : count) {
                keyBuilder.append('#').append(num);
            }
            String key = keyBuilder.toString();

            // Add string to the correct group
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs1));

        String[] strs2 = {""};
        System.out.println(groupAnagrams(strs2));

        String[] strs3 = {"a"};
        System.out.println(groupAnagrams(strs3));

        String[] strs4 = {"abc", "bca", "cab", "xyz", "zyx", "yxz"};
        System.out.println(groupAnagrams(strs4));

        String[] strs5 = {"abc", "def", "ghi"};
        System.out.println(groupAnagrams(strs5));
    }
}
