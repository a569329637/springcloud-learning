package com.gsq.learning;

import java.io.*;
import java.util.*;

public class Main7 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        char a = 'a', z = 'z';
        str = in.readLine();
        boolean t = true;
        int count = 0;
        for (int i = 0; i < str.length(); ++ i) {
            char c = str.charAt(i);
            // 特殊字符
            if (c < a || c > z) {
                if (c < '0' || c > '9') {
                    t = false;
                    break;
                }
            }

            // 字符长度连续不能超过2
            if (i > 0 && str.charAt(i - 1) == c) {
                if (c >= a && c <= z) {
                    count++;
                } else {
                    count = 1;
                }
            } else {
                count = 1;
            }
            if (count > 2) {
                t = false;
                break;
            }
        }
        if (!t) {
            System.out.println("!error");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); ++ i) {
            char c = str.charAt(i);
            int num = 0;
            if (c >= '0' && c <= '9') {
                if (c == '0') {
                    t = false;
                    break;
                }
                while (c >= '0' && c <= '9') {
                    num = num * 10 + (c - '0');
                    if (i + 1 == str.length()) {
                        t = false;
                        break;
                    }
                    c = str.charAt(++i);
                }
                if (num <= 2) {
                    t = false;
                    break;
                }
            }

            // 统计
            if (num == 0) {
                num = 1;
            } else {
                // 7ff 的个情况
                if (i + 1 < str.length() && str.charAt(i + 1) == c) {
                    t = false;
                    break;
                }
            }
            for (int j = 0; j < num; ++ j) {
                sb.append(c);
            }
        }

        if (!t) {
            System.out.println("!error");
            return;
        }
        System.out.println(sb.toString());
    }

}
