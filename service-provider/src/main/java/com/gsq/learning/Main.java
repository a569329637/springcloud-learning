package com.gsq.learning;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine()) != null) {
            int num = Integer.parseInt(str);
            List<String> ret = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                str = bf.readLine();
                int len = str.length();
                if (len % 8 != 0) {
                    StringBuilder sb = new StringBuilder(str);
                    for (int j = len % 8; j < 8; ++j) {
                        sb.append('0');
                    }
                    str = sb.toString();
                    len = str.length();
                }
                System.out.println("str = " + str);
                for (int j = 0; j < len; j += 8) {
                    String t = str.substring(j, j + 8);
                    ret.add(t);
                }
            }
            ret.forEach(System.out::println);
        }

//
//        Scanner in = new Scanner(System.in);
//        List<String> strs = new ArrayList<>();
//        int n = in.nextInt();
//        for (int i = 0; i < n; ++i) {
//            strs.add(in.nextLine());
//        }
//        List<String> ret = new ArrayList<>();
//        for (int i = 0; i < n; ++i) {
//            String str = strs.get(i);
//            int len = str.length();
//            if (len % 8 != 0) {
//                StringBuilder sb = new StringBuilder(str);
//                for (int j = len % 8; j < 8; ++j) {
//                    sb.append('0');
//                }
//                str = sb.toString();
//            }
//            for (int j = 0; j < len; j += 8) {
//                String t = str.substring(j, 8);
//                ret.add(t);
//            }
//        }
//        ret.forEach(System.out::println);
    }
}

