package com.mycomp.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

import com.mycomp.leetcode.utils.NumberUtils;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int[] input= {4,3,2,7,8,2,3,1};
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0; i<input.length;i++) {
			System.out.println("============ Curr element is "+input[i]);
			int index = Math.abs(input[i]) -1;
			System.out.println("Index is : "+index);
			if(input[index]<0) {
				result.add(Math.abs(input[i]));
			}
			input[index]=-input[index];
			
			NumberUtils.printArray(input);
		}
		
		System.out.println(result);
	}
}
