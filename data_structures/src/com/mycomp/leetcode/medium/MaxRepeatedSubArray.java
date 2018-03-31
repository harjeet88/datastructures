package com.mycomp.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class MaxRepeatedSubArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,2,1,4,5,6};
		int[] b = {3,2,1,4,7};
		Set<Integer> unA=new HashSet<>();
		Set<Integer> unB=new HashSet<>();
		Set<Integer> out=new HashSet<>();
		
		for(int i=0; i<a.length || i<b.length;i++) {
			if( i<b.length && i<a.length && a[i] ==b[i]) {
				out.add(a[i]);
				//System.out.println("Common : "+a[i]);
			}
			if( i< b.length && unA.contains(b[i])  ) {
				out.add(b[i]);
			}
			if(i<a.length&& unB.contains(a[i]) ) {
				out.add(a[i]);
			}
			if(i<a.length)
				unA.add(a[i]);
			if(i<b.length)
				unB.add(b[i]);
		}
		System.out.println(out);
	}
}
