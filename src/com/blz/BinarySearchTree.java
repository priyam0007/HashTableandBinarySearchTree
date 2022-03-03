package com.blz;

/*
 * @author Priya 
 * Purpose to create a method to add elements in Binary Tree
 */
class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

public class BinarySearchTree {

	Node root;

	BinarySearchTree(int key) {
		root = new Node(key);
	}

	BinarySearchTree() {
		root = null;
	}

	public void inorderTraversal(Node node) {
		if (root == null)
			System.out.println("Tree is empty");
		else {
			if (node.left != null)
				inorderTraversal(node.left);
			System.out.print(node.data + " ");
			if (node.right != null)
				inorderTraversal(node.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree tree = new BinarySearchTree();

		tree.root = new Node(56);
		tree.root.left = new Node(30);
		tree.root.right = new Node(70);

		// Adding elements in left and right of 30 and further
		tree.root.left.left = new Node(22);
		tree.root.left.right = new Node(40);
		tree.root.left.left.left = new Node(11);
		tree.root.left.left.left.left = new Node(3);
		tree.root.left.left.left.right = new Node(3);

		// Adding elements in left and right of 70 and further
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(95);
		tree.root.right.left = new Node(65);
		tree.root.right.left = new Node(63);
		tree.root.right.left = new Node(67);

		tree.inorderTraversal(tree.root);

	}
}