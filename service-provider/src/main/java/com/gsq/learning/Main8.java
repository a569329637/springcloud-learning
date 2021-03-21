package com.gsq.learning;

import java.io.*;
import java.util.*;

public class Main8 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String[] nums = str.split(",");
        int[] flags = new int[nums.length];
        for (int i = 0; i < nums.length; ++ i) {
            flags[i] = 0;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; ++ i) {
            int idx = getMaxString(nums, flags);
            sb.append(nums[idx]);
            flags[idx] = 1;
        }
        System.out.println(sb.toString());
    }

    public static int getMaxString(String[] nums, int[] flags) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; ++ i) {
            if (flags[i] == 0) {
                if (maxLen < nums[i].length()) {
                    maxLen = nums[i].length();
                }
            }
        }

        int ret = 0;
        for (int j = 0; j < maxLen; ++ j) {
            int maxIdx = -1;
            int count = 0;
            for (int i = 0; i < nums.length; ++ i) {
                if (flags[i] == 0) {
                    if (maxIdx == -1) {
                        maxIdx = i;
                        count = 1;
                    } else {
                        int ilen = nums[i].length();
                        int mlen = nums[maxIdx].length();

                        if (j < ilen && j < mlen) {
                            if (nums[i].charAt(j) > nums[maxIdx].charAt(j)) {
                                // 选出大一点的
                                maxIdx = i;
                                count = 1;
                            } else if (nums[i].charAt(j) == nums[maxIdx].charAt(j)) {
                                count ++;
                            }
                        } else if (j >= ilen) {
                            maxIdx = i;
                            count = 1;
                        } else if (j >= mlen) {
                            count ++;
                        } else {
                            count ++;
                        }
                    }
                }
            }

            if (count == 1) {
                ret = maxIdx;
                break;
            }

            boolean flag = false;
            String str = nums[maxIdx];
            for (int i = 0; i < nums.length; ++ i) {
                if (flags[i] == 0) {
                    boolean t = true;
                    for (int k = 0; k <= j; ++ k) {
                        if (nums[i].charAt(k) != str.charAt(k)) {
                            t = false;
                            break;
                        }
                    }
                    if (t && nums[i].length() == j + 1) {
                        ret = maxIdx;
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                break;
            }
        }
        return ret;
    }
}