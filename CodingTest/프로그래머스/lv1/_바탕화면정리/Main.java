package lv1._바탕화면정리;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] wallpaper = {".#...", "..#..", "...#."};
//        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
//        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
//        String[] wallpaper = {"..", "#."};
        Solution s = new Solution();
        int[] result = s.solution(wallpaper);

        System.out.println("[" + result[0] + ", " + result[1] + ", " + result[2] + ", " + result[3] + "]");
    }
}

class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE, luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE, rdy = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            String row = wallpaper[i];

            if (row.contains("#")) {
                lux = Math.min(lux, i);
                luy = Math.min(luy, row.indexOf("#"));
                rdx = Math.max(rdx, i + 1);
                rdy = Math.max(rdy, row.lastIndexOf("#") + 1);
            }
        }
        return new int[]{lux, luy, rdx, rdy};
    }
}
