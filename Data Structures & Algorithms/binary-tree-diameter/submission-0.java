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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int left=h(root.left);
        int right=h(root.right);
        int diaL=diameterOfBinaryTree(root.left);
        int diaR=diameterOfBinaryTree(root.right);
        int h=left+right;
        return Math.max(Math.max(diaL,diaR),h);

    }
    public int h(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(h(root.left),h(root.right))+1;
    }
}
