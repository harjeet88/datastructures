package com.mycomp.leetcode.medium;

import com.mycomp.leetcode.utils.NumberUtils;

public class UniquePathsWithObstacle {
	public static void main(String[] args) {
		int[][] obstacleGrid={{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		System.out.println(getUniquePaths(obstacleGrid));
	}

	private static int getUniquePaths(int[][] obstacleGrid) {
		
	    int width = obstacleGrid[0].length;
	    int[] dp = new int[width];
	    NumberUtils.printArray(dp);
	    System.out.println();
	    dp[0] = 1;
	    for (int[] row : obstacleGrid) {
	    	System.out.println("Row is : ");
	    	NumberUtils.printArray(row);
	        for (int j = 0; j < width; j++) {
	            if (row[j] == 1)
	                dp[j] = 0;
	            else if (j > 0)
	                dp[j] += dp[j - 1];
	            System.out.println("j is : "+j);
	            System.out.println("dp[j] is : "+dp[j]);
	           
	            System.out.println("===================================");
	        }
	        System.out.println("dp array is ");
            NumberUtils.printArray(dp);
            System.out.println();
	        System.out.println("====================================");
	    }
	    return dp[width - 1];
	}
}
