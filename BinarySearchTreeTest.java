package com.binarysearchtree;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

	@Test
	 public void givenThreeIntegers_whenAdded_shouldReturnSizeAsThree() {
		BinaryNode<Integer> firstNode = new BinaryNode<Integer>(56);
		BinaryNode<Integer> secondNode = new BinaryNode<Integer>(30);
		BinaryNode<Integer> thirdNode = new BinaryNode<Integer>(70);
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
		binarySearchTree.add(firstNode.key);
		binarySearchTree.add(secondNode.key);
		binarySearchTree.add(thirdNode.key);
		assertEquals(3, binarySearchTree.size());
	}
}
