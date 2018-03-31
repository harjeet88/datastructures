package com.mycomp.leetcode.medium;

import com.mycomp.leetcode.utils.NumberUtils;

public class LongestpalindromeSubstring {
	public static void main(String[] args) {
		String input = "baabbcbbadd";
		if (input.length() == 0) {
			System.out.println("No/Empty String given ");
			;
		} else {
			//char[] in = input.toCharArray();
			int max = getLongestPalindrome(input);
			System.out.println(max);
		}

	}

	private static int getLongestPalindrome(String in) {
		if(in.length()==0) {
			return 0;
		}
		
		boolean[][] isPalin=new boolean[in.length()][in.length()];
		int left=0;
		int right=0;
		for(int j=1;j<in.length();j++) {
			System.out.println("next pass");
			for(int i=0;i<j;i++) {
				
				boolean innerPalin=isPalin[i+1][j-1] || ((j-i)<=2);
				System.out.print(i+" : "+j+" Checking : "+in.substring(i,j+1));
				System.out.println(" : "+(in.charAt(i)==in.charAt(j) && innerPalin));
				if(in.charAt(i)==in.charAt(j) && innerPalin) {
					isPalin[i][j]=true;
					if(j-i > right-left) {
						left=i;
						right=j;
					}
				}
				//NumberUtils.print2dBooleanArray(isPalin);
				System.out.println("=================================");
			}
		}
		System.out.println(in.substring(left, right+1));
		return right-left+1;
	}
}
