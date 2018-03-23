package com.mycomp.leetcode.easy;

public class BestTimeToBuyStock {
	public static void main(String[] args) {
		int[] input = {7,10,0, 1, 9,5, 3, 6, 4};
		System.out.println("Max Profit : "+getMaxProfit(input));
		//sysou
	}

	private static int getMaxProfit(int[] input) {
		// TODO Auto-generated method stub
		int min =Integer.MAX_VALUE;
		//int max = input[0];
		int max_diff=0;
		int sell_value=input[0];
		for(int i=0; i<input.length;i++) {
			if(input[i]<min) {
				min=input[i];
			}else if ((input[i] - min) > max_diff ){
				max_diff = input[i]-min;
				sell_value=input[i];
			}
		}
		System.out.println("Buy at : "+min+" , sell at : "+sell_value);
		return max_diff;
	}
}
