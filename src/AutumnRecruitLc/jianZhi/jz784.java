package AutumnRecruitLc.jianZhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/6/30 23:03
 */
public class jz784 {

    private  static List<String> res = new ArrayList<>();
    public static List<String> letterCasePermutation(String s) {

        StringBuilder sb = new StringBuilder();

        backtrack(s, 0, sb);
        return res;
    }

    public static void backtrack(String s, int start, StringBuilder sb) {

        if (sb.length() == s.length()) {

            res.add(sb.toString());
            return ;
        }

        for (int i=start;i<s.length();i++) {

            char c = s.charAt(i);

            if (Character.isDigit(c)) {

                sb.append(c);
                backtrack(s, i + 1, sb);
                sb.deleteCharAt(sb.length() - 1); // 撤销选择
            } else {

                char A = Character.toUpperCase(c);
                sb.append(A);
                backtrack(s, i + 1, sb);
                sb.deleteCharAt(sb.length() - 1);

                char a = Character.toLowerCase(c);
                sb.append(a);
                backtrack(s, i + 1, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = letterCasePermutation("a1b2");
        System.out.println(list);
    }
}
