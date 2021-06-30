package AutumnRecruitLc.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/6/30 22:47
 */
public class lc47 {

    static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> permuteUnique(int[] nums) {

        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int[] visited = new int[n];
        Arrays.sort(nums);

        backtrack(nums, list, visited); // res 设为全局变量，则不需要被当做参数传入了
        return res;
    }

    private static void backtrack(int[] nums, List<Integer> tmp, int[] visited) {

        if (tmp.size() == nums.length) {

            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (visited[i] == 1) continue;

            // 剪枝
            if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == 0) continue;

            visited[i] = 1;
            tmp.add(nums[i]);

            backtrack(nums, tmp, visited);

            visited[i] = 0;
            tmp.remove(tmp.size() - 1);
        }
    }


    public static void main(String[] args) {
        List<List<Integer>> permute = permuteUnique(new int[]{1, 1, 2});
        System.out.println(permute);
    }
}
