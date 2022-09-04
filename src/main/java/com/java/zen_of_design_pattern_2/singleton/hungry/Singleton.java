package com.java.zen_of_design_pattern_2.singleton.hungry;

public class Singleton {

    /**
     * 饿汉式单例: 表现相当饥渴, 所以就提前创建对象, 所以名为饿汉式单例;
     *      另外, 为保证线程安全, 所以singleton对象限制为static(禁止修改对象实例, 整个类只有一个该实例对象)和final(禁止修改对象指针)的
     */
    private static final Singleton singleton = new Singleton();

    /**
     * 构造器设为私有, 禁止在类外创建对象;
     *      另外, 因为是单例模式, 所以构造器只会被调用一次
     */
    private Singleton(){
        System.out.println("调用单例模式构造器...");
    }

    /**
     * 为保证单例, getSingleton()方法设置为static(类共享, 类中仅有一个该方法)
     *
     * @return
     */
    public static Singleton getSingleton(){
        return singleton;
    }

}