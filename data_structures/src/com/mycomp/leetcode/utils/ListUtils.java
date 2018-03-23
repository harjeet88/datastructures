package com.mycomp.leetcode.utils;

public class ListUtils {
	public static void main(String[] args) {
		
	}
	
	public static void printList(ListNode list) {
		while(list !=null) {
			System.out.println(list.value);
			list=list.next;
		}
	}
}
