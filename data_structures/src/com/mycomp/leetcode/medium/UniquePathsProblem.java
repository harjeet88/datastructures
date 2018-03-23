package com.mycomp.leetcode.medium;

import com.mycomp.leetcode.utils.NumberUtils;

/*
 * Get Number of Unique paths for Robot
 * https://leetcode.com/problems/unique-paths/description/
 * 1. recursive approach
 * 2. Math Based approach
 */
public class UniquePathsProblem {
	public static void main(String[] args) {
		int m=1;
		int n=3;
		System.out.println("Unique Paths : "+UniquePathsProblem.uniquePathsRecursive(m, n));
		//UniquePathsProblem.uniquePathsHelperRecursive(m-1,n-1);
		//System.out.println("Num Path : "+numPath);
		System.out.println(UniquePathsProblem.uniquePathsByPC(m, n));
	}
	static int numPath=0;
	public static int uniquePathsRecursive(int m, int n) {
		int uniquePaths=0;
		//System.out.println("m is : "+m);
		//System.out.println("n is : "+n);
		if(m==0 || n==0) {
			return 0;
		}
		
		if(m ==1 || n==1) {
			uniquePaths++;
			return uniquePaths;
		}else {
			uniquePaths=uniquePaths+uniquePathsRecursive(m-1,n);
			uniquePaths=uniquePaths+uniquePathsRecursive(m,n-1);
		}
		//System.out.println("uniquePaths : "+uniquePaths);
		//System.out.println("====================================");
		return uniquePaths;

	}
	
	
	
/*	private static void uniquePathsHelperRecursive(int m, int n) 
	  {
	    if(m==0 && n==0)
	    {
	      numPath++;
	      return;
	    }
	    if(m<0 || n<0)
	      return;
	    uniquePathsHelperRecursive(m-1,n);
	    uniquePathsHelperRecursive(m,n-1);
	    
	  }*/
	
	public static int  uniquePathsByPC(int m, int n) {
		
		return NumberUtils.getCombinations(m-1, n-1);
	}
}
