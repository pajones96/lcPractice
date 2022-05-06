/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	
	public int maxDepth(TreeNode root) {

		if (root==null) {//check if empty tree
			return 0;
		}

		int left=0;//max left tree depth 
		int right =0;//max right tree depth

		if(root.left!=null) {
			left = maxDepth(root.left);//calculate left subtree depth
		}

		if(root.right!=null) {
			right = maxDepth(root.right);//calculate right subtree depth
		}

		int max = (left > right) ? left : right;//check the max depth
		return (max+1);
	}
}
