package com.daily.programming.challenge;

class Day9 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return lcpRecursive(strs, 0, strs[0]);
    }

    private String lcpRecursive(String[] strs, int index, String prefix) {
        if (index == strs.length) return prefix;  
        prefix = commonPrefix(prefix, strs[index]);
        if (prefix.isEmpty()) return "";
        return lcpRecursive(strs, index + 1, prefix);
    }

    private String commonPrefix(String s1, String s2) {
        int minLen = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1.substring(0, minLen);
    }
    
    public static void main(String args[]) {
    	String strs[]= {"flower","flow","flight"};
    	Day9 obj=new Day9();
    	System.out.println(obj.longestCommonPrefix(strs)) ;
    }
}
