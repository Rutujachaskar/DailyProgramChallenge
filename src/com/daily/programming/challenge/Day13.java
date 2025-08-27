package com.daily.programming.challenge;

public class Day13{

    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";

        boolean[] dp = new boolean[n];  
        int start = 0, maxLen = 1;

        for (int i = n - 1; i >= 0; i--) {  
            for (int j = n - 1; j >= i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 3) {
                        dp[j] = true;  // length 1 or 2
                    } else {
                        dp[j] = dp[j - 1];  
                    }
                } else {
                    dp[j] = false;
                }

                if (dp[j] && (j - i + 1 > maxLen)) {
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    // Test
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // bab (or aba)
        System.out.println(longestPalindrome("cbbd"));  // bb
        System.out.println(longestPalindrome("a"));     // a
        System.out.println(longestPalindrome("aaaa"));  // aaaa
        System.out.println(longestPalindrome("abc"));   // a
    }
}
