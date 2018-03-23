package com.mycomp.leetcode.utils;

public class Tree {
	public int value;
	public Tree left;
	public Tree right;
	public Tree() {
		this.value=0;
		this.left=null;
		this.right=null;
	}
	
	public Tree(int value) {
		this.value=value;
		this.left=null;
		this.right=null;
	}
	public Tree(int value,Tree left, Tree right) {
		this.value=value;
		this.left=left;
		this.right=right;
	}
}
