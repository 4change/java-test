package com.java.zen_of_design_pattern_2.singleton.lazy;

public class Singleton {

    /**
     * 懒汉式单例: 表现为懒散的, 不着急在一开始创建对象, 而是将创建对象的过程放在后面, 故名为懒汉式单例.
     *      另外, 为保证线程安全, 故singleton对象限制为static(禁止修改对象实例, 整个类仅有一个对象)的.
     */
    private static Singleton singleton = null;

    /**
     * 构造器设为私有, 禁止在类外创建对象;
     *      另外, 因为是单例模式, 所以构造器只会被调用一次
     */
    private Singleton(){
        System.out.println("调用单例模式构造器...");
    }

    /**
     * 为保证单例, getSingleton()方法设置为static(类共享, 类中仅有一个该方法)的
     * 为保证线程安全, getSingleton()方法设置为synchronized(加锁, 保证同步)
     *
     * @return
     */
    public static synchronized Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
