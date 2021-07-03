package AutumnRecruitLc.lc;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.jar.JarEntry;

/**
 * @author ：yuan_ge
 * @date ：Created 2021/7/4 0:12
 */
public class lc752 {
    public  int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet<>();

        for (String dead : deadends) {
            deads.add(dead);
        }

        Set<String> visited  = new HashSet<>();

        Queue<String> queue = new LinkedList<>();
        int step = 0;
        queue.offer("0000");
        visited.add("0000");

        while (!queue.isEmpty()){
            int sz = queue.size();

            for (int i = 0; i < sz; i++) {
                String poll = queue.poll();
                if (deads.contains(poll)){
                    continue;
                }
                if (target.equals(poll)) return step;

                for (int j = 0; j < 4 ; j++) {
                    String s = addOne(poll, j);
                    if (!visited.contains(s)){
                        queue.offer(s);
                        visited.add(s);
                    }
                    String b = removeOne(poll, j);
                    if (!visited.contains(b)){
                        queue.offer(b);
                        visited.add(b);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    public  String addOne(String s,int j){
        char[] sc = s.toCharArray();
        if (sc[j] == '9') sc[j] = '0';
        else sc[j] += 1;
        return new String(sc);
    }
    public  String removeOne(String s,int j){
        char[] sc = s.toCharArray();
        if (sc[j] == '0') sc[j] = '9';
        else sc[j] -= 1;
        return new String(sc);
    }


    public static void main(String[] args) {
        int i =new lc752().openLock(new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888");
        System.out.println(i);
    }

}
