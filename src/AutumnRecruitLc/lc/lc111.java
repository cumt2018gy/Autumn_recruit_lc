package AutumnRecruitLc.lc;

import model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/7/3 23:52
 */
public class lc111 {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int dep = 1;
        while (!queue.isEmpty()){
            int sz = queue.size();
            for (int i = 0; i < sz ; i++) {
                TreeNode poll = queue.poll();
                if (poll.left==null&& poll.right==null)
                    return dep;
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

    }
}
