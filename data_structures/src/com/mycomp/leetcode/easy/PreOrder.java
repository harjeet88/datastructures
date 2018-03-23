package com.mycomp.leetcode.easy;

import java.util.Stack;

import com.mycomp.leetcode.utils.Tree;

public class PreOrder {
	public static void main(String[] args) {
		/*Tree  root=new Tree(5);
		Tree left=new Tree(3);
		left.left=new Tree(2);
		left.right=new Tree(4);
		root.left=left;
		Tree right = new Tree(7);
		right.right=new Tree(8);
		root.right=right;*/
		Tree  root=new Tree(10);
		Tree left=new Tree(8);
		left.left=new Tree(3);
		left.right=new Tree(5);
		root.left=left;
		Tree right = new Tree(2);
		right.left=new Tree(2);
		root.right=right;
		printPreOrder(root);
		printPreOrderIterative(root);
	}

	private static void printPreOrderIterative(Tree root) {
		
		Stack<Tree> stack=new Stack<Tree>();
		stack.push(root);
		while(!stack.isEmpty()) {
			Tree curr=stack.pop();
			System.out.println(curr.value);
			if(curr.right != null) {
				stack.push(curr.right);
			}
			
			if(curr.left !=null) {
				stack.push(curr.left);
			}
			
			
		}
		
		
	}

	private static void printPreOrder(Tree root) {
		System.out.println(root.value);
		if(root.left != null) {
			printPreOrder(root.left);
		}
		
		
		if(root.right != null) {
			printPreOrder(root.right);
		}
		
		
	}
}


