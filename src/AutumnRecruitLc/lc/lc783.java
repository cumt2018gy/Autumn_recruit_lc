package AutumnRecruitLc.lc;

import model.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/7/4 0:03
 */
public class lc783 {

    List<Integer> list = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        generate(root);
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <list.size() ; i++) {
            min = Math.min(min, list.get(i) - list.get(i-1));
        }
        return min;
    }


    public void generate(TreeNode node){
        if (node == null)
            return;
        list.add(node.val);
        if (node.left != null){
            generate(node.left);
        }
        if (node.right != null){
            generate(node.right);
        }
    }

    public static void main(String[] args) {
        lc783 lc783= new lc783();
        int i = lc783.minDiffInBST(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new
                TreeNode(7, new TreeNode(17), null))));
        System.out.println(i);
    }

}
