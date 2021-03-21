package com.gsq.learning;

import java.lang.reflect.Field;

public class Main12 {

    public static void main(String[] args) {
        try {
            //Class<?> aClass = Class.forName("com.gsq.learning.ClassForName");
            //System.out.println("----------------------------------------");

            Class<?> bClass = ClassLoader.getSystemClassLoader().loadClass("com.gsq.learning.ClassForName");
            Field filed = bClass.getField("staticFiled");
            Object o = filed.get(bClass);
            System.out.println("---------------------------------------- " );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class ClassForName {

    //静态代码块
    static {
        System.out.println("执行了静态代码块");
    }
    //静态变量
    public static String staticFiled = staticMethod();

    //赋值静态变量的静态方法
    public static String staticMethod(){
        System.out.println("执行了静态方法");
        return "给静态字段赋值了";
    }

}
