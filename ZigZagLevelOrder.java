import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
    }
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return list;
        queue.add(root);
        boolean isOdd = true;
        while(queue.size()!=0){
            int size = queue.size();
            int i=0;
            List<Integer> llist = new LinkedList<Integer>();
            while(i++<size){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
                if(isOdd)llist.add(node.val);
                else llist.add(0,node.val);
            }
            list.add(llist);
            isOdd = !isOdd;
        }
        return list;
    }
}