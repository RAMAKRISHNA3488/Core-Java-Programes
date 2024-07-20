package com.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesYT {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		static int idx = -1;

		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;

		}
	}

	public static void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static void postorder(Node root) {
		if (root == null) {
			return;

		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}

	public static void levelOrder(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			Node curNode = q.remove();
			if (curNode == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				System.out.print(curNode.data + " ");
				if (curNode.left != null) {
					q.add(curNode.left);
				}
				if (curNode.right != null) {
					q.add(curNode.right);
				}
			}
		}
	}

	public static int countofNodes(Node root) {
		if (root == null) {
			return 0;
		}
		int leftNodes = countofNodes(root.left);
		int rightNodes = countofNodes(root.right);

		return leftNodes + rightNodes + 1;

	}

	public static int sumofNodes(Node root) {
		if (root == null) {
			return 0;
		}
		int leftsum = sumofNodes(root.left);
		int rightsum = sumofNodes(root.right);

		return leftsum + rightsum + root.data;

	}

	public static int height(Node root) {
		if (root == null) {
			return 0;
		}
		int leftheight = height(root.left);
		int rightheight = height(root.right);

		int myHeight = Math.max(leftheight, rightheight) + 1;

		return myHeight;
	}

	public static int diameter(Node root) {
		if (root == null) {
			return 0;
		}
		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = height(root.left) + height(root.right) + 1;

		return Math.max(diam3, Math.max(diam1, diam2));
	}

	static class Treeinfo {
		int ht;
		int diam;

		Treeinfo(int ht, int diam) {
			this.ht = ht;
			this.diam = diam;
		}
	}

	public static Treeinfo diameter2(Node root) {
		if (root == null) {
			return new Treeinfo(0, 0);
		}
		Treeinfo left = diameter2(root.left);
		Treeinfo right = diameter2(root.right);

		int myHeight = Math.max(left.ht, right.ht) + 1;

		int diam1 = left.diam;
		int diam2 = right.diam;
		int diam3 = left.ht + right.ht + 1;
		int mydiam = Math.max(Math.max(diam1, diam2), diam3);

		Treeinfo myinfo = new Treeinfo(myHeight, mydiam);
		return myinfo;
	}

	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		// preorder(root);
		// inorder(root);
		// postorder(root);
		// levelOrder(root);
		// System.out.println(countofNodes(root));
		// System.out.println(sumofNodes(root));
		// System.out.println(height(root));

		// System.out.println(diameter(root));

		System.out.println(diameter2(root).diam);

	}

}
