package AutumnRecruitLc.lc;

import model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/7/3 23:52
 */
public class lc104 {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int dep = 0;
        while (!queue.isEmpty()){
            int sz = queue.size();
            for (int i = 0; i < sz ; i++) {
                TreeNode poll = queue.poll();
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right!=null){
                    queue.add(poll.right);
                }
            }
            dep++;
        }
        return dep;
    }

    public static void main(String[] args) {
        int i = maxDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new
                TreeNode(7,new TreeNode(17),null))));
        System.out.println(i);

    }
}
