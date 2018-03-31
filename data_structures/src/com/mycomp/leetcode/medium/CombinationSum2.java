package com.mycomp.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum-ii/description/
 * @author harjeet
 *Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
Each number in C may only be used once in the combination.
Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8, 
A solution set is: 
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
 */
public class CombinationSum2 {
	public static void main(String[] args) {
		int target=5;
	    int[] input= {10, 1, 2, 7, 6, 1, 5};
	    
		if( input == null || input.length == 0) {
			System.out.println("Invalid Input ");
		}
		
		Arrays.sort(input);
		
		List<List<Integer>> result=new ArrayList<>();
		List<Integer> combinationstillNow=new ArrayList<>();
		getCombinationSum(result, combinationstillNow, input, target, 0);
		System.out.println(result);
	}
	
	private static void getCombinationSum(List<List<Integer>> result, List<Integer> combinationstillNow,int[] input, int target, int currIndex) {
		System.out.println("Target is : "+target);
		if(target==0) {
			//System.out.println("target Met");
			result.add(new ArrayList<>(combinationstillNow));
			return ;
		}
		for(int i=currIndex;i<input.length;i++) {
			if(input[i] > target) {
				break;
			}if(input[i]==0) {
				continue;
			}
			combinationstillNow.add(input[i]);
			int cur=input[i];
			input[i]=0;
			System.out.println(combinationstillNow);
			getCombinationSum(result, combinationstillNow, input, target-cur, i);
			//System.out.println(input[currIndex]);
			input[i]=cur;
			combinationstillNow.remove(combinationstillNow.size()-1);
		}
		
		
	}
}
