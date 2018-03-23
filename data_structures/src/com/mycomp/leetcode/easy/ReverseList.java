package com.mycomp.leetcode.easy;

import com.mycomp.leetcode.utils.ListNode;

public class ReverseList {
	public static void main(String[] args) {
		ListNode head= new ListNode(1);
		head.next= new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		ListNode curr=null;
/*		curr=head;
		while(curr!=null) {
			System.out.println(curr.value);
			curr= curr.next;
		}*/
		//System.out.println(head);
		ListNode rev1=reverseUsingRecursion(head);
		curr=rev1;
		while(curr!=null) {
			System.out.println(curr.value);
			curr= curr.next;
		}
/*		ListNode rev2=reverseUsingIter(head);
		curr=rev2;
		while(curr!=null) {
			System.out.println(curr.value);
			curr= curr.next;
		}*/
	}

	private static ListNode reverseUsingRecursion(ListNode head) {
		if(head == null) {
			return null;
		}
		//System.out.println(head.value);
		ListNode val=null;
		val = new ListNode(head.value);
		ListNode revList=null;
		if(head.next !=null) {
			revList=reverseUsingRecursion(head.next);
			ListNode curr = revList;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next=val;
		}else {
			revList=val;
		}
		
		
		return revList;
		
	}

	private static ListNode reverseUsingIter(ListNode head) {
		ListNode revList=new ListNode(head.value);
		ListNode curr=head.next;
		ListNode newer=null;
		while(curr!=null) {
			newer=new ListNode(curr.value);
			newer.next=revList;
			revList=newer;
			curr = curr.next;
		}
		return newer;
	}
}
