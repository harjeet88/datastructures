package com.mycomp.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mycomp.leetcode.utils.NumberUtils;

/**
 * https://leetcode.com/problems/subarray-product-less-than-k/description/
 * @author Harjeet
 *Your are given an array of positive integers nums.
Count and print the number of (contiguous) subarrays where the product of all the elements in the subarray is less than k.
Example 1:
Input: nums = [10, 5, 2, 6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are: [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6].
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
Note:
0 < nums.length <= 50000.
0 < nums[i] < 1000.
0 <= k < 10^6.
 */

public class SubArrayproductLessThank {
	public static void main(String[] args) {
		int k=100;
		int[] nums= {10,5,2,6};
		Set<Set<Integer>> result=new HashSet<>();
		List<Integer> combi=new ArrayList<>();
		int level=0;
		int prod=1;
		//getSubArryLessk(nums,result,combi,k,prod,level);
		getContigiousSubArryLessk(nums,result,k);
		System.out.println(result);
	}

	private static void getContigiousSubArryLessk(int[] nums, Set<Set<Integer>> result, int k) {
		
		int count=0;
		int[][] temp=new int[nums.length][nums.length];
		for(int i=0; i<nums.length;i++) {
			if(nums[i]<k) {
				temp[i][i]=nums[i];
				count++;
				
			}
		}
		Set<Integer> combi=new HashSet<>();
		//Set<Set<Integer>> res=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			combi=new HashSet<>();
			for(int j=i+1;j<nums.length;j++) {
				
				int prod=temp[i][j-1]*nums[j];
				if(prod!=0 && prod<k) {
					combi.add(nums[j]);
					result.add(new HashSet<>(combi));
					//System.out.println();
					temp[i][j]=prod;
					count++;
				}
				System.out.println("======================================");
				NumberUtils.print2dArray(temp);
			}
		}
		System.out.println(count);
	}

	private static void getSubArryLessk(int[] nums, Set<Set<Integer>> result, List<Integer> combi, int k,int prod,int level) {
		if(level == nums.length && prod<k) {
			System.out.println("Adding : "+combi);
			System.out.println("=====================================");
			result.add(new HashSet<>(combi));
			return;
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println("Checking : "+nums[i]);
			int cur=nums[i];
			if(nums[i] ==0) {
				continue;
			}
			int updatedProd=prod*cur;
			nums[i]=0;
			combi.add(cur);
			if(updatedProd<k) {
				result.add(new HashSet<>(combi));
			}
			getSubArryLessk(nums, result, combi,k, updatedProd, level+1);
			nums[i]=cur;
			combi.remove(combi.size()-1);
		}
		
	}
}
