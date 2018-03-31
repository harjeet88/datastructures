package com.mycomp.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class CreatePermutations {
	public static void main(String[] args) {
		int[] in= {1,2,3};
		List<Integer> input=getList(in);
		List<Integer> result=new ArrayList<>();
		List<List<Integer>> finalResult=new ArrayList<>();
		getPermutations(input,result, finalResult);
		System.out.println(finalResult);
	}

	private static void getPermutations(List<Integer> input, List<Integer> result, List<List<Integer>> finalResult) {
		if(input.isEmpty()) {
			//System.out.println(result);
			finalResult.add(new ArrayList<>(result));
			//finalResult.add(result);
			return;
		}
		//System.out.println(input);
		for(int i=0;i<input.size();i++) {
			result.add(input.get(i));
			List<Integer> copy=new ArrayList<>(input);
			copy.remove(i);
			getPermutations(copy, result, finalResult);
			result.remove(result.size() -1);
			//System.out.println(finalResult);
		}
		
	}

	private static List<Integer> getList(int[] in) {
		List<Integer> out =new ArrayList<>();
		for (int i = 0; i < in.length; i++) {
			out.add(in[i]);
		}
		return out;
	}
	
}
