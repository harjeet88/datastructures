package com.mycomp.leetcode.medium;

/**
 * https://leetcode.com/problems/maximum-swap/description/
 * @author harjeet
 *Given a non-negative integer, you could swap two digits at most once to get the maximum valued number. Return the maximum valued number you could get.
Example 1:
Input: 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:
Input: 9973
Output: 9973
Explanation: No swap.
Note:
The given number is in the range [0, 108]
 */

public class MaxSwap {
	public static void main(String[] args) {
		int num= 9729;
		int upNum=num;
		int curNum=num;
		int max=Integer.MIN_VALUE;
		int i=0;
		int maxIndex =0;
		while(curNum != 0) {
			
			System.out.println(curNum);
			int cur=curNum%10;
			curNum=curNum/10;
			if(cur > max) {
				maxIndex=i;
				max=cur;
				
			}
			if(i!=0 && cur != max) {
				//minus = cur*(10^i)
				//add = max*(10^i)
				//minus = max(10^maxIndex)
				//add = cur(10^maxIndex)
				System.out.println("Cur : "+cur+" , Max : "+max);
				int minus=(int) (cur*Math.pow(10, i));
				int add = (int) (max*(Math.pow(10, i)));
				
				System.out.println("minus "+minus +", add : "+add);
				upNum=num-minus+add;
				System.out.println("First update : "+upNum);
				minus=(int) (max*Math.pow(10, maxIndex));
				add = (int) (cur*Math.pow(10,maxIndex));
				upNum= upNum- minus+add;
				System.out.println("second Update : "+upNum);
			}
			i++;
			System.out.println("Updated Number : "+upNum);
			System.out.println("==============");
		}
		System.out.println(upNum);
	}
}
