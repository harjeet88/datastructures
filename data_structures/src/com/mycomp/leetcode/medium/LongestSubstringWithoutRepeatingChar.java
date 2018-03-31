package com.mycomp.leetcode.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * @author harjeet
 * Given a string, find the length of the longest substring without repeating characters.
Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWithoutRepeatingChar {
	public static void main(String[] args) {
		String input="abcabcdbb";
		String out=getsolution(input);
	}

	private static String getsolution(String input) {
		String out="";
		int max=0;
		int left=0,maxLeft=0;
		int right=0,maxRight=0;
		Set<Character> seen=new HashSet<Character>();
		for(int i=0;i<input.length();i++) {
			if(!seen.contains(input.charAt(i))) {
				seen.add(input.charAt(i));
				right++;
				if(right-left > max) {
					max=right-left;
					maxLeft=left;
					maxRight=right;
				}
				
			}else {
				left++;
			}
		}
		out=input.substring(maxLeft, maxRight+1);
		System.out.println(out);
		return out;
	}
}
