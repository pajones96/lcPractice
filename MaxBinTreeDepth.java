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
        
    int max = 1;
    int depth = 1;
    
    public int maxDepth(TreeNode root) {
        
        if(root.left != null){
            depth++;
            maxDepth(root.left);
        } else if (root.right != null){
            depth++;
            maxDepth(root.right);
        } else {
            if(depth > max)
                max = depth;
        }
    }
}
