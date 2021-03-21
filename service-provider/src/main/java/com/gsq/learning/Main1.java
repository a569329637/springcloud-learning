package com.gsq.learning;

import java.io.*;
import java.util.*;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            int n = Integer.parseInt(str);
            if (n == 0) {
                System.out.println(0);
                continue;
            }

            int[] nums = new int[n];
            String[] data = in.readLine().split(" ");
            for (int i = 0; i < data.length; i++) {
                nums[i] = Integer.parseInt(data[i]);
            }

            int[] ret = new int[n];
            ret[0] = 1;
            int res = 1;
            for (int i = 0; i < n; ++i) {
                int max = 0;
                for (int j = 0; j < i; ++j) {
                    if (nums[i] > nums[j]) {
                        max = Math.max(max, ret[j]);
                    }
                }
                ret[i] = max + 1;
                res = Math.max(res, ret[i]);
            }
            System.out.println(res);
        }
    }
}
