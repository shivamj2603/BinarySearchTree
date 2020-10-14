package com.binarysearchtree;
import com.java.datastructures.*;

public class BinaryNode<E extends Comparable<E>> {
	E key;
	public BinaryNode leftNode;
	public BinaryNode rightNode;
	public BinaryNode(E key) {
		this.key = key;
		this.leftNode = null;
		this.rightNode = null;
	}
}