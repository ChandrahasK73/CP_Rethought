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
import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if(root != null) pathsForBT(root, "", result);
        return result;
    }
    public void pathsForBT(TreeNode root, String pathElement, List<String> result){
        if(root.left == null && root.right == null) result.add(pathElement+root.val);
        if(root.left!=null) pathsForBT(root.left, pathElement+root.val+"->", result);
        if(root.right!=null) pathsForBT(root.right, pathElement+root.val+"->", result);
    }
}