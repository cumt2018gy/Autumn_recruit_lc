package AutumnRecruitLc.lc;

import model.TreeNode;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/6/26 21:34
 */
public class lc124 {
    int maxValue = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getMax(root);
        return maxValue;
    }

    public int getMax(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(0, getMax(root.left));
        int right = Math.max(0, getMax(root.right));

        maxValue = Math.max(maxValue, left + right + root.val);
        return Math.max(left, right) + root.val;
    }

    public static void main(String[] args){
        lc124 lc124 = new lc124();
        TreeNode treeNode = new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        lc124.maxPathSum(treeNode);
    }
}
