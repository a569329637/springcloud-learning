package com.gsq.learning;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main13 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("5432");
        list.add("543");
        list.add("8765");
        list.add("876");
        list.add("9876");
        list.add("987");
        list.add("98");

        //98 987 9876

        Collections.sort(list, String::compareTo);
        list.forEach(System.out::println);

        System.out.println((int)'A');
        System.out.println((int)'a');
    }
}
