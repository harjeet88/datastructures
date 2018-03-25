package com.mycomp.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinatioSum {
	/**
	 * https://leetcode.com/problems/combination-sum/description/
	 * @author Harjeet
	 *Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C 
	 where the candidate numbers sums to T.
	The same repeated number may be chosen from C unlimited number of times.
	Note:
	All numbers (including target) will be positive integers.
	The solution set must not contain duplicate combinations.
	For example, given candidate set [2, 3, 6, 7] and target 7, 
	A solution set is: 
	[
	  [7],
	  [2, 2, 3]
	]
	 */
	public static void main(String[] args) {
		int[] input = {2, 3, 6, 7};
		int target=7;
		
		if( input == null || input.length == 0) {
			System.out.println("Invalid Input ");
		}
		
		Arrays.sort(input);
		List<List<Integer>> result=new ArrayList<>();
		List<Integer> combinationstillNow=new ArrayList<Integer>();
		getCombinationSum(result,combinationstillNow,input,target,0);
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
			}
			combinationstillNow.add(input[i]);
			System.out.println(combinationstillNow);
			getCombinationSum(result, combinationstillNow, input, target-input[i], i);
			//System.out.println(input[currIndex]);
			combinationstillNow.remove(combinationstillNow.size()-1);
		}
		
		
	}
	
	/*public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        
        if (candidates == null || candidates.length == 0) {
            return results;
        }
        
        Arrays.sort(candidates);
        
        List<Integer> combination = new ArrayList<>();
        toFindCombinationsToTarget(results, combination, candidates, target, 0);
        
        return results;
    }
    
    private void toFindCombinationsToTarget(List<List<Integer>> results, List<Integer> combination, int[] candidates, int target, int startIndex) {
        if (target == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }
        
        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }         
            
            combination.add(candidates[i]);
            toFindCombinationsToTarget(results, combination, candidates, target - candidates[i], i);
            combination.remove(combination.size() - 1);
        }        
    }
    
    public static void main(String[] args) {
		int[] input = {2, 3, 6, 7};
		int target=7;
		System.out.println(new combinationSum().combinationSum(input, target));
	}
*/
}
