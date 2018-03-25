package com.mycomp.leetcode.easy;

public class NthNumber {
	public static void main(String[] args) {
		int t3=3,t2=4,t1=7;
		int n=6042;
		int count=3;
		int t=t3+t2+t1;
		while(t!=n && t<n) {
			t=t3+t2+t1;
			t3=t2;
			t2=t1;
			t1=t;
			count++;
			
		}
		System.out.println(t);
		if(t==n) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
