package com.mycomp.leetcode.utils;

public class NumberUtils {
	public static int getFactorial(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*getFactorial(n-1);
		}
	}
	
	public static int getCombinations(int n, int r) {
		//Combination(N, k) = n! / (k!(n - k)!)
		int fact= getPartialfact(n, r)/(getFactorial(r));
		return fact;
	}
	
	public static int getPartialfact(int n, int k) {
		if(n==1 || n < 1) {
			return 1;
		}else if((n-k) == 1) {
			return n;
		}else {
			return n*getPartialfact(n-1, k);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getCombinations(5, 2));
		
	}
	public static void printArray(int[] m) {
		for(int i=0;i<m.length;i++) {
			System.out.print(m[i]);
			System.out.print(" ,");
		}
	}
}
