package com.mycomp.leetcode.medium;

public class MinimumEditDistance {
	public static void main(String[] args) {
		String word1="eat";
		String word2="sea";
		int lcs=getLCS(word1.toCharArray(),word2.toCharArray());
        System.out.println( word1.length()+word2.length()-2*lcs);
	}
	
	private static int getLCS(char[] str1, char[] str2) {
		int max=0;
		int temp[][]=new int[str1.length+1][str2.length+1];
		for(int i=1;i<temp.length;i++) {
			for(int j=1;j<temp[i].length;j++) {
				if(str1[i-1] == str2[j-1]) {
					temp[i][j]= temp[i-1][j-1]+1;
				}else {
					temp[i][j]=Math.max(temp[i][j-1], temp[i-1][j]);
				}
				if(temp[i][j]>max) {
					max=temp[i][j];
				}
			}
		}
        return max;
	}
}
