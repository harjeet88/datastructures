package com.mycomp.leetcode.easy;

import com.mycomp.leetcode.utils.ListNode;
import com.mycomp.leetcode.utils.ListUtils;

public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(5);
		l1.next.next=new ListNode(7);
		
		ListNode l2=new ListNode(8);
		l2.next=new ListNode(0);
		l2.next.next=new ListNode(7);
		//ListUtils.printList(l1);
		//ListUtils.printList(l2);
		ListNode result=addNumbers(l1,l2);
		System.out.println("===========================");
		ListUtils.printList(result);
	}

	private static ListNode addNumbers(ListNode l1, ListNode l2) {
		ListNode result=null;
		ListNode currNode=result;
		if(l1 == null && l2 == null) {
			return result;
		}else if(l1== null) {
			return l2;
		}else if(l2 == null) {
			return l1;
		}else {
			int carry=0;
			while(l1!=null || l2!=null) {
				//ListUtils.printList(result);
				ListNode node=new ListNode(0);
				if(l1 == null) {
					node.value=l2.value+carry;
					carry=0;
					l2=l2.next;
				}else if(l2 == null) {
					//ListNode node=new ListNode(l1.value);
					node.value=l1.value+carry;
					carry=0;
					l1=l1.next;
				}else {
					//ListNode node = new ListNode(l1.value+l2.value);
					int sum=l1.value+l2.value;
					System.out.println("sum is : "+sum);
					if(sum<10) {
						node.value=sum+carry;
						carry=0;
						System.out.println("Node value is "+ node.value);
					}else {
						System.out.println("carry set");
						carry=1;
						node.value=sum%10;
						System.out.println("Node value is "+ node.value);
					}
					
					l1=l1.next;
					l2=l2.next;
				}
				if(result==null) {
					result=node;
					currNode=node;
				}else {
					currNode.next=node;
					currNode=currNode.next;
					ListUtils.printList(result);
				}
				
			}
			
			if(carry==1) {
				ListNode node=new ListNode(1);
				carry=0;
				currNode.next=node;
			}
		}
		return result;
	}
}
