package com.mycomp.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNumber {
	public static void main(String[] args) {
		int digits=Integer.parseInt("1234");
		int currIndex=0;
		map.put(1, new ArrayList<String>());
	    map.put(2, Arrays.asList("a","b","c"));
	    map.put(3, Arrays.asList("d","e","f"));
	    map.put(4, Arrays.asList("g","h","i"));
	    map.put(5, Arrays.asList("j","k","l"));
	    map.put(6, Arrays.asList("m","n","o"));
	    map.put(7, Arrays.asList("p","q","r","s"));
	    map.put(8, Arrays.asList("t","u","v"));
	    map.put(9, Arrays.asList("w","x","y","z"));
	    map.put(0, new ArrayList<String>());
	    List<String> results=new ArrayList<String>();
	    results=getCombination(results,digits,currIndex);
	    System.out.println(results);
 	}
	public static Map<Integer,List<String>> map=new HashMap<Integer,List<String>>();
	
	

	private static List<String> getCombination(List<String> results,int digits, int currIndex) {
		ArrayList<String> response=new ArrayList<String>();
		/*String curr=digits.substring(currIndex,currIndex+1);
		System.out.println(currIndex+" : "+curr);
		List<String> currList=map.get(Integer.parseInt(curr));
		for (String subChar : currList) {
			if()
			List<String> res=getCombination(results, digits, currIndex+1);
			for (String resCurr : res) {
				response.add(subChar+resCurr);
			}
		}*/
		
		int curr=digits%10;
		int newDigits=digits/10;
		if(curr == 0) {
			return response;
		}
		System.out.println("Function called for : "+curr+" : "+digits);
		List<String> mapping=map.get(curr);
		for (String currChar : mapping) {
			System.out.println("currChar : "+currChar);
			List<String> resList=getCombination(results, newDigits, currIndex+1);
			System.out.println("resList : "+resList);
			if(resList.size()==0) {
				response.add(currChar);
			}else {
				for (String res : resList) {
					System.out.println("adding : "+res+currChar);
					response.add(res+currChar);
				}
			}

		}
		return response;
	}
}
