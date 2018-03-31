package com.mycomp.leetcode.utils;

public class Node<T extends Comparable<?>> {
    public Node<T> left, right;
    public T data;

    public Node(T data) {
        this.data = data;
    }
    
}
