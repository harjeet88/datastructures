package com.mycomp.leetcode.utils;

public class ListNode {
	public int value;
	public ListNode next;
	
	public ListNode(int value) {
		this.value=value;
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.value);
	}
}
