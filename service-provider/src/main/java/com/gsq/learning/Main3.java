package com.gsq.learning;

import java.io.*;
import java.util.*;

public class Main3 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            int n = Integer.parseInt(str);
            int[] nums = new int[n];
            String[] data = in.readLine().split(" ");
            for (int i = 0; i < data.length; i++) {
                nums[i] = Integer.parseInt(data[i]);
            }
            int m = Integer.parseInt(in.readLine());

            Arrays.sort(nums);
            if (m == 1) {
                for (int i = 0; i < n / 2; ++i) {
                    int t = nums[i];
                    nums[i] = nums[n - i - 1];
                    nums[n - i - 1] = t;
                }
            }
            for (int i = 0; i < n - 1; ++i) {
                System.out.print(nums[i] + " ");
            }
            System.out.println(nums[n - 1]);
        }
    }
}
