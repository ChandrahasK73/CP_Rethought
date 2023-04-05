/*A binary tree is uni-valued if every node in the tree has the same value.

Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise. */

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
import java.util.*;
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        int uniqueBase = root.val;
        return findUniquenessThroughLevelOrder(root, uniqueBase);
    }
    private boolean findUniquenessThroughLevelOrder(TreeNode root, int base){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
            if(curr.val != base) return false;
        }
        return true;
    }
}