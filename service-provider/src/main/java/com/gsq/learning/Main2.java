package com.gsq.learning;

import java.io.*;
import java.util.*;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            int[] counts = new int[256];
            for (int i = 0; i < str.length(); ++i) {
                int idx = str.charAt(i);
                counts[idx]++;
            }

            int max = 0;
            for (int i = 0; i < 256; ++ i) {
                if (counts[i] > 0) {
                    max ++;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < max; ++ i) {
                int idx = -1;
                for (int j = 0; j < 256; ++ j) {
                    if (counts[j] > 0) {
                        if (idx == -1) {
                            idx = j;
                            continue;
                        }
                        if (counts[j] > counts[idx]) {
                            idx = j;
                        }
                    }
                }
                counts[idx] = 0;
                sb.append((char) idx);
            }
            System.out.println(sb.toString());
        }
    }
}


