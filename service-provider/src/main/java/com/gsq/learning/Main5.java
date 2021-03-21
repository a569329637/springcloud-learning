package com.gsq.learning;

import java.io.*;
import java.util.*;

public class Main5 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            int n = Integer.parseInt(str);
            System.out.println(CalcAutomorphicNumbers(n));
        }
    }

    public static int CalcAutomorphicNumbers(int n) {
        int count = 0;
        for (int i = 0; i <= n; ++ i) {
            int j = i;
            int k = i * i;
            while (j != 0) {
                if (j % 10 != k % 10) {
                    break;
                }
                j /= 10;
                k /= 10;
            }
            if (j == 0) {
                count ++;
                //System.out.println("i = " + i);
            }
        }
        return count;
    }
}

