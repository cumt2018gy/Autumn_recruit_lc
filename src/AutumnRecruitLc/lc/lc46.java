package AutumnRecruitLc.lc;

import com.sun.org.apache.regexp.internal.RE;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/6/30 22:24
 */
public class lc46 {

    private static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track);
        return res;
    }

    private static void backtrack(int[] nums, LinkedList<Integer> track) {
        if (nums.length == track.size()) {
            res.add(new LinkedList<>(track));   //因为这里的track是引用 所以每次都需要将他的值保存下来
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) continue;
            track.add(nums[i]);
            backtrack(nums, track);
            track.removeLast();
        }

    }


    public static void main(String[] args) {
        List<List<Integer>> permute = permute(new int[]{0,1});
        System.out.println(permute);
    }
}
