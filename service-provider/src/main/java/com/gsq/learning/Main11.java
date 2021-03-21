package com.gsq.learning;

public class Main11 {

    public static int idx = 0;

    public static void main(String[] args) {
        //String a = "a";
        //String a = "a3[c]";
        //String a = "a3[c2[b]]";
        String a = "a1[b2[c3[d]]]";
        //String a = "a3[c4[bb]]";
        idx = 0;
        String ret = func(a, a.length());
        System.out.println("ret = " + ret);
    }

    public static String func(String str, int len) {
        if (str.charAt(idx) == '[') {
            idx ++;
        }
        StringBuilder sb = new StringBuilder();
        for (; idx < len; ++idx) {
            if (str.charAt(idx) == ']') {
                return sb.toString();
            }
            if (isNumber(str, idx)) {
                int count = 0;
                while (isNumber(str, idx)) {
                    count = count * 10 + (str.charAt(idx) - '0');
                    ++idx;
                }
                // 接下来一定是[
                String func = func(str, len);
                for (int j = 0; j < count; ++ j) {
                    sb.append(func);
                }
            } else {
                sb.append(str.charAt(idx));
            }
        }

        return sb.toString();
    }

    public static boolean isNumber(String str, int i) {
        return str.charAt(i) >= '0' && str.charAt(i) <= '9';
    }
}
