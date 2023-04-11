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
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        int level = 1;
        return evenOddThroughLevelOrder(level, root);
    }
    private boolean evenOddThroughLevelOrder(int level, TreeNode root){
        Queue<TreeNode > queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int prev = -1;
            while(size--!=0){
                TreeNode node = queue.poll();

                //Takes care about the strictly increasing or decreasing constraints
                if(level%2 == 0){
                    if(prev != -1 && node.val >= prev) return false;
                }
                else{
                    if(prev != -1 && node.val <= prev) return false;
                }
                prev = node.val;

                //Level Order traversal sniipet
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);

                //Takes care about the odd or even constraint.
                if(level%2 == 0){
                    if(node.val%2 != 0) return false;
                }
                else{
                    if(node.val%2 == 0) return false;
                }
            }
            level++;
        }
        return true;
    }
}