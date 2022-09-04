package com.java.zen_of_design_pattern_2.singleton.inner_class;

public class Singleton {

    /**
     * 静态内部类设为私有, 禁止外部创建对象
     *      静态内部类成员变量设为私有, 禁止外部调用
     */
    private static class SingletonHolder {
        private static Singleton singleton = new Singleton();
    }

    /**
     * 构造器设为私有, 禁止在类外创建对象;
     * 另外, 因为是单例模式, 所以构造器只会被调用一次
     */
    private Singleton() {
        System.out.println("调用单例模式构造器...");
    }

    public static Singleton getSingleton() {
        return SingletonHolder.singleton;
    }

}
