package com.binarysearchtree;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {
	@Test
	 public void givenThreeIntegers_whenAdded_shouldReturnSizeAsThree() {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		assertEquals(3, binarySearchTree.size());
	}
	@Test
	 public void givenThirteenIntegers_whenAdded_shouldReturnSizeAsThirteen() {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(3);
		binarySearchTree.add(11);
		binarySearchTree.add(63);
		binarySearchTree.add(16);
		binarySearchTree.add(65);
		binarySearchTree.add(67);
		assertEquals(13, binarySearchTree.size());
	}	
	@Test
	 public void givenABinaryTree_whenSearchedForElement_shouldReturnTrueIfPresent() {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(3);
		binarySearchTree.add(11);
		binarySearchTree.add(63);
		binarySearchTree.add(16);
		binarySearchTree.add(65);
		binarySearchTree.add(67);
		assertEquals(true, binarySearchTree.search(63));
	}	
}
