package com.gsq.learning;

import java.io.*;
import java.util.*;

public class Main4 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            int n = Integer.parseInt(str);

            int m = 2 + 3 * (n - 1);

            int ret = 2 * n + ( n * (n - 1) * 3) / 2;
            System.out.println(ret);
        }
    }
}

