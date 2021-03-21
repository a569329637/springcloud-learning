package com.gsq.learning;

import java.io.*;
import java.util.*;

public class Main10 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int n = Integer.parseInt(str);
        int[][] nums = new int[n][n];
        int mi = 0, mj = 0, bi = 0, bj = 0;
        int[][] flags = new int[n][n];
        int[][] count = new int[n][n];// 步数
        int[][] cost = new int[n][n];// 糖果
        for (int i = 0; i < n; ++i) {
            str = in.readLine();
            String[] strs = str.split(" ");
            for (int j = 0; j < n; ++j) {
                nums[i][j] = Integer.parseInt(strs[j]);
                //System.out.print(nums[i][j] + " ");
                flags[i][j] = 0;
                count[i][j] = 0;
                cost[i][j] = 0;
                if (nums[i][j] == -1) {
                    flags[i][j] = 1;
                }
                if (nums[i][j] == -3) {
                    mi = i;
                    mj = j;
                    //flags[i][j] = 1;
                }
                if (nums[i][j] == -2) {
                    bi = i;
                    bj = j;
                    //flags[i][j] = 1;
                }

            }
            //System.out.println();
        }

        boolean t = search(n, mi, mj, bi, bj, count, cost, flags);
        if (!t) {
            System.out.println("-1");
            return;
        }
        System.out.println("1");
    }

    public static boolean search(int n, int mi, int mj, int bi, int bj,
                                 int[][] count, int[][] cost, int[][] flags) {
        if (flags[mi][mj] == 1) {
            return false;
        }
        flags[mi][mj] = 1;
        if (mi == bi && mj == bj) {
            return true;
        }
        boolean t1 = false;
        if (mi > 0) {
            t1 = search(n, mi - 1, mj, bi, bj, count, cost, flags);
        }
        boolean t2 = false;
        if (mi + 1 < n && !t1) {
            t2 = search(n, mi + 1, mj, bi, bj, count, cost, flags);
        }
        boolean t3 = false;
        if (mj > 0 && !t1 && !t2) {
            t3 = search(n, mi, mj - 1, bi, bj, count, cost, flags);
        }
        boolean t4 = false;
        if (mj + 1 < n && !t1 && !t2 && !t3) {
            t4 = search(n, mi, mj + 1, bi, bj, count, cost, flags);
        }
        return t1 || t2 || t3 || t4;
    }


}
