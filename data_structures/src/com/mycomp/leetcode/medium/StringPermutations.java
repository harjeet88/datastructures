package com.mycomp.leetcode.medium;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.mycomp.leetcode.utils.NumberUtils;

import java.util.TreeMap;


public class StringPermutations {
	public static void main(String[] args) {
		String in="ab";
		Map<Character,Integer> charMap=getMap(in);
		char[] chars=new char[charMap.size()];
		int[] count=new int[charMap.size()];
		int index=0;
		for (Entry<Character, Integer> entry : charMap.entrySet()) {
			chars[index]=entry.getKey();
			count[index]=entry.getValue();
			index++;
		}
		char[] results=new char[in.length()];
		int level=0;
		getPermutations(chars,count,results,level);
	}

	private static void getPermutations(char[] chars, int[] count, char[] results, int level) {
		if(level==results.length) {
			NumberUtils.printCharArray(results);
			return;
		}
		//int[] newCounts=count;
		for(int i=0;i<chars.length;i++) {
			if(count[i] == 0) {
				continue;
			}
			results[level]=chars[i];
			count[i]--;
			
			//newCounts[i]--;//=newCounts[i]-1;
			getPermutations(chars, count, results, level+1);
			count[i]++;
		}
	}

	private static Map<Character, Integer> getMap(String in) {
		char[] inc=in.toCharArray();
		Map<Character,Integer> charMap=new TreeMap<>();
		for (int i = 0; i < inc.length; i++) {
			if(charMap.containsKey(inc[i])) {
				charMap.put(inc[i], charMap.get(inc[i])+1);
			}else {
				charMap.put(inc[i],1);
			}
		}
		return charMap;
	}
}
