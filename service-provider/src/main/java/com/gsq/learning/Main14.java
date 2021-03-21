package com.gsq.learning;

import java.util.ArrayList;
import java.util.List;

public class Main14 {
    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<String>();
        sourceList.add("H");
        sourceList.add("O");
        sourceList.add("L");
        sourceList.add("L");
        sourceList.add("I");
        sourceList.add("S");

        List subList = sourceList.subList(2,5);

        System.out.println("sourceList ： "+sourceList);
        System.out.println("sourceList.subList(2, 5) 得到List ：");
        System.out.println("subList ： "+subList);

        sourceList.add("666");

        System.out.println("sourceList.add(666) 得到List ：");
        System.out.println("sourceList 11： "+sourceList);
        System.out.println("subList ： "+subList);
    }
}
